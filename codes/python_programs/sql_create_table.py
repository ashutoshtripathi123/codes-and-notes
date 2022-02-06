import sqlite3
# connect: connects to DB
# cursor(): file handle, used for operations on rows
#execute(): executes commands on the content of DB
#close(): close the connection

print("########## Example 1 - Creation of DB ###########################")
# DB can be created even on "DB Browser for SQLite" software
db_dir = "C:\\Users\\Anjali\\PycharmProjects\\udemy_bootcamp\\"
db_name = "study.sqlite"
conn = sqlite3.connect(db_dir + db_name)
cur = conn.cursor()

# Drop tables if it exists
cur.execute('DROP TABLE IF EXISTS movies')
cur.execute('CREATE TABLE movies (id INTEGER PRIMARY KEY, name TEXT, duration INTEGER)')
conn.close()

print("########## Example 2 - Inserting in DB ###########################")
# Insert into DB
db_dir = "C:\\Users\\Anjali\\PycharmProjects\\udemy_bootcamp\\"
db_name = "study.sqlite"
conn = sqlite3.connect(db_dir + db_name)
cur = conn.cursor()
cur.execute('INSERT INTO MOVIES (name, duration) VALUES (?, ?)',
            ('Lagaan', 4))
cur.execute('INSERT INTO MOVIES (name, duration) VALUES (?, ?)',
            ('Titanic', 4.5))
cur.execute('INSERT INTO MOVIES (name, duration) VALUES (?, ?)',
            ('Andaaz Apna Apna', 2.5))
cur.execute('INSERT INTO MOVIES (name, duration) VALUES (?, ?)',
            ('Jodhaa Akbar', 2.5))
conn.commit()
print("########## Example 3 - Reading from DB ###########################")
print('\nLets check all entries of DB:')
cur.execute('SELECT * FROM movies')
for row in cur:
    print(row)

print('\nWhere Clause')
cur.execute('SELECT * FROM movies WHERE duration = ? ', (2.5,)) # Notice this comma
for row in cur:
    print(row)

print('\n Limit Clause') # Gives first entry which matches the condition
cur.execute('SELECT * FROM movies WHERE duration = ? LIMIT 1 ', (2.5, )) # Notice this comma
for row in cur:
    print(row)

print('\n Order By Clause')
cur.execute('SELECT * FROM movies ORDER BY name ')
for row in cur:
    print(row)
print("########## Example 4 - Updating DB ###########################")
print('\n Update ')
cur.execute('UPDATE movies SET name = ? WHERE name = ?',
            ('Taare Zameen Par', "Titanic"))
conn.commit()
print('\nLets check all entries of DB:')

cur.execute('SELECT * FROM movies')
for row in cur:
    print(row)
print("########## Example 5 - Deleting from DB ###########################")
cur.execute('DELETE FROM movies WHERE name = ?', ('Jodhaa Akbar',))
conn.commit()
print('\nLets check all entries of DB:')

cur.execute('SELECT * FROM movies')
for row in cur:
    print(row)

conn.close()

















