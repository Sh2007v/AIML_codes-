package Java.Fundamentals.Exception;

import java.util.Scanner;

public class practice {
//     static void divisionOperation(int num1, int num2){
//         try{
//             int result = num1/num2;
//             System.out.println("Result: "+result);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Division by Zero is not possible ");
//         }
//         finally{
//             System.out.println("Logic operation done!");
//         }
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         try{
//             System.out.println("Enter 1st num : ");
//             int num1 = Integer.parseInt(sc.nextLine());

//             System.out.println("Enter 2nd num : ");
//             int num2 = Integer.parseInt(sc.nextLine());

//             divisionOperation(num1,num2);
//         }
//         catch(NumberFormatException e){
//             System.out.println("Invalid input type !");
//         }
//         finally{
//             System.out.println("Code executed !");
//         }
//     }

//2 Square a number

static void squareNum(int num){
    try{
        int result = num*num;
        System.out.println("Result : "+result);
    }
    catch(Exception e){
        
    }
}

}
