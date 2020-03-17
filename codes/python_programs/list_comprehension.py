word = 'string'
mylist = []

for letter in word:
    mylist.append(letter)
print(mylist)
print('x' * 50)
list_com = [letter for letter in word]
print(list_com)

list = [1, 2, 3, 4, 5, 6, 7, 8, 9]
list_com = [letter for letter in list]
print(list_com)

# this means, do the squaring only if member of list is present in below array
# this is an example of nested list comprehension
list_com = [(letter ** 2) for letter in list if letter in [7, 8, 10, 12, 11, 15]]
print(list_com)
