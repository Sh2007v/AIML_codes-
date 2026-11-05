package Java.OOP.Polymorphism.CompileTimePoly;


// import java.util.Scanner;

// class calculator{
    
// } 
// public class example {
    
// }



import java.util.Scanner;
//1. Calculator

// public class practice {

//     // Method 1: Adds two integers
//     static int add(int a, int b) {
//         return a + b;
//     }

//     // Method 2: Adds three integers
//     static int add(int a, int b, int c) {
//         return a + b + c;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter two numbers: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         System.out.println("Sum of two numbers: " + add(a, b));

//         System.out.print("Enter three numbers: ");
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         int z = sc.nextInt();

//         System.out.println("Sum of three numbers: " + add(x, y, z));

//         sc.close();
//     }
// }

//2. Salary Calculator

import java.util.Scanner;

class SalaryCalculator {

    int calculate_Salary(int basicSalary) {
        return basicSalary;
    }

    int calculate_Salary(int basicSalary, int bonus) {
        return basicSalary + bonus;
    }

    double calculate_Salary(int basicSalary, int bonus, double allowance) {
        return basicSalary + bonus + allowance;
    }
}

public class practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Basic Salary: ");
        int basicSalary = sc.nextInt();

        System.out.println("Enter bonus: ");
        int bonus = sc.nextInt();

        System.out.println("Enter allowance: ");
        double allowance = sc.nextDouble();

        SalaryCalculator c = new SalaryCalculator();

        System.out.println("Basic Salary: "
                + c.calculate_Salary(basicSalary));

        System.out.println("Salary with bonus: "
                + c.calculate_Salary(basicSalary, bonus));

        System.out.println("Salary with bonus and allowance: "
                + c.calculate_Salary(basicSalary, bonus, allowance));

        sc.close();
    }
}
