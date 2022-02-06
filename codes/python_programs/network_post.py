'''
using urllib for posting data
-> defining the variable that we plan to POST to the url
-> pass value with POST request
-> request by urllib has python version in it, and server might block it treating it as foreign,
   hence its reqd. to modify the header
'''
import urllib.request, urllib.parse
# Example 1: This will fail because we have not provided header info
# and server treats it as some mallicious attack
print('########## Example 1 ###########################')
try:
    x = urllib.request.urlopen('https://www.google.com/search?q=python')
    print(x.read())
    outFile = open('C:\\Users\\Anjali\\PycharmProjects\\udemy_bootcamp\\read_from_google.txt', 'w')
    outFile.write(str(x.read()))
    outFile.close()
except Exception as e:
    print('Exception caught = ',str(e))
print('########## Example 2 ###########################')
url = 'https://www.google.com/search?q=python'
header = {}
header['User-Agent'] = "Mozilla/70.0 (X11; Win 13) Chrome/85.0.4183.83"
req = urllib.request.Request(url, headers=header)
resp = urllib.request.urlopen(req)
respData = resp.read()
outFile = open('C:\\Users\\Anjali\\PycharmProjects\\udemy_bootcamp\\read_from_google_modified_header.html', 'w')
outFile.write(str(respData))
print(respData)
outFile.close()