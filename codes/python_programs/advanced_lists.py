l = [1,2,3]
l.append(4)
print(f'After append {l}')
l.pop()
print(f'After pop {l}')
l.append([5,6])
print(f'After append {l}')
l.pop()
print(f'After pop {l}') # will pop [5,6]
l.append({'k1':1, 'k2':2})
print(f'After append {l}')
print(f'Count of 2 = {l.count(2)}')

# Extend can be used to add a lot of values in one shot
l.extend([4,5,6,7,8,9])
print(f'After extend {l}')

print(f'Index for 6 is {l.index(6)}')