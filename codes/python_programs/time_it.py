# this code will give the computation time required
# to execute program

import timeit
print('-'.join(str(n) for n in range(100)))

# syntax for timeit is: expression = code, number of time = 100

print(timeit.timeit("'-'.join(str(n) for n in range(100))", number=100))







