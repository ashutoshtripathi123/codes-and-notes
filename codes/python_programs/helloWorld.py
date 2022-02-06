# example 1
email_message = 'Happy birthday dude'
message2 = 'Hows life bro !!!'
# sep means separate each string with ||
print(email_message, message2, sep='||', end='\n')

#example 2
guest = "john"
host = "sunny"
print('Hey {0} this is from {1}'.format(guest, host))
print(f'Hey {guest} this is from {host}') #f method

msg = 'hey {0} This is from {1}'
print(msg.format(guest, host))

#example 3
result = 555/33
print(result)
print('this is result - {r:1.3f}'.format(r = result)) #give only 3 numbers after decimal
