package Java.OOP.Encapsulation;

import javax.sound.midi.SysexMessage;

// //1.Student class
// import java.util.Scanner;

// class Student {
//     private int marks;

//     public void setMarks(int marks) {
//         this.marks = marks;
//     }

//     public int getMarks() {
//         return marks;
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         Student s = new Student();

//         int marks = sc.nextInt();
//         s.setMarks(marks);

//         System.out.println("Marks: " + s.getMarks());

//         sc.close();
//     }
// }

//2 Bank Account
// import java.util.*;

// class Bank{
//     private double balance;

//     public void setBalance (double balance){
//         this.balance = balance;
//     }

//     public double getBalance(){
//         return balance;
//     }

// }

// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//        double balance = sc.nextDouble();

//         Bank b  = new Bank();

//         b.setBalance(balance);

//         System.out.println(b.getBalance());
//     }
// }

//3. Age validation
import java.util.*;

class Person{
    private int age;
    
    public void setAge(int age){
        if(age>0){
        this.age = age;
        }
    }

    public int getAge(){
        return age;
    }

}

public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        
    }
}