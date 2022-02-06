import math
import calendar

print(math.sqrt(25))
print(math.pow(2, 3))
print('These functionality are available in math library', dir(math))
print('These functionality are available in calendar library', dir(calendar))

#print March month of 2018
cal = calendar.month(2018, 3)
print(cal)