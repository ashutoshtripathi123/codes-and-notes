import time
import multiprocessing


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


if __name__ == "__main__":  # this is required to know what is the starting point
    arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    p1 = multiprocessing.Process(target=calc_square, args=(arr,))
    p2 = multiprocessing.Process(target=calc_cube, args=(arr,))

    # Start the process
    p1.start()
    p2.start()

    p1.join()
    p2.join()
    print("Done")
