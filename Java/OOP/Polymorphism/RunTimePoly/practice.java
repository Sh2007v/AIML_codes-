package Java.OOP.Polymorphism.RunTimePoly;

//1.
// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Animal a = new Dog();
//         a.sound();
//     }
// }

// //2.
// import java.util.Scanner;

// class Shape {
//     double calculateArea() {
//         return 0.0;
//     }
// }

// class Rectangle extends Shape {
//     int length;
//     int breadth;

//     Rectangle(int length, int breadth) {
//         this.length = length;
//         this.breadth = breadth;
//     }

//     @Override
//     double calculateArea() {
//         return length * breadth;
//     }
// }

// class Circle extends Shape {
//     double radius;

//     Circle(double radius) {
//         this.radius = radius;
//     }

//     @Override
//     double calculateArea() {
//         return 3.14 * radius * radius;
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter length:");
//         int length = sc.nextInt();

//         System.out.println("Enter breadth:");
//         int breadth = sc.nextInt();

//         System.out.println("Enter radius:");
//         double radius = sc.nextDouble();

//         Shape s;

//         s = new Rectangle(length, breadth);
//         System.out.println("Rectangle area: " + s.calculateArea());

//         s = new Circle(radius);
//         System.out.println("Circle area: " + s.calculateArea());

//         sc.close();
//     }
// }


//3. Bank Interest Calculator

// import java.util.Scanner;

// class Bank {
//     double getInterestRate() {
//         return 0.0;
//     }

//     double calculateInterest(int principal) {
//         return principal * getInterestRate() / 100;
//     }
// }

// class SBI extends Bank {
//     @Override
//     double getInterestRate() {
//         return 6.5;
//     }
// }

// class HDFC extends Bank {
//     @Override
//     double getInterestRate() {
//         return 7.0;
//     }
// }

// class ICICI extends Bank {
//     @Override
//     double getInterestRate() {
//         return 7.5;
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the principal: ");
//         int principal = sc.nextInt();

//         Bank b;

//         b = new SBI();
//         System.out.println("SBI interest: "
//                 + b.calculateInterest(principal));

//         b = new HDFC();
//         System.out.println("HDFC interest: "
//                 + b.calculateInterest(principal));

//         b = new ICICI();
//         System.out.println("ICICI interest: "
//                 + b.calculateInterest(principal));

//         sc.close();
//     }
// }


//4.