#creation of databases and tables

# import sqlite3

# connection = sqlite3.connect("student.db")
# cursor = connection.cursor()

# print("Database connected successfully!")

# sample = """
# CREATE TABLE IF NOT EXISTS students(
#     roll_no INTEGER PRIMARY KEY,
#     student_name TEXT NOT NULL,
#     group_name TEXT,
#     marks INTEGER
# )
# """

# connection.commit()

# print("Database created")


#insert data into tables

# import sqlite3

# connection = sqlite3.connect("student.db")
# cursor = connection.cursor()

# cursor.execute(sample)

# students = [
#     (101, "Aman", "CSE", 85),
#     (102, "Simran", "AI", 91)
# ]

# cursor.executemany("""
# INSERT INTO students
# (roll_no, student_name, group_name, marks)
# VALUES (?, ?, ?, ?)
# """, students)

# connection.commit()

# print("Students inserted successfully!")

# connection.close()



#read data from table
# import sqlite3

# connection = sqlite3.connect("student.db")
# cursor = connection.cursor()

# sample = """
# CREATE TABLE IF NOT EXISTS students(
#     roll_no INTEGER PRIMARY KEY,
#     student_name TEXT NOT NULL,
#     group_name TEXT,
#     marks INTEGER
# )
# """

# cursor.execute("SELECT * FROM students")

# students = cursor.fetchall()

# for student in students:
#     print(student)
# connection.close()


# import sqlite3
# connection = sqlite3.connect("student.db")
# cursor = connection.cursor()
# cursor.execute("""
# UPDATE students
# SET student_name = """)