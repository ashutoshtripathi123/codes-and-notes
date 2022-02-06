'''
for parsing HTML page we will use an existing library
called as beautiful soup
'''
from bs4 import BeautifulSoup
import ssl # precautionary
import urllib.request, urllib.parse, urllib.error
print("########## Example 1 ###########################")
# Parse an HTML page, read TAGS from that page
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

url = "http://www.google.com/"
html = urllib.request.urlopen(url, context=ctx).read()
soup = BeautifulSoup(html,"html.parser")

# retreive all the anchor tags
tags = soup('a')
for tag in tags:
    print(tag.get('href', None))

print("########## Example 2 ###########################")
# Parse the content of each tag
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

url = "https://docs.python.org/"
html = urllib.request.urlopen(url, context=ctx).read()
soup = BeautifulSoup(html,"html.parser")

# retreive all the anchor tags
tags = soup('a')
for tag in tags:
    print('TAG:', tag)
    print('URL:', tag.get('href', None))
    print("Contents:", tag.contents[0])
    print('Attrs:', tag.attrs)


