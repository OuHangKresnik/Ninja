#Notice, it's for python 2.x
from bs4 import BeautifulSoup
import urllib2
import requests
import re
import csv
import sys
from dateutil.parser import parse

'''
Web site structure:
It's a seach result which includes start page number (start=?) and item count (count=80)
The sub pages which contains info have the form: 
    "www.sec.gov/Archives/edgar/data/.../.../..-index.htm"
    and
    'www.sec.gov/Archives/edgar/data/.../.../...(htm | txt)' which is under above sub page
1. The range of year is 1994 - 2015, so the search will be divided by year.
2. The search result can only show at most 4000 items.
3. The count of items per page is 80 by default.
If any of above conditions changes, the program should change correspondingly.
'''
class Spider():
    weblink_regex = re.compile('<a[^>]+href=["\'](.*?)["\']', re.IGNORECASE)
    number_regex = re.compile('\d+')
    url_template = 'http://www.sec.gov/cgi-bin/srch-edgar?text=N-Q'
    prefix = 'http://www.sec.gov'
    years = ['2015']
    #years = ['1994', '1995', '1996', '1997', '1998', '1999', '2000', '2001', '2002',
           # '2003', '2004', '2005', '2006', '2007', '2008', '2009', '2010', '2011', '2012',
           # '2013', '2014', 2015]
    item_num = 4000
    item_per_page = 80

    def get_html_source_code(self, url):
        #try:
            #html = urllib2.urlopen(url).read()
        html = requests.get(url, timeout=5).content
        #except urllib2.URLError as e:
         #   print 'Retrieve Error', e.reason
          #  html = None
        return html

    def get_all_link_from_html(self, html):
        return Spider.weblink_regex.findall(html)
    
    def retrieve_info(self, html, csv_writer, itemId): # Retrieve information from sub pages
        parser = BeautifulSoup(html)
        FillingDate = ''
        PeriodOfReport = ''
        formGrouping = parser.find('div', {'class' : 'formContent'}).find_all('div', {'class', 'formGrouping'})

        if len(formGrouping) == 2:
            FillingDate = formGrouping[0].find('div', {'class':'info'}).text.encode('utf-8')
            PeriodOfReport = formGrouping[1].find('div', {'class':'info'}).text.encode('utf-8')
        else:
            print 'The format is incorrect when getting the Filling Date and Period of Report'
        
        DateOfFiscalYearEnd = ''
        DateOfReportingPeriod = ''
        DateOfReportingPeriodStart = ''
        DateOfReportingPeriodEnd = ''
        docUrl = parser.find('table', {'class':'tableFile'}).find('a')['href']
        if '.htm' in docUrl:
            docHtmlText = self.get_html_source_code(Spider.prefix + docUrl).encode('utf-8')
            findDateOfFiscalYearEnd = re.findall(r'<B>Date of fiscal year end: (.*)? </B>',docHtmlText)
            if findDateOfFiscalYearEnd:
                DateOfFiscalYearEnd = parse(findDateOfFiscalYearEnd[0].replace('&nbsp;', ',')).strftime('%Y-%m-%d')
            findDateOfReportingPeriod = re.findall(r'<B>Date of reporting period: (.*)? </B>', docHtmlText)
            if findDateOfReportingPeriod:
                DateOfReportingPeriod = findDateOfReportingPeriod[0].replace('&nbsp;', ',')
                if ' &#150; ' in DateOfReportingPeriod:
                    TwoParts = DateOfReportingPeriod.split(' &#150; ')
                    DateOfReportingPeriodStart = parse(TwoParts[0]).strftime('%Y-%m-%d')
                    DateOfReportingPeriodEnd = parse(TwoParts[1]).strftime('%Y-%m-%d')
                else:
                    DateOfReportingPeriod = parse(DateOfReportingPeriod).strftime('%Y-%m-%d')
        elif '.txt' in docUrl: # Notice, if there isn't a year, by default is 2015, be careful
            docHtml = self.get_html_source_code(prefix + docUrl).encode('utf-8')
            findDateOfFiscalYearEnd = re.findall(r'DATE OF FISCAL YEAR END: (.*)?\n', docHtml)
            if findDateOfFiscalYearEnd:
                DateOfFiscalYearEnd = parse(findDateOfFiscalYearEnd[0].replace('&nbsp;', ',')).strftime('%Y-%m-%d')
            findDateOfReportingPeriod = re.findall(r'DATE OF REPORTING PERIOD: (.*)?\n', docHtml)
            if findDateOfReportingPeriod:
                DateOfReportingPeriod = findDateOfReportingPeriod[0].replace('&nbsp;', ',')
                if ' &#150; ' in DateOfReportingPeriod:
                    TwoParts = DateOfReportingPeriod.split(' &#150; ')
                    DateOfReportingPeriodStart = parse(TwoParts[0]).strftime('%Y-%m-%d')
                    DateOfReportingPeriodEnd = parse(TwoParts[1]).strftime('%Y-%m-%d')
                else:
                    DateOfReportingPeriod = parse(DateOfReportingPeriod).strftime('%Y-%m-%d')
        
        seriesDiv = parser.find('div', {'id':'seriesDiv'})
        if not seriesDiv == None:
            tdsInTable = seriesDiv.find_all('td')
            CIKs = []
            Names = []
            for td in tdsInTable:
                if td.has_attr('class'):
                    if td['class'] == ['CIKname']:
                        CIKs.append(td.text.encode('utf-8').replace('CIK ', '').strip())
                    if td.has_attr('colspan') and td.has_attr('scope'):
                        if td['class'] == ['seriesCell'] and td['colspan'] == '2' and td['scope'] == 'row':
                            Names.append(td.text.encode('utf-8').strip())
            for k in range(0, len(Names)):
                csv_writer.writerow([
                    itemId,
                    FillingDate,
                    PeriodOfReport,
                    CIKs[k],
                    Names[k],
                    DateOfFiscalYearEnd,
                    DateOfReportingPeriod,
                    DateOfReportingPeriodStart,
                    DateOfReportingPeriodEnd])
        Name = ''
        CIK = ''
        companyInfoDiv = parser.find('div', {'class':'companyInfo'})
        CIK = Spider.number_regex.findall(companyInfoDiv.span.a.text.encode('utf-8'))[0]
        TempText = companyInfoDiv.span.text.encode('utf-8')
        SubStringIndexStart = TempText.index('(') - 1
        Name = TempText[0:SubStringIndexStart]
        csv_writer.writerow([
            itemId,
            FillingDate,
            PeriodOfReport,
            CIK,
            Name,
            DateOfFiscalYearEnd,
            DateOfReportingPeriod])

    def crawl(self, csv_file_prefix):
        for year in Spider.years:
            f = open(csv_file_prefix + year + '.csv', 'w')
            csv_writer = csv.writer(f)
            csv_writer.writerow([
                'ID',
                'FillingDate',
                'PeriodOfReport',
                'CIK',
                'Name',
                'DateOfFiscalYearEnd',
                'DateOfReportingPeriod',
                'DateOfReportingPeriodStart',
                'DateOfReportingPeriodEnd'])
            start_id = 1
            for start in range(1, Spider.item_num, Spider.item_per_page):
                url = Spider.url_template + '&start=' + str(start) + '&count=' + str(Spider.item_per_page) + '&first=' + year + '&last=' + year
                html = self.get_html_source_code(url)
                allLinks = self.get_all_link_from_html(html)
                neededLinks = [k for k in allLinks if '/Archives/edgar/data/' in k and 'index.htm' in k]
                neededLinks = list(set(neededLinks)) # Eliminate duplicates
                for link in neededLinks:
                    print Spider.prefix + link
                    self.retrieve_info(self.get_html_source_code(Spider.prefix + link), csv_writer, start_id)
                    start_id += 1
                f.flush()
            f.close()


file_prefix = sys.argv[1]
Spider().crawl(file_prefix)
