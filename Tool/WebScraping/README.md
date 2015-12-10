# Web Scraping
There are two libraries in python can do that: Scrapy and BeautifulSoup.  
The difference between them is that Scrapy is a full-scale web-spider while BeautifulSoup is an HTML parser.  
The learning curve of Scrapy is harder than BeautifulSoup  

1. Install libraries:  
	- install python3 in your mac: brew install python3
	- install BeautifulSoup: pip3 install BeautifulSoup4
	- bad thing is Scrapy doesn't support python 3 currently, so only can be installed for python 2.X
	- install Scrapy in python 2.x anyway: "pip install scrapy"  
		- notice: you may have to install: "pip install twisted" first  
		- "pip install w3lib"
		- "pip install lxml"
		- "pip install "
		- "pip install w3lib"
		- "pip install cssselect"
		- "pip install pyOpenSSL"
		- For 'ImportError: cannot import name xmlrpc_client', go to python and use:
		import sys  
		sys.path.remove('/System/Library/Frameworks/Python.framework/Versions/2.7/Extras/lib/python')"

	- install BeautifulSoup for python 2.x: pip install beautifulsoup

2. As my trial, because of the new version of mac os, the scrapy cannot work properly.
Switch to other libraries
3. Soooo new mac os with python 3 is a shit...go back to python 2.x
