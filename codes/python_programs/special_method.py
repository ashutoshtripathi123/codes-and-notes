my_list = [1, 2, 3]

print(len(my_list))


class MyClass():
    pass


myObj = MyClass()
# print(len(myObj)) # will give compilation error
print(myObj)  # will print address

print('x' * 50)


class Book():
    def __init__(self, title, author, page):
        self.title = title
        self.author = author
        self.page = page

    def __str__(self):
        return f' {self.title} book wriiten by {self.author} has {self.page} pages'

    def __len__(self):
        return self.page


myObj2 = Book('python', 'ashutosh', 45)
print(myObj2)
print(len(myObj2))