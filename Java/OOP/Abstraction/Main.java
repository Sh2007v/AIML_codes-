// // // package Java.OOP.Abstraction;

// // // import java.util.Scanner;

// // // abstract class Shape {

// // //     abstract void findArea();

// // // }

// // // class Rectangle extends Shape {

// // //     int length;
// // //     int breadth;

// // //     Rectangle(int length, int breadth) {

// // //         this.length = length;
// // //         this.breadth = breadth;

// // //     }

// // //     void findArea() {

// // //         int area = length * breadth;

// // //         System.out.println("Area = " + area);

// // //     }

// // // }

// // // public class practice {

// // //     public static void main(String[] args) {

// // //         Scanner sc = new Scanner(System.in);

// // //         System.out.print("Enter Length: ");
// // //         int length = sc.nextInt();

// // //         System.out.print("Enter Breadth: ");
// // //         int breadth = sc.nextInt();

// // //         Rectangle r = new Rectangle(length, breadth);

// // //         r.findArea();

// // //         sc.close();

// // //     }



    
// // // }

// // import java.util.Scanner;

// // abstract class Student {

// //     abstract void calculatePercentage();

// // }

// // class Result extends Student {

// //     int m1, m2, m3, m4, m5;

// //     Result(int m1, int m2, int m3, int m4, int m5) {

// //         this.m1 = m1;
// //         this.m2 = m2;
// //         this.m3 = m3;
// //         this.m4 = m4;
// //         this.m5 = m5;

// //     }

// //     void calculatePercentage() {

// //         int total = m1 + m2 + m3 + m4 + m5;
// //         double percentage = total / 5.0;

// //         System.out.println("Total Marks = " + total);
// //         System.out.println("Percentage = " + percentage + "%");

// //     }

// // }

// // public class Main {

// //     public static void main(String[] args) {

// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Enter Marks of Subject 1: ");
// //         int m1 = sc.nextInt();

// //         System.out.print("Enter Marks of Subject 2: ");
// //         int m2 = sc.nextInt();

// //         System.out.print("Enter Marks of Subject 3: ");
// //         int m3 = sc.nextInt();

// //         System.out.print("Enter Marks of Subject 4: ");
// //         int m4 = sc.nextInt();

// //         System.out.print("Enter Marks of Subject 5: ");
// //         int m5 = sc.nextInt();

// //         Result r = new Result(m1, m2, m3, m4, m5);

// //         r.calculatePercentage();

// //         sc.close();

// //     }

// // }

// import java.util.Scanner;

// abstract class Bank {

//     abstract void calculateInterest();

// }

// class SBI extends Bank {

//     double principal;
//     double rate;
//     double time;

//     SBI(double principal, double rate, double time) {

//         this.principal = principal;
//         this.rate = rate;
//         this.time = time;

//     }

//     void calculateInterest() {

//         double interest = (principal * rate * time) / 100;

//         System.out.println("Simple Interest = " + interest);

//     }

// }

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Principal Amount: ");
//         double principal = sc.nextDouble();

//         System.out.print("Enter Rate of Interest: ");
//         double rate = sc.nextDouble();

//         System.out.print("Enter Time (in years): ");
//         double time = sc.nextDouble();

//         SBI s = new SBI(principal, rate, time);

//         s.calculateInterest();

//         sc.close();

//     }

// }

// import java.util.Scanner;

// abstract class Vehicle {

//     abstract void calculateMileage();

// }

// class Car extends Vehicle {

//     double distance;
//     double fuel;

//     Car(double distance, double fuel) {

//         this.distance = distance;
//         this.fuel = fuel;

//     }

//     void calculateMileage() {

//         double mileage = distance / fuel;

//         System.out.println("Mileage = " + mileage + " km/l");

//     }

// }

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Distance Travelled (in km): ");
//         double distance = sc.nextDouble();

//         System.out.print("Enter Fuel Consumed (in litres): ");
//         double fuel = sc.nextDouble();

//         Car c = new Car(distance, fuel);

//         c.calculateMileage();

//         sc.close();

//     }

// }

// import java.util.Scanner;

// abstract class Recharge {

//     abstract void calculateFinalAmount();

// }

// class MobileRecharge extends Recharge {

//     double rechargeAmount;
//     double gst;

//     MobileRecharge(double rechargeAmount, double gst) {

//         this.rechargeAmount = rechargeAmount;
//         this.gst = gst;

//     }

//     void calculateFinalAmount() {

//         double gstAmount = (rechargeAmount * gst) / 100;
//         double finalAmount = rechargeAmount + gstAmount;

//         System.out.println("\nRecharge Details");
//         System.out.println("Recharge Amount = " + rechargeAmount);
//         System.out.println("GST = " + gst + "%");
//         System.out.println("GST Amount = " + gstAmount);
//         System.out.println("Final Amount = " + finalAmount);

//     }

// }

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Recharge Amount: ");
//         double rechargeAmount = sc.nextDouble();

//         System.out.print("Enter GST Percentage: ");
//         double gst = sc.nextDouble();

//         MobileRecharge m = new MobileRecharge(rechargeAmount, gst);

//         m.calculateFinalAmount();

//         sc.close();

//     }

// }