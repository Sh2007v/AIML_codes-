# -- create table Dim_Date(
# --     Date_ID int primary key,
# --     Full_Date date,
# --     Month varchar(20),
# --     Quarter varchar(10),
# --     Year int
# -- );

# -- create table Dim_Product(
# --     Product_ID int primary key,
# --     Product_Name varchar(100),
# --     Category varchar(50),
# --     Brand varchar(50)
# -- );

# -- create table Dim_Customer(
# --     Customer_ID int primary key,
# --     Customer_Name varchar(100),
# --     City varchar(50),
# --     State varchar(100)
# -- );

# -- create table Fact_Sales(
# --     Sales_ID int primary key,
# --     Date_ID int,
# --     Product_ID int,
# --     Customer_ID int,
# --     Quantity int,
# --     Sales_Amount decimal(10,2),
# --     foreign key (Date_ID) references Dim_Date(Date_ID),
# --     foreign key (Product_ID) references Dim_Product(Product_ID),
# --     foreign key (Customer_ID) references Dim_Customer(Customer_ID)
# -- );

# -- insert into Dim_Date values
# -- (1,'2026-01-10','January','Q1',2026),
# -- (2,'2026-02-15','February','Q1',2026),
# -- (3,'2026-03-20','March','Q1',2026);

# -- insert into Dim_Product values
# -- (101,'Laptop','Electronics','HP'),
# -- (102,'Mobile','Electronics','Samsung'),
# -- (103,'Chair','Furniture','Godrej');

# -- insert into Dim_Customer values
# -- (201,'Aman','Patiala','Punjab'),
# -- (202,'Riya','Chandigarh','Chandigarh'),
# -- (203,'Karan','Ludhiana','Punjab');

# -- insert into Fact_Sales values
# -- (1,1,101,201,2,1000000),
# -- (2,2,102,202,3,600000),
# -- (3,3,103,203,5,25000),
# -- (4,1,102,201,1,20000),
# -- (5,2,101,203,1,50000);





# -- ---tasks
# -- --1 cutomer and product info
# -- select s.Sales_ID, d.Full_Date, c.Customer_Name, c.City,
# --        p.Product_Name, p.Category, s.Quantity, s.Sales_Amount
# -- from Fact_Sales s
# -- join Dim_Date     d on s.Date_ID     = d.Date_ID
# -- join Dim_Customer c on s.Customer_ID = c.Customer_ID
# -- join Dim_Product  p on s.Product_ID  = p.Product_ID
# -- order by s.Sales_ID;

# -- --2 City-wise sales
# -- select c.City, sum(s.Sales_Amount) as Total_Sales
# -- from Fact_Sales s
# -- join Dim_Customer c on s.Customer_ID = c.Customer_ID
# -- group by c.City
# -- order by Total_Sales desc;

# -- ---3 Category wise sales
# -- select p.Category, sum(s.Sales_Amount) as Total_Sales
# -- from Fact_Sales s
# -- join Dim_Product p on s.Product_ID = p.Product_ID
# -- group by p.Category
# -- order by Total_Sales desc;

# -- --4 Monthly sales
# -- select d.Month, sum(s.Sales_Amount) as Total_Sales
# -- from Fact_Sales s
# -- join Dim_Date d on s.Date_ID = d.Date_ID
# -- group by d.Month, d.Date_ID
# -- order by d.Date_ID;

# -- --5 top selling product by quantity
# -- select p.Product_Name, sum(s.Quantity) as Total_Quantity
# -- from Fact_Sales s
# -- join Dim_Product p on s.Product_ID = p.Product_ID
# -- group by p.Product_ID, p.Product_Name
# -- order by Total_Quantity desc
# -- limit 1;



# import sqlite3

# connection = sqlite3.connect("mydatabase.db")
# cursor = connection.cursor()

# cursor.execute("DROP TABLE IF EXISTS Fact_Sales")
# cursor.execute("DROP TABLE IF EXISTS Dim_Date")
# cursor.execute("DROP TABLE IF EXISTS Dim_Product")
# cursor.execute("DROP TABLE IF EXISTS Dim_Customer")

# ---Dimension Tables
# cursor.execute("""
# CREATE TABLE Dim_Date (
#     Date_ID INT PRIMARY KEY,
#     Full_Date DATE,
#     Month VARCHAR(20),
#     Quarter VARCHAR(10),
#     Year INT
# );
# """)

# cursor.execute("""
# CREATE TABLE Dim_Product (
#     Product_ID INT PRIMARY KEY,
#     Product_Name VARCHAR(100),
#     Category VARCHAR(50),
#     Brand VARCHAR(50)
# );
# """)

# cursor.execute("""
# CREATE TABLE Dim_Customer (
#     Customer_ID INT PRIMARY KEY,
#     Customer_Name VARCHAR(100),
#     City VARCHAR(50),
#     State VARCHAR(50)
# );
# """)

# ---Fact Table
# cursor.execute("""
# CREATE TABLE Fact_Sales (
#     Sales_ID INT PRIMARY KEY,
#     Date_ID INT,
#     Product_ID INT,
#     Customer_ID INT,
#     Quantity INT,
#     Sales_Amount DECIMAL(10,2),

#     FOREIGN KEY (Date_ID) REFERENCES Dim_Date(Date_ID),
#     FOREIGN KEY (Product_ID) REFERENCES Dim_Product(Product_ID),
#     FOREIGN KEY (Customer_ID) REFERENCES Dim_Customer(Customer_ID)
# );
# """)

# cursor.execute("""
# INSERT INTO Dim_Date VALUES
# (1, '2026-01-10', 'January', 'Q1', 2026),
# (2, '2026-02-15', 'February', 'Q1', 2026),
# (3, '2026-03-20', 'March', 'Q1', 2026);
# """)

# cursor.execute("""
# INSERT INTO Dim_Product VALUES
# (101, 'Laptop', 'Electronics', 'HP'),
# (102, 'Mobile', 'Electronics', 'Samsung'),
# (103, 'Chair', 'Furniture', 'Godrej');
# """)

# cursor.execute("""
# INSERT INTO Dim_Customer VALUES
# (201, 'Aman', 'Patiala', 'Punjab'),
# (202, 'Riya', 'Chandigarh', 'Chandigarh'),
# (203, 'Karan', 'Ludhiana', 'Punjab');
# """)

# cursor.execute("""
# INSERT INTO Fact_Sales VALUES
# (1, 1, 101, 201, 2, 100000),
# (2, 2, 102, 202, 3, 60000),
# (3, 3, 103, 203, 5, 25000),
# (4, 1, 102, 201, 1, 20000),
# (5, 2, 101, 203, 1, 50000);
# """)

# connection.commit()

# --1
# cursor.execute("""
# SELECT 
#     f.Sales_ID,
#     c.Customer_Name,
#     c.City,
#     c.State,
#     p.Product_Name,
#     p.Category,
#     p.Brand,
#     f.Quantity,
#     f.Sales_Amount
# FROM Fact_Sales f
# JOIN Dim_Customer c ON f.Customer_ID = c.Customer_ID
# JOIN Dim_Product p ON f.Product_ID = p.Product_ID;
# """)

# rows = cursor.fetchall()

# for row in rows:
#     print(row)

# --2
# cursor.execute("""
# SELECT 
#     c.City,
#     SUM(f.Sales_Amount) AS Total_Sales
# FROM Fact_Sales f
# JOIN Dim_Customer c ON f.Customer_ID = c.Customer_ID
# GROUP BY c.City;
# """)

# rows = cursor.fetchall()

# for row in rows:
#     print(row)

# --3
# cursor.execute("""
# SELECT 
#     p.Category,
#     SUM(f.Sales_Amount) AS Total_Sales
# FROM Fact_Sales f
# JOIN Dim_Product p ON f.Product_ID = p.Product_ID
# GROUP BY p.Category;
# """)

# rows = cursor.fetchall()

# for row in rows:
#     print(row)

# --4
# cursor.execute("""
# SELECT 
#     d.Month,
#     SUM(f.Sales_Amount) AS Total_Sales
# FROM Fact_Sales f
# JOIN Dim_Date d ON f.Date_ID = d.Date_ID
# GROUP BY d.Month
# ORDER BY d.Date_ID;
# """)

# rows = cursor.fetchall()

# for row in rows:
#     print(row)

# -- 5
# cursor.execute("""
# SELECT 
#     p.Product_Name,
#     SUM(f.Quantity) AS Total_Quantity
# FROM Fact_Sales f
# JOIN Dim_Product p ON f.Product_ID = p.Product_ID
# GROUP BY p.Product_Name
# ORDER BY Total_Quantity DESC
# LIMIT 1;
# """)

# row = cursor.fetchone()
# print(row)

# connection.close()


import sqlite3

connection = sqlite3.connect("mydatabase.db")
cursor = connection.cursor()

cursor.execute("DROP TABLE IF EXISTS Fact_Sales")
cursor.execute("DROP TABLE IF EXISTS Dim_Date")
cursor.execute("DROP TABLE IF EXISTS Dim_Product")
cursor.execute("DROP TABLE IF EXISTS Dim_Customer")

#Dimension Tables
cursor.execute("""
CREATE TABLE Dim_Date (
    Date_ID INT PRIMARY KEY,
    Full_Date DATE,
    Month VARCHAR(20),
    Quarter VARCHAR(10),
    Year INT
);
""")

cursor.execute("""
CREATE TABLE Dim_Product (
    Product_ID INT PRIMARY KEY,
    Product_Name VARCHAR(100),
    Category VARCHAR(50),
    Brand VARCHAR(50)
);
""")

cursor.execute("""
CREATE TABLE Dim_Customer (
    Customer_ID INT PRIMARY KEY,
    Customer_Name VARCHAR(100),
    City VARCHAR(50),
    State VARCHAR(50)
);
""")

#Fact Table
cursor.execute("""
CREATE TABLE Fact_Sales (
    Sales_ID INT PRIMARY KEY,
    Date_ID INT,
    Product_ID INT,
    Customer_ID INT,
    Quantity INT,
    Sales_Amount DECIMAL(10,2),

    FOREIGN KEY (Date_ID) REFERENCES Dim_Date(Date_ID),
    FOREIGN KEY (Product_ID) REFERENCES Dim_Product(Product_ID),
    FOREIGN KEY (Customer_ID) REFERENCES Dim_Customer(Customer_ID)
);
""")

cursor.execute("""
INSERT INTO Dim_Date VALUES
(1, '2026-01-10', 'January', 'Q1', 2026),
(2, '2026-02-15', 'February', 'Q1', 2026),
(3, '2026-03-20', 'March', 'Q1', 2026);
""")

cursor.execute("""
INSERT INTO Dim_Product VALUES
(101, 'Laptop', 'Electronics', 'HP'),
(102, 'Mobile', 'Electronics', 'Samsung'),
(103, 'Chair', 'Furniture', 'Godrej');
""")

cursor.execute("""
INSERT INTO Dim_Customer VALUES
(201, 'Aman', 'Patiala', 'Punjab'),
(202, 'Riya', 'Chandigarh', 'Chandigarh'),
(203, 'Karan', 'Ludhiana', 'Punjab');
""")

cursor.execute("""
INSERT INTO Fact_Sales VALUES
(1, 1, 101, 201, 2, 100000),
(2, 2, 102, 202, 3, 60000),
(3, 3, 103, 203, 5, 25000),
(4, 1, 102, 201, 1, 20000),
(5, 2, 101, 203, 1, 50000);
""")

connection.commit()

#1
cursor.execute("""
SELECT 
    f.Sales_ID,
    c.Customer_Name,
    c.City,
    c.State,
    p.Product_Name,
    p.Category,
    p.Brand,
    f.Quantity,
    f.Sales_Amount
FROM Fact_Sales f
JOIN Dim_Customer c ON f.Customer_ID = c.Customer_ID
JOIN Dim_Product p ON f.Product_ID = p.Product_ID;
""")

rows = cursor.fetchall()

for row in rows:
    print(row)

#2
cursor.execute("""
SELECT 
    c.City,
    SUM(f.Sales_Amount) AS Total_Sales
FROM Fact_Sales f
JOIN Dim_Customer c ON f.Customer_ID = c.Customer_ID
GROUP BY c.City;
""")

rows = cursor.fetchall()

for row in rows:
    print(row)

#3
cursor.execute("""
SELECT 
    p.Category,
    SUM(f.Sales_Amount) AS Total_Sales
FROM Fact_Sales f
JOIN Dim_Product p ON f.Product_ID = p.Product_ID
GROUP BY p.Category;
""")

rows = cursor.fetchall()

for row in rows:
    print(row)

#4
cursor.execute("""
SELECT 
    d.Month,
    SUM(f.Sales_Amount) AS Total_Sales
FROM Fact_Sales f
JOIN Dim_Date d ON f.Date_ID = d.Date_ID
GROUP BY d.Month
ORDER BY d.Date_ID;
""")

rows = cursor.fetchall()

for row in rows:
    print(row)

#5
cursor.execute("""
SELECT 
    p.Product_Name,
    SUM(f.Quantity) AS Total_Quantity
FROM Fact_Sales f
JOIN Dim_Product p ON f.Product_ID = p.Product_ID
GROUP BY p.Product_Name
ORDER BY Total_Quantity DESC
LIMIT 1;
""")

row = cursor.fetchone()
print(row)

connection.close()