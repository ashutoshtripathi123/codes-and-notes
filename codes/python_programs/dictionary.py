# dictionary is not ordered, so i cannot access it like accessing array element
# dictionary is to be used when element is saved in key-value format
# in dictionary we cannot do sorting/reversing because elements are not ordered
# dictionary can store any data type even a list or dictionary
list_x = [1, 2, 3, 4]
dic = {'key1': 'value1', 'key2': 2, 'key3': list_x, 'dictionary': {'key1': 10, 'key2': 20}}
print(dic)
print(dic['key1'])
print(dic['key3'][3])
print(dic['dictionary']['key1'])
