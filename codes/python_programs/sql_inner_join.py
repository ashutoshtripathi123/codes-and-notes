import sqlite3

path = "C:\\Users\\Anjali\\PycharmProjects\\udemy_bootcamp\\"
file_name = "storedb.db"

conn = sqlite3.connect(path+file_name)
cur = conn.cursor()

print('Dumping the storedb.....')
print("Customers........")
cur.execute('SELECT * FROM customers')
for row in cur:
    print(row)

print("Orders...........")
cur.execute('SELECT * FROM orders')
for row in cur:
    print(row)

print("Inner Join ...........")
query = '''SELECT customers.name, orders.name 
FROM customers INNER JOIN orders WHERE 
customers.customerId = orders.customerId
'''
cur.execute(query)
for row in cur:
    print(row)

conn.close()