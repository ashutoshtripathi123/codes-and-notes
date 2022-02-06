'''
zip function is used to club together 2 lists, and create tuple
of its values
'''

cities = ['Mumbai', 'Bangalore', 'Lucknow']
states = ['MH', 'KA', 'UP']
z = zip(cities, states)
for i in z:
    print(i)

