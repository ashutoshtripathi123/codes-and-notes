
import sys

def create_sqr(n):
    result = []

    for x in range(n):
        result.append(x**2)

    return result

print(create_sqr(10))

print(sys.getsizeof(create_sqr(10)))
print('x'*50)

def create_sqrG(n):
    for y in range(n):
        yield y**2

for x in create_sqrG(10):
    print(x)
print('size is: ')
print(sys.getsizeof(create_sqrG(10)))