import urllib.request
print('########## Example 1 ###########################')
x = urllib.request.urlopen("https://www.google.com/")
print(x.read())
print('########## Example 2 ###########################')
import urllib.request as ul
fh = ul.urlopen("http://data.pr4e.org/romeo.txt")
for line in fh:
    #print(line) # prints an extra b' and \n
    print(line.decode().strip())
print('########## Example 3 ###########################')
# using urllib to download an image
# Option 1: if image is small download it in one go
imgUrl = "https://www.python.org/static/community_logos/python-logo-master-v3-TM.png"
img = ul.urlopen(imgUrl).read() #read() reads everything in one go
fpath = "C:\\Users\\Anjali\\PycharmProjects\\udemy_bootcamp\\"
outputFile = "pythonLogo.png"
fout = open(fpath+outputFile,"wb") #wb because this is of binary format
fout.write(img)
fout.close()
print("Downloading Done............")

# Option 2: If image is huge then download it in parts, and then merge it locally
print('########## Example 4 ###########################')
imgUrl = "http://data.pr4e.org/cover3.jpg"
img = ul.urlopen(imgUrl)
fpath = "C:\\Users\\Anjali\\PycharmProjects\\udemy_bootcamp\\"
outputFile = "my_cover.jpg"
fout = open(fpath+outputFile, 'wb')

count = 0
while True:
    info = img.read(10000) #reading 10000 chars from img
    if len(info)<1:
        break
    count += len(info)
    fout.write(info)

print("Characters copied : ", count)
fout.close()
print("Downloading in parts completed.........")














