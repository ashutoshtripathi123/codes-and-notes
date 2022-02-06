import re
# example 1: search for a line that contains "Ques"
f = open("some_text", "r")
for line in f:
    line = line.rstrip() # removes any trailing special characters
    if re.search("Ques", line):
        print(line)
f.close()

# example 2: search for a line that starts with "Ques". ^ is called as caret
f = open("some_text", "r")
for line in f:
    line = line.rstrip() # removes any trailing special characters
    if re.search("^Ques", line):
        print(line)
f.close()

# example 3: search for a line that starts with 'Q' follwed by 2 characters, followed by 's'
f = open("some_text", "r")
for line in f:
    line = line.rstrip() # removes any trailing special characters
    if re.search('Q..s', line):
        print(line)
f.close()

# example 4: findall is used to extract a sequence
str = "Voice message from abc@gmail.com to xyz@yahoo.com about meeting @5PM"
# now i need to extract email addressed from the above string
mylist = re.findall('\S+@\S+', str)
print(mylist)


