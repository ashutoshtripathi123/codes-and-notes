# dict1 holds list/set/dictionary, string and int data type
dict1 = {'k1':[2,3,4], 'k2':(1,2), 'k3':{'key1':1, 'key2':2}, 'k4':"string", 'k5':5}

print(dict1)
print(dict1['k3']['key2'])

print('x'*50)

# in dict2, "i:i**2" is the key-value pair, and
# "for i in range(10)" is the expression applied on key-value pair
dict2 = {i:i**2 for i in range(10)}
print(dict2)

# iterating through dictionary entries
for x in dict2.items():
    print(f'full is {x} and first value is {x[0]}')

print('keys:')
for x in dict2.keys():
    print(x)

print('Values:')
for x in dict2.values():
    print(x)

print('key-value pair:')
for x,y  in dict2.items():
    print(x,y)