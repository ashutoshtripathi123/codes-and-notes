# list is ordered sequence of object
list_1 = [1, 2, 3, 4]
print(list_1)
list_2 = ['zero', 'one', 'two', 'three']
print(list_2)
print(list_2[1])  # get second element from the list
print(list_2[1:3])  # take 2 elements from 1 to 3
# append attaches to the list at the end, and pop removes the last element from the list

list_3 = list_1 + list_2  # concat two lists
print(list_3)

list_4 = [6, 3, 1, 5, 2, 4]
list_4.sort()
print(list_4)
list_4.reverse()
print(list_4)
