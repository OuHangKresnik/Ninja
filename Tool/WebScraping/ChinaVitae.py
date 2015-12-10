# Notice, it's for python 2.x
from bs4 import BeautifulSoup
import urllib2
import re
import csv
import sys

'''
There are only two layers from the main page.
The pattern of useful urls in www.chinavitae.com.
Start-page: http://www.chinavitae.com/biography_browse.php
Sub-page: http://www.chinavitae.com/biography_browse.php?l=a
Sub Page which is for individual:
    tice, it's for python 2.x
    from bs4 import BeautifulSoup
    import urllib2
    import re
    import csv 
    import sys 
    http://www.chinavitae.com/biography/Abdul_Abdulrixit
Pages that contains information:
    http://www.chinavitae.com/biography/Abdul_Abdulrixit/summary
    http://www.chinavitae.com/biography/Abdul_Abdulrixit/bio
    http://www.chinavitae.com/biography/Abdul_Abdulrixit/career
    http://www.chinavitae.com/biography/Abdul_Abdulrixit/travel
    http://www.chinavitae.com/biography/Abdul_Abdulrixit/full
Within these pages, the 'full' one contains all information
The crawler will stop at the 'full' page.
'''
class Spider():
    weblink_regex = re.compile('<a[^>]+href=["\'](.*?)["\']', re.IGNORECASE)
    prefix = 'http://www.chinavitae.com'
    start_url = 'http://www.chinavitae.com/biography_browse.php'
    sub_page_regex = re.compile('.*/biography_browse\.php\?l=[a-z]?', re.IGNORECASE)
    individual_page_regex = re.compile('.*/biography/.*', re.IGNORECASE)
    full_info_page_regex = re.compile('.*/biography/.*/full', re.IGNORECASE)

    def get_html_source_code(self, url):
        try:
            html = urllib2.urlopen(url).read()
        except urllib2.URLError as e:
            print 'Retrieve Error', e.reason
            html = None
        return html

    def get_all_link_from_html(self, html):
        return ChinaVitaeSpider.weblink_regex.findall(html)

    '''
    Information that is needed:
    name: <div class='bioName'>...<span />...</div>
    year of birth: <div class='bioDetails'><b>Born: </b>yyyy</div>
    loc of birth: <div class = 'bioDetails'><b>Birthplace: <a ...>XXX</a>, <a>XXX</a></b>
    gender: inside Biography
    Nationality: inside Biography
    Career data: including year, title, department and organization
    '''
    def retrieve_info(self, html, csv_writer):
        parser = BeautifulSoup(html, from_encoding='utf-8')
        name = parser.find('div', {'class':'bioName'})
        CNameUtf8 = ''
        ENameUtf8 = ''
        if not name.span == None:
            CNameUtf8 = name.span.text.encode('utf-8')
            ENameUtf8 = re.sub(CNameUtf8, '', name.text.encode('utf-8'))
        else:
            ENameUtf8 = name.text.encode('utf-8')
        
        utf8text = parser.text.encode('utf-8')
        BirthYear = ''
        BirthLoc = ''
        BirthCounty = ''
        BirthProvince = ''
        BirthRegion = ''
        BirthCity = ''
        Gender = ''

        if not 'Information on this official is limited' in utf8text:
            bioDetails = parser.findAll('div', {'class':'bioDetails'})
            if bioDetails:
                yearInBio = re.findall(r'\d+', bioDetails[0].text.encode('utf-8'))
                if len(bioDetails) == 1:
                    if yearInBio:
                        BirthYear = yearInBio[0]
                    else:
                        BirthLoc = bioDetails[0].text.encode('utf-8').split(': ')[1]
                else:
                    BirthYear = yearInBio[0]
                    BirthLoc = BirthLoc = bioDetails[1].text.encode('utf-8').split(': ')[1]

                birthLocs = BirthLoc.split(', ')
                for s in birthLocs:
                    if 'Province' in s:
                        BirthProvince = s
                    if 'County' in s:
                        BirthCounty = s
                    if 'Region' in s:
                        BirthRegion = s
                    if 'City' in s:
                        BirthCity = s
        
        Gender = ''
        if 'male' in utf8text:
            Gender = 'male'
        elif 'female' in utf8text:
            Gender = 'female'

        Nationality = ''
        nationalityReFindings = re.findall(r',.*,(.*)?nationality,', utf8text)
        if nationalityReFindings:
            Nationality = nationalityReFindings[0]
        
        careerDetailTable = parser.find('table', attrs={'cellpadding':0}).find_all('tr')
        for table_row in careerDetailTable:
            table_cols = table_row.find_all('td')
            CareerYr = table_cols[0].text.encode('utf-8')
            StartYr = ''
            EndYr = ''
            if not '\xe2\x80\x94' in CareerYr:
                StartYr = CareerYr
                EndYr = CareerYr
            else:
                careerYrs = CareerYr.split('\xe2\x80\x94')
                if len(careerYrs) == 2:
                    StartYr = careerYrs[0]
                    EndYr = careerYrs[1]
                elif CareerYr.startswith('\xe2\x80\x94'):
                    EndYr = CareerYr
                else:
                    StartYr = CareerYr
            CareerDetail = table_cols[1].text.encode('utf-8')
            careerDetails = CareerDetail.split(', ')
            Title = careerDetails[0]
            
            Loc = ''
            LocProvince = ''
            LocCity = ''
            LocRegion = ''
            LocCounty = ''

            for s in careerDetails:
                if 'Region' in s:
                    LocRegion = s
                    Loc += ', ' + LocRegion
                if 'County' in s:
                    LocCounty = s
                    Loc += ', '
                    Loc += LocCounty
                if 'City' in s:
                    LocCity = s
                    Loc += ', ' + LocCity
                if 'Province' in s:
                    LocProvince = s
                    Loc += ', ' + LocProvince
            csv_writer.writerow([CNameUtf8, ENameUtf8, BirthYear, Gender, Nationality,BirthLoc,
                BirthCounty, BirthProvince, BirthRegion, CareerYr, StartYr, EndYr, Title,
                CareerDetail, Loc, LocProvince, LocCity, LocCounty, LocRegion])

    def crawl(self, csv_file_name):
        f = open(csv_file_name, 'w')
        csv_writer = csv.writer(f)
        csv_writer.writerow([
            'EnglishName',
            'ChineseName',
            'BirthYr',
            'Gender',
            'Nationality',
            'BirthLoc',
            'BirthCounty',
            'BirthProvince',
            'BirthRegion',
            'CareerYr',
            'StartYr',
            'EndYr',
            'Title',
            'CareerDetail',
            'Loc',
            'LocProvince',
            'LocCity',
            'LocCounty'
            'LocRegion'])
        queue = [ChinaVitaeSpider.start_url]
        visited = []
        while queue:
            url = queue.pop()
            if not url in visited:
                visited.append(url)
                if ChinaVitaeSpider.full_info_page_regex.findall(url): # Retrieve information
                    print url
                    html = self.get_html_source_code(ChinaVitaeSpider.prefix + url)
                    self.retrieve_info(html, csv_writer)
                if ChinaVitaeSpider.start_url == url:
                    queue.extend(self.get_all_link_from_html(self.get_html_source_code(url)))
                if ChinaVitaeSpider.sub_page_regex.findall(url): # Add links into queue
                    html = self.get_html_source_code(ChinaVitaeSpider.prefix + url)
                    queue.extend(self.get_all_link_from_html(html))
                if ChinaVitaeSpider.individual_page_regex.findall(url): # Add links into queue
                    html = self.get_html_source_code(ChinaVitaeSpider.prefix + url)
                    queue.extend(self.get_all_link_from_html(html))
        f.close()

fileName = sys.argv[0]
Spider().crawl(fileName) 
