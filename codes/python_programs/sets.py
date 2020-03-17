# sets are un-ordered, and store unique values


s = {1, 2, 3, 4, 5, 'one'}

print(type(s))

empty_set = {}
print(type(empty_set))  # this will print dict

new_empty_set = set()
print(type(new_empty_set))  # this will print set

s = {1,1,2,2,3,3,4,4,5,5,6,6,'one','one'}
print(s)

s.add(9)

print(s)