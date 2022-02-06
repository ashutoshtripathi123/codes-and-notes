import time
import threading


def calc_square(numbers):
    print("calculating Square of Numbers:")
    for num in numbers:
        time.sleep(0.3)
        print('Square: ', num * num)


def calc_cube(numbers):
    print("calculating Cube of Numbers:")
    for num in numbers:
        time.sleep(0.3)
        print('Cube: ', num * num * num)


arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

start = time.time()
# these do not work
# t1 = threading.Thread(target=calc_cube(arr))
# t2 = threading.Thread(target=calc_square(arr))
t1 = threading.Thread(target=calc_square, args=(arr,))
t2 = threading.Thread(target=calc_cube, args=(arr,))

t1.start()
t2.start()

# Join both the threads
t1.join()
t2.join()

print('total time taken = ', time.time() - start)
