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

// static void squareNum(int num){
//     try{
//         int result = num*num;
//         System.out.println("Result : "+result);
//     }
//     catch(Exception e){
//         System.out.println("Error occured during the process ! ");
//     }
//     finally{
//         System.out.println("Code Executed !");
//     }
// }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     try{
//         System.out.println("Enter the num : ");
//         int num = Integer.parseInt(sc.nextLine());

//         squareNum(num);
//     }
//     catch(NumberFormatException e ){
//         System.out.println("Invalid number entered");
//     }
//     finally{
//         System.out.println("Program finished !");
//     }

// }

//3. ACCESS ARRAY ELEMENTS
// static void accessElem(int[] arr, int index){
//     try{
//         System.out.println(" Array value : "+arr[index]);
        
//     }
//     catch(ArrayIndexOutOfBoundsException e){
//         System.out.println("Invalid index entered!");
//     }
//     finally{
//         System.out.println("Program executed finally!");
//     }
// }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     try{
//         int[] arr ={10,20,30,40,50,60};

//         System.out.println("Enter Index : ");
//         int index = Integer.parseInt(sc.nextLine());

//         accessElem(arr,index);


//     }
//     catch(NumberFormatException e){
//         System.out.println("Invalid index entered!");
//     }
//     finally{
//         System.out.println("Code Executed!");
//     }
// }

//4 Which num is larger

// static void findLarger(int num1,int num2){
//     try{
//         if(num1>num2){
//             System.out.println(num1+"is larger");
//         }else{
//             System.out.println(num2+"is larger");
//         }
//     }
//     finally{
//         System.out.println("Comparison completed!");
//     }
// }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     try{
//         System.out.println("Enter 1st Number : ");
//         int num1 = Integer.parseInt(sc.nextLine());

//         System.out.println("Enter 2nd Number : ");
//         int num2 = Integer.parseInt(sc.nextLine());

//         findLarger(num1, num2);
//     }
//     catch(NumberFormatException e){
//         System.out.println("Invalid number input!");
//     }
//     finally{
//         System.out.println("Program executed completely!");
//     }
// }

// //5 CHECK FOR VALID DECIMAL NUMBER

// static void checkDouble(double num){
//     try{
//         System.out.println("Number = "+num);
//     }
//     finally{
//         System.out.println("Program Executed Successfully!");
//     }
// }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     try{
//         System.out.println("Enter the num : ");
//         double num = Double.parseDouble(sc.nextLine());

//         checkDouble(num);
//     }
//     catch(NumberFormatException e){
//         System.out.println("Invalid number format enetered");
//     }
//     finally{
//         System.out.println("Code done! ");
//     }
// }

//6 ELIGIBLE TO VOTE OR NOT

// static void checkVotingEligibilty(int age){
//     try{
//         if(age>=18){
//             System.out.println("Eligible to vote !");
//         }else if(age<18){
//             System.out.println("Not eligible to vote !");
//         }
//     }
//     // catch(IllegalArgumentException e){
//     //     System.out.println("Invalid Age !");
//     // }
//     finally{
//         System.out.println("Program done !");
//     }
// }

// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     try{
//         System.out.println("Enter age : ");
//         int age = Integer.parseInt(sc.nextLine());

//         checkVotingEligibilty(age);
//     }
//     catch(IllegalArgumentException e){
//         System.out.println("Invalid Age !");
//     }
//     finally{
//         System.out.println("Program Completed !");
//     }
// }

//GET CHARACTER OF A STRING

static void getCharacter(String str, int index){
    try{
        System.out.println("Character at index "+index+":"+ str.charAt(index));
    }
    catch(StringIndexOutOfBoundsException e){
        System.out.println("Wrong index input !");
    }
    finally{
        System.out.println("Program executed successfully!");
    }
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    try{
        System.out.println("Input the String : ");
        String str = sc.nextLine();

        System.out.println("Enter the Index : ");
        int index = Integer.parseInt(sc.nextLine());

        getCharacter(str, index);

    }
    catch(NumberFormatException e){
        System.out.println("Invalid index entered!");
    }
    finally{
        System.out.println("Program Done");
    }
}
}
