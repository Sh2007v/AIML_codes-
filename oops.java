//classes and objects
// import java.util.Scanner;

// class Student{
//     String name;
//     int mks;
// }
// public class java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the following details");
        
//         Student s1 = new Student();
        
//         System.out.println("Enter name : ");
//         s1.name=sc.nextLine();

//         System.out.println("Enter mks : ");
//         s1.mks = sc.nextInt();

//         System.out.println("Name:"+s1.name);
//         System.out.println("Marks:"+s1.mks);

//     }
// }
// import java.util.Scanner;
// class employee{
//     double id;
//     String Name;
//     int salary;
// }
// public class java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the details:");
        
//         employee e1 =  new employee();
        
//         System.out.println("Enter your id : ");
//         e1.id=sc.nextInt();
        
//         sc.nextLine();
        
//         System.out.println("Enter your Name : ");
//         e1.Name=sc.nextLine();

//         System.out.println("Enter your salary : ");
//         e1.salary = sc.nextInt();

//         System.out.println("Employee details are : ");
//         System.out.println("ID : "+e1.id);
//         System.out.println("Name : "+e1.Name);
//         System.out.println("Salary: "+e1.salary);
//     }
// }

// import java.util.Scanner;
// class rect{
//     int l;
//     int b;
// }
// public class java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         rect r1 = new rect();
        
//         System.out.println("Enter the length : ");
//         r1.l = sc.nextInt();
        
//         System.out.println("Enter the breadth : ");
//         r1.b = sc.nextInt();

//         System.out.println("Entered dimensions are : ");
//         System.out.println("Length : "+r1.l);
//         System.out.println("Breadth : "+r1.b);
//     }
// }

// import java.util.Scanner;
// class Circle{
//     int r;
// }
// public class java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         Circle c1 = new Circle(); //creating object
        
//         System.out.println("Enter the radius : ");
//         c1.r = sc.nextInt();

//         System.out.println("Entered elements are : ");
//         System.out.println("Radius : "+c1.r);
// }
// }
// import java.util.Scanner;
// class Car{
//     String brand;
//     int model;
//     float price;
// }
// public class java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         Car c1 = new Car();
        
//         System.out.println("Enter the details ");

//         System.out.println("Brand : ");
//         c1.brand = sc.nextLine();

//         System.out.println("Model :");
//         c1.model = sc.nextInt();

//         System.out.println("Price : ");
//         c1.price = sc.nextFloat();

//         System.out.println("Entered elements are : ");
//         System.out.println("Brand : "+c1.brand);
//         System.out.println("Model : "+c1.model);
//         System.out.println("Price : "+c1.price);


//     }
// }

// import java.util.Scanner;
// class Mobile{
//     String brand;
//     int ram;
//     int storage;
//     float price;
// }
// public class java{
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     Mobile m1 = new Mobile();

//     System.out.println("Enter the details : ");
    
//     System.out.println("Enter brand : ");
//     m1.brand = sc.nextLine();

//     System.out.println("Enter RAM : ");
//     m1.ram = sc.nextInt();

//     System.out.println("Enter storage : ");
//     m1.storage = sc.nextInt();

//     System.out.println("Enter Price :");
//     m1.price = sc.nextFloat();

//     System.out.println("Entered elements are : ");
//     System.out.println("Brand : "+m1.brand);
//     System.out.println("RAM :"+m1.ram);
//     System.out.println("Storage :" + m1.storage);
//     System.out.println("Price :"+m1.price);

// }
// }
// public class java{
//     int x = 90;
//     public static void main(String[] args){
//         java myObj = new java();
//         System.out.println(myObj.x);
//     }
// }

// class vari{
//     int x = 90;
// }
// public class java{
//     public static void main(String[] args){
//         vari myObj = new vari();
//         System.out.println(myObj.x);
//     }
// }

//multiple classes
// import java.util.Scanner;
// class Student{
//     String name;
//     int rollNo;
// }

// class College{
//     String collegeName;
//     String city;
// }

// public class java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Student s1 = new Student();
//         College c1 = new College();

//         System.out.println("Enter the details  ");
        
//         System.out.println("Enter student name : ");
//         s1.name = sc.nextLine();

//         System.out.println("Enter student roll num : ");
//         s1.rollNo = sc.nextInt();
        
//         sc.nextLine();

//         System.out.println("Enter College Name : ");
//         c1.collegeName = sc.nextLine();


//         System.out.println("Enter College City : ");
//         c1.city = sc.nextLine();

//         System.out.println("Student Name : "+s1.name);
//         System.out.println("Student Roll Number : "+s1.rollNo);
//         System.out.println("College Name : "+c1.collegeName);
//         System.out.println("College city : "+c1.city);
//     }
// }

// import java.util.Scanner;

// class Employee{
//     int id;
//     String name;
// }
// class Department{
//     String departmentName;
//     int floor;
// }

// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter details ");

//         Employee e = new Employee();
//         Department d = new Department();
        
//         System.out.println("Enter the id : ");
//         e.id = sc.nextInt();

//         sc.nextLine();

//         System.out.println("Enter the name : ");
//         e.name = sc.nextLine();

//         System.out.println("Enter Dept Name :");
//         d.departmentName = sc.nextLine();

//         System.out.println("Enter floor num : ");
//         d.floor = sc.nextInt();

//         System.out.println("ID : "+e.id);
//         System.out.println("Name : "+e.name);
//         System.out.println("Department Name : "+d.departmentName);
//         System.out.println("Floor : "+d.floor);
//     }
// }
// import java.util.Scanner;
// class Laptop{
//     String model;
//     int ram;
// }
// class Company{
//     String name;
//     String location;
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Laptop l = new Laptop();
//         Company c = new Company();

//         System.out.println("Enter follwoing details");
        
//         System.out.println("Enter the laptop name : ");
//         l.model = sc.nextLine();
        
//         // sc.nextLine();

//         System.out.println("Enter the ram : ");
//         l.ram = sc.nextInt();

//         System.out.println("Enter the company name : ");
//         c.name = sc.nextLine();

//         sc.nextLine();

//         System.out.println("Enter the location : ");
//         c.location = sc.nextLine();

//         // sc.nextLine();

//         System.out.println("Entered info is ");
//         System.out.println("Laptop Model :"+l.model);
//         System.out.println("RAM: "+l.ram);
//         System.out.println("Company Name : "+c.name);
//         System.out.println("Location : "+c.location);

//     }
// }

// import java.util.Scanner;
// class Address{
//     int houseNo;
//     int street;
//     String city;
// }
// class Student{
//     String Name;
//     int rollNo;
//     int Address;
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         Address a = new Address();
//         Student s = new Student();
        
//         System.out.print("Enter House Number : ");
//         a.houseNo = sc.nextInt();

//         System.out.print("Enter Street Num :");
//         a.street = sc.nextInt();
        
//         sc.nextLine();
        
        
//         System.out.println("Enter city : ");
//         a.city = sc.nextLine();
        

//         System.out.println("Enter Name : ");
//         s.Name = sc.nextLine();

//         sc.nextLine();

//         System.out.println("Enter Roll num : ");
//         s.rollNo = sc.nextInt();

//         System.out.println("Enter the address : ");
//         s.Address = sc.nextInt();

//         System.out.println("House Num : " + a.houseNo);
//         System.out.println("Street Num : "+a.street);
//         System.out.println("City : "+a.city);
//         System.out.println("Name :"+s.Name);
//         System.out.println("Roll NUmber :"+s.rollNo);
//         System.out.println("Address :"+s.Address);
//     }
// }
// import java.util.Scanner;
// class Company{
//     String companyName;
//     String location;
// }
// class Employee{
//     int employeeId;
//     String employeeName;
//     Company company; 
// }
// public class rough_java{
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     // Company c = new Company();
//     Employee e = new Employee();
//     e.company =new Company();

//     System.out.println("Enter the details");
    
//     System.out.println("Enter ID : ");
//     e.employeeId = sc.nextInt();
    
//     sc.nextLine();

//     System.out.println("Enter the Name : ");
//     e.employeeName = sc.nextLine();

//     System.out.println("Enter Company Details");
    
//     System.out.println("Enter Company Name : ");
//     e.company.companyName = sc.nextLine();

//     System.out.println("Enter Company Location : ");
//     e.company.location = sc.nextLine();
    
//     System.out.println("Details gathered : ");
//     System.out.println("ID: "+e.employeeId);
//     System.out.println("Name:"+e.employeeName);
//     System.out.println("Company Name:"+e.company.companyName);
//     System.out.println("Company Location: "+e.company.location);
//     }

// }

// import java.util.Scanner;
// class Publisher{
//     String publisherName;
//     String country;
// }
// class Book{
//     String title;
//     float price;
//     Publisher publisher;
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Book b = new Book(); 
//         b.publisher = new Publisher();

//         System.out.println("Enter the Title: ");
//         b.title = sc.nextLine();

//         System.out.println("Enter the price: ");
//         b.price = sc.nextFloat();

//         sc.nextLine();

//         System.out.println("Enter publisher name :");
//         b.publisher.publisherName = sc.nextLine();

        
//         System.out.println("Enter country name :");
//         b.publisher.country = sc.nextLine();
        
//         System.out.println("Entered information");
//         System.out.println("Title :"+b.title);
//         System.out.println("Price :"+b.price);
//         System.out.println("Publisher Name :"+b.publisher.publisherName);
//         System.out.println("Country Name :"+b.publisher.country);
        
//     }
// }

// import java.util.Scanner;
// class Engine{
//     int engineNo;
//     String fuelType;
// }
// class Car{
//     String brand;
//     String model;
//     Engine engine;
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Car c = new Car();

//         System.out.println("Enter Brand : ");
//         c.brand = sc.nextLine();

//         System.out.println("Enter model : ");
//         c.model = sc.nextLine();

//         System.out.println("Enter engine ");
//     }
// }

//Constructors

// public class rough_java{
//     int modelYear;
//     String modelName;
//     public rough_java(int year, String name){
//         modelYear = year;
//         modelName = name;
//     }
//     public static void main(String[] args){
//         rough_java myCar = new rough_java(1789,"Mustang");
//         System.out.println(myCar.modelYear + " " + myCar.modelName);
//     }
// }

// class Student{
//     String name;
//     int rollNo;
//     Student(){
//         name = "Shah";
//         rollNo = 3185;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
        
//         Student s = new Student();

//         System.out.println("Name :"+s.name);
//         System.out.println("Roll Num :"+s.rollNo);

//     }
// }


// import java.util.Scanner;
// class Student{
//     String name;
//     int rollNum;
//     Student(String n, int r){
//         name = n;
//         rollNum = r; 
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter name :");
//     String name = sc.nextLine();

//     System.out.println("Enter Roll num :");
//     int rollNum = sc.nextInt();

//     Student s = new Student(name,rollNum);

//     System.out.println("Name :"+s.name);
//     System.out.println("Roll Num :"+s.rollNum);

//     }
// }

// import java.util.Scanner;
// class Rectangle{
//     int length;
//     int breadth;
//     Rectangle(int l, int b){
//         length = l;
//         breadth = b;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the length : ");
//         int l = sc.nextInt();

//         System.out.println("Enter the breadth :");
//         int b = sc.nextInt();

//         Rectangle r = new Rectangle(l,b);

//         int area = r.length*r.breadth;

//         System.out.println("Area = "+area);
        
//     }
// }
// import java.util.Scanner;
// class Student{
//     String name;
//     int rollNo;
//     Student(){
//         name = "Shah";
//         rollNo = 3185;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         Student s = new Student();

//         System.out.println("Name :"+s.name);
//         System.out.println("Roll Num :"+s.rollNo);
//     }
// }

// class Employee{
//     int id;
//     String name;
//     int salary;
//     Employee(){
//         id = 3185;
//         name = "Shah";
//         salary = 456;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
    
//         Employee e = new Employee();
        
//         System.out.println("ID : "+e.id);
//         System.out.println("Name : "+e.name);
//     }
// }

// class Book{
//     String title;
//     String author;
//     int price;
//     Book(){
//         title = "G";
//         author = "a";
//         price = 123;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Book b = new Book();
//         System.out.println("Title :"+b.title);
//         System.out.println("Author :"+b.author);
//         System.out.println("Price :"+b.price);
//     }
// }

// import java.util.Scanner;
// class Student{
//     String name;
//     int rollNo;
//     Student(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter name :");
//         name = sc.nextLine();

//         System.out.println("Enter roll num :");
//         rollNo = sc.nextInt();
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Student st = new Student();

//         System.out.println("Name :"+st.name);
//         System.out.println("Roll Num :"+st.rollNo);
//     }
// }


// import java.util.Scanner;
// class Employee{
//     int id;
//     String name;
//     int salary;
//     Employee(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter ID:");
//         id = sc.nextInt();

//         sc.nextLine();

//         System.out.println("Enter Name: ");
//         name = sc.nextLine();

//         System.out.println("Enter Salary: ");
//         salary = sc.nextInt();

//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Employee e = new Employee();
//         System.out.println("ID: "+e.id);
//         System.out.println("Name: "+e.name);
//         System.out.println("Salary :"+e.salary);
//     }
// }


// import java.util.Scanner;
// class Book{
//     String title;
//     String author;
//     int price;
//     Book(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Title : ");
//         title = sc.nextLine();

//         System.out.println("Enter Author Name :");
//         author = sc.nextLine();

//         System.out.println("Enter price");
//         price = sc.nextInt();

//     }

// }
// public class rough_java{
//     public static void main(String[] args){
//         Book b = new Book();

//         System.out.println("Title :"+b.title);
//         System.out.println("Author Name :"+b.author);
//         System.out.println("Price : "+b.price);
//     }
// }

// import java.util.Scanner;
// class Car{
//     String Brand;
//     String Model;
//     int Price;
//     Car(){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter Brand :");
//         Brand = sc.nextLine();

//         System.out.println("Enter Model :");
//         Model = sc.nextLine();

//         System.out.println("Enter Price :");
//         Price = sc.nextInt();
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Car c = new Car();
//         System.out.println("Brand :"+c.Brand);
//         System.out.println("Model :"+c.Model);
//         System.out.println("Price :"+c.Price);
//     }
// }

// import java.util.Scanner;
// class Circle{
//     int radius;
//     Circle(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter radius :");
//         radius = sc.nextInt();

//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Circle c = new Circle();

//         System.out.println("Area : "+(3.14*c.radius*c.radius));

//     }
// }

// import java.util.Scanner;
// class Book{
//     String title;
//     String author;
//     int price;

//     Book(String t, String a, int p){
//         title = t;
//         author = a;
//         price = p;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter Title :");
//         String t = sc.nextLine();
        
//         System.out.println("Enter Author :");
//         String a = sc.nextLine();
        
//         System.out.println("Enter Price :");
//         int p = sc.nextInt();
        
//         Book b = new Book(t,a,p);

//         System.out.println("Title:"+b.title);
//         System.out.println("Author:"+b.author);
//         System.out.println("Price:"+b.price);

//     }
// }

// import java.util.Scanner;
// class Rectangle{
//     int length;
//     int breadth;
//     Rectangle(int l,int b){
//         length=l;
//         breadth=b;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter length:");
//         int l = sc.nextInt();

//         System.out.println("Enter breadth:");
//         int b = sc.nextInt();

//         Rectangle r = new Rectangle(l,b);

//         System.out.println("Area:"+(r.length)*(r.breadth));
//     }
// }

// import java.util.Scanner;
// class Employee{
//     String id;
//     String name;
//     int salary;
//     Employee(String i,String n,int s){
//         id= i;
//         name = n;
//         salary = s;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter ID :");
//         String id = sc.nextLine();

//         System.out.println("Enter Name :");
//         String name = sc.nextLine();

//         System.out.println("Enter Salary:");
//         int salary = sc.nextInt();

//         Employee e = new Employee(id,name,salary);
//         System.out.println("ID: "+e.id);
//         System.out.println("Name: "+e.name);
//         System.out.println("Salary: "+e.salary);
//    }
// }


// import java.util.Scanner;
// class Student{
//     String name;
//     int roll;
//     Student(String n, int r){
//         String name = n;
//         int roll = r;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Name :");
//         String n = sc.nextLine();

//         System.out.println("Enter Roll :");
//         int r = sc.nextInt();

//         Student s = new Student(n,r);

//         System.out.println("Student Details :");
//         System.out.println("Name: "+s.name);
//         System.out.println("Roll Num: "+s.roll);



//     }
// }

// import java.util.Scanner;
// class Book{
//     String title;
//     String author;
//     int price;
//     Book(String t, String a, int p){
//         title = t;
//         author = a;
//         price = p;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter title :");
//         String t = sc.nextLine();

//         System.out.println("Enter author :");
//         String a = sc.nextLine();

//         System.out.println("Enter Price :");
//         int p = sc.nextInt();
//     }
// }

// import java.util.Scanner;
// class Student{
//     String name;
//     int rollNo;
//     Student(String name,int rollNo){
//         this.name = name;
//         this.rollNo = rollNo;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Name: ");
//         String name = sc.nextLine();

//         System.out.println("Enter Roll No: ");
//         int rollNo = sc.nextInt();

//         Student s = new Student(name,rollNo);
//         System.out.println("Student Details");
//         System.out.println("Name: "+s.name);
//         System.out.println("Roll No: "+s.rollNo);
//     }
// }

// import java.util.Scanner;

// class Employee{
//     int id;
//     String name;
//     int salary;
//     Employee(int id, String name,int salary){
//         this.id = id;
//         this.name = name;
//         this.salary = salary;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter ID :");
//         int id = sc.nextInt();

//         sc.nextLine(); 

//         System.out.println("Enter Name :");
//         String name = sc.nextLine();

//         System.out.println("Enter Salary :");
//         int salary = sc.nextInt();

//         Employee e = new Employee(id,name,salary);
//         System.out.println("Employee Details");
//         System.out.println("ID : "+e.id);
//         System.out.println("Name : "+e.name);
//         System.out.println("Salary : "+e.salary);
//     }
// }

// import java.util.Scanner;
// class Book{
//     String title;
//     String author;
//     int price;
//     Book(String title, String author, int price){
//         this.title = title;
//         this.author = author;
//         this.price = price;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter title :");
//         String title = sc.nextLine();

//         System.out.println("Enter author name :");
//         String author = sc.nextLine();

//         System.out.println("Enter price :");
//         int price = sc.nextInt();

//         Book b = new Book(title,author,price);

//         System.out.println("Book Details");
//         System.out.println("Title : "+b.title);
//         System.out.println("Author : "+b.author);
//         System.out.println("Price : "+b.price);
//     }
// }

// import java.util.Scanner;
// class Rectangle{
//     int length;
//     int breadth;
//     Rectangle(int length, int breadth){
//         this.length = length;
//         this.breadth = breadth;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter length = ");
//         int length = sc.nextInt();

//         System.out.println("Enter breadth = ");
//         int breadth = sc.nextInt();

//         Rectangle r = new Rectangle(length,breadth);

//         System.out.println("Area : "+((r.length)*(r.breadth)));
//     }
// }

// import java.util.Scanner;
// class College{
//     String collegeName;
//     String city;
//     College(String collegeName, String city){
//         this.collegeName = collegeName;
//         this.city = city;
//     }
// }
// class Student{
//     String name;
//     int rollNo;
//     College college;
//     Student( String name, int rollNo, College college){
//         this.name = name;
//         this.rollNo = rollNo;
//         this.college = college;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Student Name : ");
//         String name = sc.nextLine();

//         System.out.println("Enter Roll Number : ");
//         int rollNo = sc.nextInt();

//         sc.nextLine();

//         System.out.println("Enter College details : ");
        
//         System.out.println("Enter College Name :");
//         String collegeName = sc.nextLine();

//         System.out.println("Enter College City :");
//         String city = sc.nextLine();

//         College c = new College(collegeName,city);
//         Student s = new Student(name,rollNo,c);
//         System.out.println("Student Details :");
//         System.out.println("Name : "+s.name);
//         System.out.println("Roll Num :"+s.rollNo);
//         System.out.println("College Name :"+c.collegeName);
//         System.out.println("College city :"+c.city);
//     }
// }

// import java.util.Scanner;

// class Address{
//     int houseNo;
//     String street;
//     String city;
//     Address(int houseNo, String street, String city){
//         this.houseNo = houseNo;
//         this.street = street;
//         this.city = city;
//     }
// }

// class Person{
//     String name;
//     int age;
//     Address address;
//     Person(String name, int age, Address address){
//         this.name = name;
//         this.age = age;
//         this.address = address;
//     }
// }

// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Person Name : ");
//         String name = sc.nextLine();

//         // sc.nextLine();

//         System.out.println("Enter Age : ");
//         int age = sc.nextInt();

//         System.out.println("Enter Address Details ");
        
//         System.out.println("Enter House Num :");
//         int houseNo = sc.nextInt();

//         sc.nextLine();

//         System.out.println("Enter Street Name :");
//         String street = sc.nextLine();

//         System.out.println("Enter City Name :");
//         String city = sc.nextLine();

//         Address a = new Address(houseNo,street,city);
//         Person p = new Person(name,age,a);
        
//         System.out.println("Person Details");
//         System.out.println("Name : "+p.name);
//         System.out.println("Age : "+p.age);
//         System.out.println("Address Details ");
//         System.out.println("House Number : "+p.address.houseNo);
//         System.out.println("Street Name : "+p.address.street);
//         System.out.println("City Name : "+p.address.city);
//     }
// }

// import java.util.Scanner;
// class Department{
//     String departmentName;
//     String location;
//     Department(String departmentName, String location){
//         this.departmentName = departmentName;
//         this.location = location;
//     }
// }
// class Employee{
//     String employeeName;
//     int employeeId;
//     Department department;
//     Employee(String employeeName,int employeeId, Department department){
//         this.employeeName = employeeName;
//         this.employeeId = employeeId;
//         this.department = department;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the Employee Name : ");
//         String employeeName = sc.nextLine();

//         System.out.println("Enter the Employee ID :");
//         int employeeId = sc.nextInt();

//         System.out.println("Enter Department Details");
        
//         sc.nextLine();
        
//         System.out.println("Enter Department Name :");
//         String departmentName = sc.nextLine();

//         System.out.println("Enter Location :");
//         String location = sc.nextLine();

//         Department d = new Department(departmentName,location);
//         Employee e = new Employee(employeeName,employeeId,d);
//         System.out.println("Employee Details");
//         System.out.println("Employee Name : "+e.employeeName);
//         System.out.println("Employee ID : "+e.employeeId);
//         System.out.println("Employee Department Details");
//         System.out.println("Department Name: "+e.department.departmentName);
//         System.out.println("Department location: "+e.department.location);
//     }
// }



// import java.util.Scanner;
// class Student{
//     String name;
//     int rollNo;
//     int marks;
//     Student(){
//         name = "Unknown";
//         rollNo = 0;
//         marks = 0;
//     }
//     Student(String name){
//         this.name = name;
//         this.rollNo = 0;
//         this.marks = 0;
//     }
//     Student(String name,int rollNo, int marks){
//         this.name = name;
//         this.rollNo = rollNo;
//         this.marks = marks;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter choice :");
//         System.out.println("1:Default ");
//         System.out.println("2:Single Parametrized");
//         System.out.println("3:Multi Parameterized");

//         int c = sc.nextInt();
//         sc.nextLine();

//         Student s;

//         if(c==1){
//             s = new Student();
//         }
        
//         else if(c==2){
//             System.out.println("Enter the name :");
//             String name = sc.nextLine();
            
//             s = new Student(name);
//         }

//         else{
//             System.out.println("Enter the name :");
//             String name = sc.nextLine();
            
//             System.out.println("Enter the Roll Num :");
//             int rollNum = sc.nextInt();
            
//             System.out.println("Enter the Marks :");
//             int marks = sc.nextInt();

//             s = new Student(name,rollNum,marks);

//             }

//         System.out.println("Name :"+s.name);
//         System.out.println("Roll Num :"+s.rollNo);
//         System.out.println("Marks : "+s.marks);
//     }
// }


// import java.util.Scanner;
// class Employee{
//     int employeeId;
//     String employeeName;
//     int salary;
//     Employee(){
//         employeeId = 0;
//         employeeName = "Unknown";
//         salary = 0;
//     }
//     Employee(String employeeName){
//         this.employeeName = employeeName;
//         this.employeeId = 0;
//         this.salary = 0;
//     }
//     Employee(int employeeId, String employeeName, int salary){
//         this.employeeName = employeeName;
//         this.employeeId = employeeId;
//         this.salary = salary;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the choice : ");
//         System.out.println("1:Default");
//         System.out.println("2:Single ");
//         System.out.println("3:Multiple");

//         int c =sc.nextInt();
//         sc.nextLine(); //1st correction
//         Employee e;
//         if(c==1){
//              e = new Employee();
//         }
//         else if(c==2){
//             System.out.println("Enter Name: ");
//             String name = sc.nextLine();

//              e = new Employee(name);
//         }else{
//             System.out.println("Enter ID: ");
//             int id = sc.nextInt();
//             sc.nextLine(); //2nd correction

//             System.out.println("Enter Name: ");
//             String name = sc.nextLine();

//             System.out.println("Enter Salary: ");
//             int salary = sc.nextInt();
            
//             e = new Employee(id,name,salary);
//         }
//         System.out.println("Name :"+e.employeeName);
//         System.out.println("ID : "+e.employeeId);
//         System.out.println("Salary : "+e.salary);

//     }
// }


// import java.util.Scanner;


// class BankAccount{
//     int accountNumber;
//     String accountHolder;
//     int balance;


//     BankAccount(){
//         accountNumber = 0;
//         accountHolder = "Unknown";
//         balance = 0;
//     }
//     BankAccount(String accountHolder){
//         this.accountHolder = accountHolder;
//         this.accountNumber = 0;
//         this.balance = 0;
//     }
//     BankAccount(int accountNumber,String accountHolder,int balance){
//         this.accountNumber = accountNumber;
//         this.accountHolder = accountHolder;
//         this.balance = balance;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
// BankAccount b;

//         System.out.println("Enter choice ");
//         System.out.println("1. Default ");
//         System.out.println("2: Parametrized");
//         System.out.println("3: Ultra Paramaterized");

//         int c = sc.nextInt();
//         sc.nextLine();

//         if(c==1){
//             b = new BankAccount();
//         }
//         else if(c==2){
//             System.out.println("Enter Name :");
//             String accountHolder = sc.nextLine();

//             b = new BankAccount(accountHolder);
//         }
//         else{
//             System.out.println("Enter Num:");
//             int accountNumber = sc.nextInt();

//             sc.nextLine(); 

//             System.out.println("Enter Name :");
//             String accountHolder = sc.nextLine();

//             System.out.println("Enter balance :");
//             int balance = sc.nextInt();

//         b = new BankAccount(accountNumber,accountHolder,balance);
//         }
//         System.out.println("Num :"+b.accountNumber);
//         System.out.println("Holder : "+b.accountHolder);
//         System.out.println("Balance:"+b.balance);
//     }
// }


// import java.util.Scanner;

// class Product{
//     int productId;
//     String productName;
//     int price;
//     Product(){
//         productId = 0;
//         productName = "Unknown";
//         price = 0;
//     }
//     Product(String productName){
//         this.productName = productName;
//         this.productId = 0;
//         this.price = 0;
//     }
//     Product(int productId, String productName,int price){
//         this.productName = productName;
//         this.productId = productId;
//         this.price = price;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter choice ");
//         System.out.println("1.Default Constructor");
//         System.out.println("2:Single Parameterized Constructor");
//         System.out.println("3:Multi Parameterized Constructor");

//         int c = sc.nextInt();
//         sc.nextLine();

//         Product p;

//         if(c==1){
//             p = new Product();
//         }
//         else if(c==2){
//             System.out.println("Enter product name :");
//             String productName = sc.nextLine();
            
//             p = new Product(productName);
//         }
//         else{
//             System.out.println("Enter product id :");
//             int productId = sc.nextInt();

//             sc.nextLine();

//             System.out.println("Enter prodcut name :");
//             String productName = sc.nextLine();

//             System.out.println("Enter price : ");
//             int price = sc.nextInt();

//             p = new Product(productId,productName,price);
//         }
//         System.out.println("ID: "+p.productId);
//         System.out.println("Product Name :"+p.productName);
//         System.out.println("Price: "+p.price);
//     }
// }

// import java.util.Scanner;

// class Car{
//     int carNumber;
//     String brand;
//     int price;
//     Car(){
//         carNumber = 234;
//         brand = "Tesla";
//         price = 89;
//     }
//     Car(String brand){
//         this.brand = brand;
//         this.carNumber = 0;
//         this.price = 0;
//     }
//     Car(int carNumber, String brand, int price){
//         this.brand = brand;
//         this.carNumber = carNumber;
//         this.price = price;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your choice ");
//         int c = sc.nextInt();

//         Car ca;

//         if(c==1){
            
//         }
//     }
// }


// import java.util.Scanner;

// class Student{
//     private String name;
//     private int marks;

//     public void setName(String name){
//         this.name = name;
//     }

//     public void setMarks(int marks){
//         this.marks = marks;
//     }

//     public String getName(){
//         return name;
//     }

//     public int getMarks(){
//         return marks;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Student s = new Student();

//         System.out.println("Enter the name :");
//         s.setName(sc.nextLine());

//         System.out.println("Enter the marks :");
//         s.setMarks(sc.nextInt());

//         System.out.println("Name :"+s.getName());
//         System.out.println("Marks :"+s.getMarks());
//     }
// }

// import java.util.Scanner;

// class Employee{
//     private int id;
//     private String name;
//     private int salary;

//     public void setID(int id){
//         this.id = id;
//     }

//     public void setName(String name){
//         this.name = name;
//     }

//     public void setSalary(int salary){
//         this.salary = salary;
//     }

// //    public int getID(){
// //     return id;
// //    }

//     public String getName(){
//         return name;
//     }

//     public int getId(){
//         return id;
//     }

//     // public int salary(){
//     //     return salary;
//     // }

//     public int getSalary(){
//         return salary;
//     }
// }

//     public class rough_java{
//         public static void main(String[] args){
//             Scanner sc =new Scanner(System.in);

//             Employee e = new Employee();

//             System.out.println("Enter the Name :");
//             e.setName(sc.nextLine());

//             System.out.println("Enter the ID :");
//             e.setID(sc.nextInt());

//             // sc.nextInt();

//             System.out.println("Enter the Salary :");
//             e.setSalary(sc.nextInt());
            
//             System.out.println("Name :"+e.getName());
//             System.out.println("ID :"+e.getId());
//             System.out.println("Salary :"+e.getSalary());
//         }
//     }


// import java.util.Scanner;

// class BankAccount{
//     private int num;
//     private String holder;
//     private int balance;

//     public void setNum(int num){
//         this.num = num;
//     }

//     public void setHolder(String holder){
//         this.holder = holder;
//     }

//     public void setBalance(int balance){
//         this.balance = balance;
//     }

//     public int getBalance(){
//         return balance;
//     }
//     public String getHolder(){
//         return holder;
//     }
//     public int getNum(){
//         return num;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         BankAccount b = new BankAccount();
        
//         System.out.println("Enter the account number :");
//         b.setNum(sc.nextInt());
//         sc.nextLine();

//         System.out.println("Enter the Holder Name :");
//         b.setHolder(sc.nextLine());

//         System.out.println("Enter the Balance :");
//         b.setBalance(sc.nextInt());


//         System.out.println("Account Number : "+b.getNum());
//         System.out.println("Account Holder :"+b.getHolder());
//         System.out.println("Balance :"+b.getBalance());
//     }
// }

// import java.util.Scanner;

// class Product{
//     private int productId;
//     private String productName;
//     private int price;

//     public void setProductID(int productId){
//         this.productId = productId;
//     }

//     public void setproductName(String productName){
//         this.productName = productName;
//     }

//     public void setprice(int price){
//         if(price>=0){
//             this.price = price;
//         }
//         else{
//             this.price = 0;
//         }
// }

//     public int getproductId(){
//         return productId;
//     }

//     public String getproductName(){
//         return productName;
//     }

//     public int getprice(){
//         return price;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Product p = new Product();
        
//         System.out.println("Enter the Product ID :");
//         p.setProductID(sc.nextInt());

//         sc.nextLine();

//         System.out.println("Enter the Product Name :");
//         p.setproductName(sc.nextLine());

//         System.out.println("Enter the Price :");
//         p.setprice(sc.nextInt());

//         System.out.println("ID : "+p.getproductId());
//         System.out.println("Name :"+p.getproductName());
//         System.out.println("Price :"+p.getprice());

//     }
// }


// import java.util.Scanner;
// class Mobile{
//     private String brand;
//     private String model;
//     private int price;

//     public void setBrand(String brand){
//         this.brand = brand;
//     }
//     public void setModel(String model){
//         this.model = model;
//     }
//     public void setPrice(int price){
//         if( price>1000){
//             this.price = price;
//         }else{
//             this.price = 1000;
//         }
//     }
//     public String getBrand(){
//         return brand;
//     }
//     public String getModel(){
//         return model;
//     }
//     public int getPrice(){
//          return price;
//      }
// } 
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Mobile m = new Mobile();

//         System.out.println("Enter the brand :");
//         m.setBrand(sc.nextLine());

//         System.out.println("Enter the Model :");
//         m.setModel(sc.nextLine());

//         System.out.println("Enter the price :");
//         m.setPrice(sc.nextInt());

//         System.out.println("Brand : "+m.getBrand());
//         System.out.println("Model : "+m.getModel());
//         System.out.println("Price : "+m.getPrice());

//     }
// }

// import java.util.Scanner;
// class Student{
//     private String name;
//     private int age;

//     public void setName(String name){
//         this.name = name;
//     }
//     public void setAge(int age){
//         if(age<5 || age>100){
//             this.age = 0;
//         }
//         else{
//         this.age = age;
//     }
//     }
//     public String getName(){
//         return name;
//     }
//     public int getAge(){
//         return age;
//     }
// }
// public class rough_java{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Student s = new Student();

//         System.out.println("Enter Name :");
//         s.setName(sc.nextLine());

//         System.out.println("Enter Age :");
//         s.setAge(sc.nextInt());

//         System.out.println("Name :"+s.getName());
//         System.out.println("Age :"+s.getAge());
//     }
// }

//ENCAPSULATION HARD PROBLEMS

// import java.util.Scanner;
// class Employee{
//     private int employeeId;
//     private String employeeName;
//     private String department;
//     private int basicSalary;
//     private int yearsofExperience;
    
//     private int bonus;
//     private int finalSalary;

//     public void setEmployeeId(int employeeId){
//         if(employeeId<=0){
//             this.employeeId = 1;
//         }else{
//             this.employeeId = employeeId;
//         }
//     }
//     public void setEmployeeName(String employeeName){
//         this.employeeName = employeeName;
//     }
//     public void setdepartment(String department){
//         this.department = department;
//     }
//     public void setBasicSalary(int basicSalary){
//         if(basicSalary<15000){
//             this.basicSalary = 15000;
//         }else{
//             this.basicSalary = basicSalary;
//         }
//     }
//     public void setYearsofExperience(int yearsofExperience){
//         if(yearsofExperience<0){
//             this.yearsofExperience = 0;
//         }else{
//         this.yearsofExperience = yearsofExperience;
//         }
//     }
//     public void setBonus(int)
    
//     public int getEmployeeId(){
//         return employeeId;
//     }
//     public String getEmployeename(){
//         return employeeName;
//     }
//     public String getDepartment(){
//         return department;
//     }
//     public int getBasicSalary(){
//         return basicSalary;
//     }
//     public int getYearsofExperience(){
//         return yearsofExperience;
//     }
//     // public int getBonus(){
//     //     return 
//     // }
// }
// public class oops{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Employee e = new Employee();
        
//         System.out.println("Enter EmployeeID :");
//         e.setEmployeeId(sc.nextInt());

//         sc.nextLine();

//         System.out.println("Enter Employee Name :");
//         e.setEmployeeName(sc.nextLine());

//         System.out.println("Enter the Department :");
//         e.setdepartment(sc.nextLine());

//         System.out.println("Enter Basic Salary :");
//         e.setBasicSalary(sc.nextInt());

//         sc.nextLine();

//         System.out.println("Enter years of Experience :");
//         e.setYearsofExperience(sc.nextInt());

//         System.out.println("Employee ID : "+e.getEmployeeId());
//         System.out.println("");
//     }
// }