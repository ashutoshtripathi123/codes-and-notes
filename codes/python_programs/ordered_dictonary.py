from collections import OrderedDict
# dictionaries do not necessarily maintain orders
# in dictionary as long as the content is same, it will show true
d1 = {}
d1['a'] = 1
d1['b'] = 2
print(d1)
d2 = {}
d2['b'] = 2
d2['a'] = 1
print(d2)
print(d1 == d2)

print('x'*50)

# Now order is also considered
d1 = OrderedDict()
d1['a'] = 1
d1['b'] = 2
print(d1)
d2 = OrderedDict()
d2['b'] = 2
d2['a'] = 1
print(d2)
print(d1 == d2)




