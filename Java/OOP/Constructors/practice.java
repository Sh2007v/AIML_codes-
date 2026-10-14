// package Java.OOP.Constructors;

// import java.util.Scanner;

// class Rectangle{

//         private int length;
//         private int breadth;

//         public void setRectangle(int length, int breadth){
//             if(length>=0){
//                 this.length = length;
//             }
//             else{
//                 this.length = 1;
//             }

//             if(breadth>=0){
//                 this.breadth = breadth;
//             }
//             else{
//                 this.breadth = 1;
//             }
//     }
//         public void getRectangle(){

//             System.out.println("Area : "+(length*breadth));
        
//         }
// }

// public class examples{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int length = sc.nextInt();
//         sc.nextLine();
        
//         int breadth = sc.nextInt();

//         Rectangle r = new Rectangle();

//         r.setRectangle(length, breadth);
//         r.getRectangle();
//     } 
// }
// public class examples {
//     int a, b, c; float r1;
//     public examples() {
//         a=0; b=0;
//     }
//     public examples(int t1, int t2) {
//         a=t1; b=t2; c=0;
//     }
//     public void addData() {
//         c=a+b;
//         System.out.printf("a=%d b =%d c=%d\n", a, b, c);
//     }
//     public void subData() {
//         c=a-b;
//         System.out.printf("a=%d b=%d c=%d\n", a, b, c);
//     }
//     public void mulData() {
//         c=a*b;
//         System.out.printf("a=%d b=%d c=%d\n", a, b, c);
//     }
//     public static void main(String[] args) {
//         examples obj = new examples();
//         examples obj1 = new examples(5,6);
//         obj1.addData();
//         obj1.subData();
//         obj1.mulData();
//     }
// }

// //public class examples{

//     int radius; int l,b;
//     public Area(int r1) {
//         radius=r1;
//         System.out.println((22/7)*radius*radius);
//     }
//     public Area(int t1, int t2) {
//         l=t1; b=t2;
//         System.out.printf("Area of Rectangle = %d", l*b);
//     }
//     public static void main(String[] args) {
//         Area obj = new Area(7);
//         Area obj1 = new Area(3,5);
//     }
// }




//Magic Square

// import java.util.Scanner;
// public class example{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int r = sc.nextInt();
//         int c = sc.nextInt();


//         for(int i=1;i<r;i++){
//             for(int j=1;j<c;j++){
                
//             }
//         }

//     }
// }


// Default constructors

//1
// class Student{
    
//     String Name;
//     int age;

//     Student(){
//         Name = "Shah";
//         age = 19;
//     }

//     void display(){
//         System.out.println("Name : "+Name);
//         System.out.println("Age : "+ age);
//     }

// }
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Student s = new Student();
//         s.display();
        
//     }
// }

//2
// class Student {
//     String name;
//     int age;
//     String course;

//     // No-argument constructor
//     Student() {
//         name = "Unknown";
//         age = 0;
//         course = "Not Assigned";
//     }

//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Course: " + course);
//         System.out.println();
//     }
// }

// public class practice {
//     public static void main(String[] args) {

//         // Creating two objects
//         Student s1 = new Student();
//         Student s2 = new Student();

//         // Displaying details
//         s1.display();
//         s2.display();
//     }
// }


//2. Parameterized constructors

// class Student{

//     String Name;
//     int Age;
//     String City;

//     Student(String N, int A, String C){

//         Name = N;
//         Age = A;
//         City = C;

//     }

//     void display(){

//         System.out.println("Name : " + Name);
//         System.out.println("Age : "+ Age);
//         System.out.println("City : "+ City);

//     }
// }
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

        
//         System.out.println("Name : "+Name);
//         String Name = sc.nextLine();

//         System.out.println("Age : "+Age);
//         int Age = sc.nextInt();
        
//         sc.nextLine();

//         System.out.println("City : "+City);
//         String City = sc.nextLine();
        
//         Student s = new Student(Name,Age,City);
       
//         s.display();
    
//     }
// }


// Easy problems

//1. Rectangle class


// import java.util.Scanner;

// class Rectangle {
//     int length;
//     int breadth;

//     Rectangle(int l, int b) {
//         length = l;
//         breadth = b;
//     }

//     int area() {
//         return length * breadth;
//     }

//     int perimeter() {
//         return 2 * (length + breadth);
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the length: ");
//         int length = sc.nextInt();

//         System.out.print("Enter the breadth: ");
//         int breadth = sc.nextInt();

//         Rectangle r = new Rectangle(length, breadth);

//         System.out.println("Area: " + r.area());
//         System.out.println("Perimeter: " + r.perimeter());

//         sc.close();
//     }
// }

//2. Product Bill

// import java.util.Scanner;

// class Product {
//     String productName;
//     int price;
//     int quantity;

//     Product(String pN, int p, int q) {
//         productName = pN;
//         price = p;
//         quantity = q;
//     }

//     int calculateBill() {
//         return price * quantity;
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the product name: ");
//         String productName = sc.nextLine();

//         System.out.print("Enter the price: ");
//         int price = sc.nextInt();

//         System.out.print("Enter the quantity: ");
//         int quantity = sc.nextInt();

//         Product p = new Product(productName, price, quantity);

//         System.out.println("Product: " + p.productName);
//         System.out.println("Total Bill: " + p.calculateBill());

//         sc.close();
//     }
// }

// Medium problems

//1. Employee Salary Calculator

// import java.util.Scanner;

// class Employee {
//     String name;
//     int EmployeeId;
//     int basicSalary;
//     int hra;
//     int da;
//     int gross;

//     Employee(String n, int EID, int bS) {
//         name = n;
//         EmployeeId = EID;
//         basicSalary = bS;
//     }

//     int calHRA() {
//         hra = (20 * basicSalary) / 100;
//         return hra;
//     }

//     int calDA() {
//         da = (10 * basicSalary) / 100;   //10 and 100 are integers, so 10/100 = 0, in java.
//         return da;
//     }

//     int calGross() {
//         gross = basicSalary + calHRA() + calDA();
//         return gross;
//     }

//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Employee ID: " + EmployeeId);
//         System.out.println("Basic Salary: " + basicSalary);
//         System.out.println("HRA: " + calHRA());
//         System.out.println("DA: " + calDA());
//         System.out.println("Gross Salary: " + calGross());
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the name: ");
//         String name = sc.nextLine();

//         System.out.print("Enter Employee ID: ");
//         int EmployeeId = sc.nextInt();

//         System.out.print("Enter basic salary: ");
//         int basicSalary = sc.nextInt();

//         Employee e = new Employee(name, EmployeeId, basicSalary);

//         e.display();

//         sc.close();
//     }
// }

// Hard Problems
//1. Student Performance Analyser

// import java.util.Scanner;

// class Student {
//     String name;
//     int rollNo;
//     int marks1, marks2, marks3;

//     Student(String n, int r, int m1, int m2, int m3) {
//         name = n;
//         rollNo = r;
//         marks1 = m1;
//         marks2 = m2;
//         marks3 = m3;
//     }

//     int calculateTotal() {
//         return marks1 + marks2 + marks3;
//     }

//     double calculatePercentage() {
//         return calculateTotal() / 3.0;
//     }

//     void calculateGrade() {
//         double percentage = calculatePercentage();

//         if (percentage >= 90) {
//             System.out.println("Grade: A");
//         } else if (percentage >= 75) {
//             System.out.println("Grade: B");
//         } else if (percentage >= 60) {
//             System.out.println("Grade: C");
//         } else {
//             System.out.println("Grade: D");
//         }
//     }

//     void display() {
//         System.out.println("\nName: " + name);
//         System.out.println("Roll No: " + rollNo);
//         System.out.println("Total Marks: " + calculateTotal());
//         System.out.printf("Percentage: %.2f%%%n", calculatePercentage());
//         calculateGrade();
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input for Student 1
//         System.out.println("Enter details of Student 1:");
//         System.out.print("Name: ");
//         String name1 = sc.nextLine();
//         System.out.print("Roll No: ");
//         int roll1 = sc.nextInt();
//         System.out.print("Marks in 3 subjects: ");
//         int m11 = sc.nextInt();
//         int m12 = sc.nextInt();
//         int m13 = sc.nextInt();
//         sc.nextLine();

//         Student s1 = new Student(name1, roll1, m11, m12, m13);

//         // Input for Student 2
//         System.out.println("\nEnter details of Student 2:");
//         System.out.print("Name: ");
//         String name2 = sc.nextLine();
//         System.out.print("Roll No: ");
//         int roll2 = sc.nextInt();
//         System.out.print("Marks in 3 subjects: ");
//         int m21 = sc.nextInt();
//         int m22 = sc.nextInt();
//         int m23 = sc.nextInt();
//         sc.nextLine();

//         Student s2 = new Student(name2, roll2, m21, m22, m23);

//         // Input for Student 3
//         System.out.println("\nEnter details of Student 3:");
//         System.out.print("Name: ");
//         String name3 = sc.nextLine();
//         System.out.print("Roll No: ");
//         int roll3 = sc.nextInt();
//         System.out.print("Marks in 3 subjects: ");
//         int m31 = sc.nextInt();
//         int m32 = sc.nextInt();
//         int m33 = sc.nextInt();

//         Student s3 = new Student(name3, roll3, m31, m32, m33);

//         // Display all student details
//         System.out.println("\n--- Student Results ---");
//         s1.display();
//         s2.display();
//         s3.display();

//         // Find the highest percentage
//         double p1 = s1.calculatePercentage();
//         double p2 = s2.calculatePercentage();
//         double p3 = s3.calculatePercentage();

//         double highest = Math.max(p1, Math.max(p2, p3));

//         System.out.println("\n--- Highest Percentage ---");

//         if (p1 == highest) {
//             System.out.println(s1.name + " - " + p1 + "%");
//         }
//         if (p2 == highest) {
//             System.out.println(s2.name + " - " + p2 + "%");
//         }
//         if (p3 == highest) {
//             System.out.println(s3.name + " - " + p3 + "%");
//         }

//         sc.close();
//     }
// }



//5 medium problems from the concept of this


//1. Student detail template

// import java.util.Scanner;

// class Student {
//     String name;
//     int rollNo;
//     double marks;

//     Student(String name, int rollNo, double marks) {
//         this.name = name;
//         this.rollNo = rollNo;
//         this.marks = marks;
//     }

//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Roll No: " + rollNo);
//         System.out.println("Marks: " + marks);
//         System.out.println("-------------------");
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter details for Student 1:");
//         System.out.print("Enter name: ");
//         String name1 = sc.nextLine();
//         System.out.print("Enter roll number: ");
//         int roll1 = sc.nextInt();
//         System.out.print("Enter marks: ");
//         double marks1 = sc.nextDouble();
//         sc.nextLine();

//         Student s1 = new Student(name1, roll1, marks1);

//         System.out.println("\nEnter details for Student 2:");
//         System.out.print("Enter name: ");
//         String name2 = sc.nextLine();
//         System.out.print("Enter roll number: ");
//         int roll2 = sc.nextInt();
//         System.out.print("Enter marks: ");
//         double marks2 = sc.nextDouble();
//         sc.nextLine();

//         Student s2 = new Student(name2, roll2, marks2);

//         System.out.println("\nEnter details for Student 3:");
//         System.out.print("Enter name: ");
//         String name3 = sc.nextLine();
//         System.out.print("Enter roll number: ");
//         int roll3 = sc.nextInt();
//         System.out.print("Enter marks: ");
//         double marks3 = sc.nextDouble();

//         Student s3 = new Student(name3, roll3, marks3);

//         System.out.println("\n--- Student Details ---");
//         s1.display();
//         s2.display();
//         s3.display();

//         sc.close();
//     }
// }

//2. Bank Account System mechanism

// import java.util.Scanner;

// class BankAccount {
//     String accountHolder;
//     double balance;
//     long accountNumber;

//     BankAccount(String accountHolder, double balance, long accountNumber) {
//         this.accountHolder = accountHolder;
//         this.balance = balance;
//         this.accountNumber = accountNumber;
//     }

//     void deposit(double amount) {
//         if (amount > 0) {
//             this.balance += amount;
//             System.out.println("Deposit successful.");
//         } else {
//             System.out.println("Invalid deposit amount.");
//         }
//     }

//     void withdraw(double amount) {
//         if (amount <= 0) {
//             System.out.println("Invalid withdrawal amount.");
//         } else if (amount <= this.balance) {
//             this.balance -= amount;
//             System.out.println("Withdrawal successful.");
//         } else {
//             System.out.println("Insufficient balance.");
//         }
//     }

//     void display() {
//         System.out.println("\n--- Account Details ---");
//         System.out.println("Account Holder: " + this.accountHolder);
//         System.out.println("Account Number: " + this.accountNumber);
//         System.out.println("Current Balance: " + this.balance);
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter account holder name: ");
//         String name = sc.nextLine();

//         System.out.print("Enter account number: ");
//         long accountNumber = sc.nextLong();

//         System.out.print("Enter opening balance: ");
//         double balance = sc.nextDouble();

//         BankAccount account =
//                 new BankAccount(name, balance, accountNumber);

//         account.display();

//         System.out.print("\nEnter deposit amount: ");
//         double depositAmount = sc.nextDouble();
//         account.deposit(depositAmount);

//         System.out.print("Enter withdrawal amount: ");
//         double withdrawalAmount = sc.nextDouble();
//         account.withdraw(withdrawalAmount);

//         account.display();

//         sc.close();
//     }
// }

//3. Employee Salary Updater

// import java.util.Scanner;

// class Employee {
//     String name;
//     int employeeId;
//     int salary;

//     Employee(String name, int employeeId, int salary) {
//         this.name = name;
//         this.employeeId = employeeId;
//         this.salary = salary;
//     }

//     void increaseSalary(double amount) {
//         this.salary += amount;
//     }

//     void display() {
//         System.out.println("Employee Name: " + this.name);
//         System.out.println("Employee ID: " + this.employeeId);
//         System.out.println("Updated Salary: " + this.salary);
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the Name:");
//         String name = sc.nextLine();

//         System.out.println("Enter the Employee Id:");
//         int employeeId = sc.nextInt();

//         System.out.println("Enter the Salary:");
//         int salary = sc.nextInt();

//         Employee e1 = new Employee(name, employeeId, salary);

//         System.out.println("Enter the amount to add:");
//         double amount = sc.nextDouble();

//         e1.increaseSalary(amount);
//         e1.display();

//         sc.close();
//     }
// }


//4. Product price updater

// import java.util.Scanner;

// class Product {
//     String productName;
//     double price;
//     int quantity;

//     Product(String productName, double price, int quantity) {
//         this.productName = productName;
//         this.price = price;
//         this.quantity = quantity;
//     }

//     void setPrice(double price) {
//         this.price = price;
//     }

//     double calculateTotal() {
//         return this.price * this.quantity;
//     }

//     void display() {
//         System.out.println("\n--- Product Details ---");
//         System.out.println("Product Name: " + this.productName);
//         System.out.println("Price per item: " + this.price);
//         System.out.println("Quantity: " + this.quantity);
//         System.out.println("Total Cost: " + calculateTotal());
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter product name: ");
//         String name = sc.nextLine();

//         System.out.print("Enter price: ");
//         double price = sc.nextDouble();

//         System.out.print("Enter quantity: ");
//         int quantity = sc.nextInt();

//         Product p = new Product(name, price, quantity);

//         p.display();

//         System.out.print("\nEnter updated price: ");
//         double newPrice = sc.nextDouble();

//         p.setPrice(newPrice);

//         System.out.println("\nAfter updating the price:");
//         p.display();

//         sc.close();
//     }
// }


//5 Student constructor chaining

// import java.util.Scanner;

// class Student {
//     String name;
//     int age;
//     String course;

//     Student() {
//         this("Unknown", 0, "Not Assigned");
//     }

//     Student(String name, int age, String course) {
//         this.name = name;
//         this.age = age;
//         this.course = course;
//     }

//     void display() {
//         System.out.println("\n--- Student Details ---");
//         System.out.println("Name: " + this.name);
//         System.out.println("Age: " + this.age);
//         System.out.println("Course: " + this.course);
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Object using the no-argument constructor
//         Student s1 = new Student();

//         // Object using the parameterized constructor
//         System.out.print("Enter student name: ");
//         String name = sc.nextLine();

//         System.out.print("Enter age: ");
//         int age = sc.nextInt();
//         sc.nextLine();

//         System.out.print("Enter course: ");
//         String course = sc.nextLine();

//         Student s2 = new Student(name, age, course);

//         s1.display();
//         s2.display();

//         sc.close();
//     }
// }

