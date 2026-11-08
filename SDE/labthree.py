import sqlite3

connection = sqlite3.connect("academic.db")
cursor = connection.cursor()

cursor.execute("""
Create table if not exists Departments(
DeptID integer primary key,
DeptName text not null
)
""")

cursor.execute("""
Create table if not exists Students(
StudentID integer primary key,
StudentName text not null,
DeptID integer,
foreign key(DeptID) references Departments(DeptID)
)
""")

cursor.execute("""
Create table if not exists Results(
ResultID integer primary key,
StudentID integer,
Subject text not null,
Marks integer,
foreign key(StudentID) references Students(StudentID)
)
""")

# cursor.execute("DELETE FROM Results")
# cursor.execute("DELETE FROM Students")
# cursor.execute("DELETE FROM Departments")

s_record = [
    (1 , "CSE"),
    (2 , "AI & ML"),
    (3 , "ECE"),
    (4 , "Mechanical")
]

cursor.executemany("""
INSERT INTO Departments VALUES(? , ?)
""" , s_record)

cursor.executemany("""
Insert into Students values(? , ? , ?)
""" , [
    (101 , "Aman" , 1),
    (102 , "Simran" , 2),
    (103 , "Rahul" , 1),
    (104 , "Priya" , 3),
    (105 , "Karan" , None)
])

cursor.executemany("""
Insert into Results values (?,?,?,?)
""" , [
    (1 , 101 , "Python" , 85),
    (2 , 101 , "DBMS" , 90),
    (3 , 102 , "Python" , 78),
    (4 , 103 , "Python" , 66),
    (5 , 106 , "Python" , 72)
])

connection.commit()
print("Academic database created succesfully!")
connection.close()