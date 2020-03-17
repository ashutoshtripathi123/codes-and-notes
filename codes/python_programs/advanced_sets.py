# sets hold unique elements
s = set()
s.add(1)
s.add(2)
s.add(1)
print(s)
s_copy = s.copy()
s_copy.add(4)
print(s_copy)
print('x'*50)
s_diff = s.difference(s_copy) # this will be empty, because main set is smaller than passed one
print(s_diff)
s_diff = s_copy.difference(s)
print(s_diff)
print('x'*50)
s1 = {3,4}
s2 = {4,5}

s_union = s1.union(s2)
print(f'Union is {s_union}')
s_intersection = s1.intersection(s2)
print(f'Intersection is {s_intersection}')



