def func():
    print('this function is in one.py')


print('This is global print in one.py')

if __name__ == "__main__":
    print('one.py is being run direclty')
else:
    print('one.py is being imported')