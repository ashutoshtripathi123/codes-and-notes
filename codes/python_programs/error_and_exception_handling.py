numA = int(input('input number A'))
numB = int(input('input number B'))
numC = int(input('input number C'))

try:
    if numA < numB and numA < numC:
        print(f'{numA} is the smallest compared to {numB} and {numC}')
    elif numB < numA and numB < numC:
        print(f'{numB} is the smallest compared to {numA} and {numC}')
    else:
        print(f'{numC} is the smallest compared to {numA} and {numB}')
except:
    print('There is an execption')

else:  # this means else condition will always run if there is no exception
    # so, whenever try block runs, this will run  as well
    Avg = (numC + numA + numB) / 3
    print(f'avergae = {Avg}')

finally: # this will always run, no matter try/exception runs or not
    square = (numA+numB+numC)**2
    print(f'square = {square}')