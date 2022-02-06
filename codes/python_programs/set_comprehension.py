'''
set in python is similar to set in cpp, it stores unique elements, in increasing order
'''

s = set ([1,2,3,4,5,1,11,10,13,3,8,6,4]) # passing a list in a set

print(s)
even = {i for i in s if i % 2 == 0}
print(even)

## another way to create set
a = set()
a.add(1)
print(type(a))
print("###############################")
number = [6,4,2,1,1,2,4,6]
unique = set(number)
print(unique)
print("###############################")
for i in unique :
    print(i)

#frozenset is similar to set, only addition is that we cannot modify the set
fs = frozenset(number)
#fs.add(5) #this operation will cause compilation to fail
# we can perform union(|), intersection(&), diff(-) operation on set