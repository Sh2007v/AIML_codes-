import sqlite3

connection = sqlite3.connect("revision.db")
cursor = connection.cursor()

cursor.execute("""
    create table if not exists revision(
        roll_no integer primary key,
        student_name text not null,
        marks integer)
    """)

connection.commit()

connection.close()

print("Database created successfully")

