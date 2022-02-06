import numpy as np

a = np.array([1,2,3,4])
b = np.array([5,6,7,8])
c = a + b
print("Addition of Array = ", c)
c = a * b
print("Multiplication of Array = ", c)

# 2-dimensional array
a = np.array([[1,2], [3,4], [5,6]])
print(a)

# to get itemsize
print(a.itemsize) # in this case it will print 4
# to get dimensions
print(a.ndim) # in this case it will print 2
# to print datatype
print(a.dtype) # in this case it will print int32

# a.reshape(6,1) # this will convert the matrix to 6 rows and 1 column
# a.ravel() # this will flaten the array to 1 dimensional
# a.min() # returns 1
# a.max() # returns 6
# print(a[0,1]) # returns 0th row, 1th column
# a.flat can be used in for loop for printing all elements of array


# to create an array of float type
a = np.array([[1,2], [3,4], [5,6]], dtype=np.float64)






