# json stands for java script object notation,
# basically used for data exchange between server-client

##### Step 1 create a json
person = dict()
person['ashu'] = {
    "name" : "Ashu",
    "address" : "Mumbai",
    "gender" : "Male"
}

person['anju'] = {
    "name" : "Anju",
    "address" : "Bengaluru",
    "gender" : "Female"
}

person['ajju'] = {
    "name" : "Arjun",
    "address" : "Pune",
    "gender" : "Male"
}

import json
string_of_json = json.dumps(person)
print(string_of_json)

##### Step 2 - create a file and write into it
base_path = "C:\\Users\\Anjali\\PycharmProjects\\udemy_bootcamp\\"
file_name = "json_to_file.txt"

f = open(base_path + file_name, "w")
f.write(string_of_json)
f.close()

##### Step 3 : Now open the above created json file, read its content

fread = open(base_path + file_name, "r")
json_to_string = fread.read()
print("json_to_string = ", json_to_string)

# load data from a json to a dictionary
member = json.loads(json_to_string)
print("complete member dictionary = ", member)

print("ashu = ", member["ashu"])
print("anju = ", member["anju"])
print("ajju = ", member["ajju"])
print("ashu's address = ", member["ashu"]["address"])
fread.close()






