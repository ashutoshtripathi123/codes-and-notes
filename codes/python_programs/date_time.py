import datetime

t = datetime.time(2,25,30)
print(t)

print(datetime.time.min)
print(datetime.time.max)
print(datetime.time.resolution)

today = datetime.date.today()
print(today)
print(today.timetuple())

print(datetime.date.min)
print(datetime.date.max)
print(datetime.date.resolution)

print('x'*50)

dob = datetime.date(1987, 11, 23)
age = today - dob
print(age)

