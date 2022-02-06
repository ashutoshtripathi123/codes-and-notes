'''
mode value can be: r,w,r+,w+,a
'''

### please delete the below file before running the below code

base_path = "C:\\Users\\Anjali\\PycharmProjects\\udemy_bootcamp\\"
file_name = "test.txt"

f1 = open(base_path + file_name, "a")
f1.write("My first file from python bootcamp")
f1.write("\n")
f1.write("I also code in cpp")
f1.close()

### now we will read from the file
print("\n###############################\n")
f2 = open(base_path + file_name, "r")
print(f2.read())
f2.close()

### if the file size is huge then it is recommended to read line by line
print("\n###############################\n")
f3 = open(base_path + file_name, "r")
for line in f3:
    print(line, end=" ")
f3.close()
print("\n")
################ split example: using <space> as split, and create array from each line
print("\n###############################\n")
f4 = open(base_path + file_name, "r")
for line in f4:
    tokens = line.split(" ")
    print(tokens)
    print(len(tokens))
f4.close()

print("\n###############################\n")
### 'with' if we use this keyword then we need not close the file
with open(base_path + file_name, "r") as f:
    print(f.read())

print(f.closed) ###this is to print the status of the file, whether it is closed or not



