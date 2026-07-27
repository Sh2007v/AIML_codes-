// // ===============================================
// // 1. Student Name Using super
// // ===============================================

// class Person {

//     String name = "Rahul";

// }

// class Student extends Person {

//     String name = "Aman";

//     void display() {

//         System.out.println("Child Name : " + name);
//         System.out.println("Parent Name : " + super.name);

//     }

// }

// // ===============================================
// // 2. Rectangle Dimensions Using super
// // ===============================================

// class Rectangle {

//     int length = 10;
//     int breadth = 5;

// }

// class Box extends Rectangle {

//     int length = 20;
//     int breadth = 15;

//     void display() {

//         System.out.println("Child Length : " + length);
//         System.out.println("Child Breadth : " + breadth);

//         System.out.println("Parent Length : " + super.length);
//         System.out.println("Parent Breadth : " + super.breadth);

//     }

// }

// // ===============================================
// // 3. Employee Salary Using super
// // ===============================================

// class Employee {

//     double salary = 30000;

// }

// class Manager extends Employee {

//     double salary = 50000;

//     void display() {

//         System.out.println("Manager Salary : " + salary);
//         System.out.println("Employee Salary : " + super.salary);

//     }

// }

// // ===============================================
// // 4. Vehicle Speed Using super
// // ===============================================

// class Vehicle {

//     int speed = 80;

// }

// class Car extends Vehicle {

//     int speed = 120;

//     void display() {

//         System.out.println("Car Speed : " + speed);
//         System.out.println("Vehicle Speed : " + super.speed);

//         int difference = speed - super.speed;

//         System.out.println("Difference : " + difference);

//     }

// }

// // ===============================================
// // 5. Bank Interest Rate Using super
// // ===============================================

// class Bank {

//     double interestRate = 6.5;

// }

// class SBI extends Bank {

//     double interestRate = 7.5;

//     void display() {

//         System.out.println("SBI Interest Rate : " + interestRate + "%");
//         System.out.println("Bank Interest Rate : " + super.interestRate + "%");

//         double extraInterest = interestRate - super.interestRate;

//         System.out.println("Extra Interest : " + extraInterest + "%");

//     }

// }

// // ===============================================
// // Main Class
// // ===============================================

// public class Main {

//     public static void main(String[] args) {

//         System.out.println("===== Problem 1 =====");
//         Student s = new Student();
//         s.display();

//         System.out.println("\n===== Problem 2 =====");
//         Box b = new Box();
//         b.display();

//         System.out.println("\n===== Problem 3 =====");
//         Manager m = new Manager();
//         m.display();

//         System.out.println("\n===== Problem 4 =====");
//         Car c = new Car();
//         c.display();

//         System.out.println("\n===== Problem 5 =====");
//         SBI bank = new SBI();
//         bank.display();

//     }

// }