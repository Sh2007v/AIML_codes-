
//1.

// class Student {
//     String name;
//     int rollNo;

//     static String collegeName = "Chitkara University";

//     Student(String n, int r) {
//         name = n;
//         rollNo = r;
//     }

//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Roll No: " + rollNo);
//         System.out.println("College: " + collegeName);
//         System.out.println();
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Student s1 = new Student("Rahul", 101);
//         Student s2 = new Student("Aman", 102);
//         Student s3 = new Student("Priya", 103);

//         s1.display();
//         s2.display();
//         s3.display();
//     }
// }

//2.
// import java.util.Scanner;

// class Student{
    
//     String name ;
//     int rollNo ;
//     static int ct = 0;



//     Student(String n, int r){
//         name = n;
//         rollNo = r;
//         ct++;
//     }

//     void display(){
//         System.out.println(ct);
//     }
// }

// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the name : ");
//         String name = sc.nextLine();

//         System.out.println("Enter the roll number : ");
//         int rollNo = sc.nextInt();

//         Student s1 = new Student(name, rollNo);
//         Student s2 = new Student(name, rollNo);
//         Student s3 = new Student(name, rollNo);
//         Student s4 = new Student(name, rollNo);
//         Student s5 = new Student(name, rollNo);

//         s1.display();

//     }
// }

//3.

// class Calculator {

//     static int add(int a, int b) {
//         return a + b;
//     }

//     static int multiply(int a, int b) {
//         return a * b;
//     }
// }

// public class practice {
//     public static void main(String[] args) {

//         System.out.println("Sum: " + Calculator.add(10, 20));

//         System.out.println("Product: " + Calculator.multiply(10, 20));
//     }
// }

//4.

// import java.util.Scanner;

// class Employee {
//     String name;
//     int salary;
//     static String companyName = "ABC Ltd.";

//     Employee(String n, int s) {
//         name = n;
//         salary = s;
//     }

//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Salary: " + salary);
//         System.out.println("Company: " + companyName);
//         System.out.println();
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the name: ");
//         String name = sc.nextLine();

//         System.out.print("Enter the salary: ");
//         int salary = sc.nextInt();

//         Employee e1 = new Employee(name, salary);
//         Employee e2 = new Employee(name, salary);
//         Employee e3 = new Employee(name, salary);

//         System.out.println("\nBefore changing company name:");
//         e1.display();
//         e2.display();
//         e3.display();

//         Employee.companyName = "XYZ Ltd.";

//         System.out.println("After changing company name:");
//         e1.display();
//         e2.display();
//         e3.display();

//         sc.close();
//     }
// }
