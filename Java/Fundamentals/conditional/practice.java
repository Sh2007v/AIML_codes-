package Java.Fundamentals.conditional;

import java.util.Scanner;


// EVEN OR ODD
// public class practice {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         if(n%2==0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }
//     }
// }


// SALARY + BONUS
//  public class practice {
//   public static void main(String[] args){
//          Scanner sc = new Scanner(System.in);

//         int empID = sc.nextInt();
//         sc.nextLine();
//         String empName = sc.nextLine();
//         int basSalary = sc.nextInt();
//         sc.nextLine();
//         int yearsOfexp = sc.nextInt();

//         int finalSal = 0;
//         int bonus = 0;

//         if(yearsOfexp<2){
//             // bonus = basSalary*(5/100);    //integer division - 0;
//             bonus = basSalary*5/100;
//         }
//         else if(yearsOfexp>=2 && yearsOfexp<=5){
//             // bonus = basSalary*(1/10);
//             bonus = basSalary*1/10;
//         }
//         else{
//             // bonus = basSalary*(2/10);
//             bonus = basSalary*2/10;
//         }


//         finalSal = basSalary + bonus;

//         System.out.println("Bonus : "+bonus);
//         System.out.println("Final Salary : "+finalSal);
//     }
// }


//SCHOLARSHIP

// public class practice{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         String name = sc.nextLine();
//         int percentage = sc.nextInt();
//         int familyIncome = sc.nextInt();

//         String scholarship;

//         System.out.println("Name : "+name);
//         System.out.println("Percentage : "+percentage);

//         if(percentage>=90 && familyIncome<300000){
//             scholarship = "100%";
//         }
//         else if(percentage>=80 && familyIncome<500000){
//             scholarship ="50%";
//         }
//         else{
//             scholarship = "No Scholarship";
//         }
//     }
// }

// LOAN APPROVAL
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int salary = sc.nextInt();

//         int credit_score = sc.nextInt();

//         int age = sc.nextInt();

//         if((salary>=50000 && credit_score>=700) && (age>=21 && age<=60)){
//             System.out.println("Loan Approved");
//         }
//         else{
//             System.out.println("Loan Rejected");
//         }
//     }
// }

//UNIVERSITY RESULT SYSTEM
//  public class practice{
//      public static void main(String[] args){
         
//         Scanner sc = new Scanner(System.in);
//         int perc = 0;

//         System.out.println("Java : ");
//         int m_java = sc.nextInt();

//         System.out.println("Python : ");
//         int m_python = sc.nextInt();

//         System.out.println("DBMS : ");
//         int m_dbms = sc.nextInt();

//         System.out.println("HTML");
//         int m_html = sc.nextInt();

//         System.out.println("Mathematics");
//         int m_maths = sc.nextInt();

//         if(m_java<40 || m_python<40 || m_dbms<40 || m_html<40 || m_maths<40){
//             System.out.println("Fail");
//         }else{
//             perc = ((m_dbms+m_python+m_html+m_maths+m_java)/5);
//             System.out.println(perc);
//         }
//         if(perc>=90){
//             System.out.println("Pass");
//         }else{
//             System.out.println("Fail");
//         }
//     }
//  }


// Switch statements

//SIMPLE CALCULATOR

// public class practice{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
//         int n1 = sc.nextInt();
//         sc.nextLine();
//         String op = sc.nextLine();
//         int n2 = sc.nextInt();
//         int res = 0;
        
//         switch(op){
//             case "+":
//                 res = n1+n2;
//                 System.out.println(res);
//                 break;
//             case "-":
//                 if(n1>n2){
//                     res = n1-n2;
//                 }else{
//                     res = n2-n1;
//                 }
//                 System.out.println(res);
//                 break;
//             case "*":
//                 res = n1*n2;
//                 System.out.println(res);
//                 break;
//             case "/":
//                 res = n1/n2;
//                 System.out.println(res);
//                 break;
//         }
//     }
// }



//WEEKDAYS FINDER
// import java.util.Scanner;
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number in range of (1-7): ");
//         int day = sc.nextInt();

//         switch(day){
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid Input");
//             }
//         sc.close();
//     }
// }


//Month Name Finder
// import java.util.Scanner;
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter month number: ");
//         int mon = sc.nextInt();

//         switch(mon){
//             case 1:
//                 System.out.println("January");
//                 break;
//             case 2:
//                 System.out.println("February");
//                 break;
//             case 3:
//                 System.out.println("March");
//                 break;
//             case 4:
//                 System.out.println("April");
//                 break;
//             case 5:
//                 System.out.println("May");
//                 break;
//             case 6:
//                 System.out.println("June");
//                 break;
//             case 7:
//                 System.out.println("July");
//                 break;
//             case 8:
//                 System.out.println("August");
//                 break;
//             case 9:
//                 System.out.println("September");
//                 break;
//             case 10:
//                 System.out.println("October");
//                 break;
//             case 11:
//                 System.out.println("November");
//                 break;
//             case 12:
//                 System.out.println("December");
//                 break;
//             default:
//                 System.out.println("Invalid Month");    
//         }
//         sc.close();

//     }
// }



//Grade Description
// import java.util.Scanner;
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the grade : ");
//         String grade = sc.nextLine();

//         switch (grade){
//             case "O":
//                 System.out.println("Outstanding");
//                 break;
//             case "A":
//                 System.out.println("Excellent");
//                 break;
//             case "B":
//                 System.out.println("Very Good");
//                 break;
//             case "C":
//                 System.out.println("Good");
//                 break;
//             case "D":
//                 System.out.println("Average");
//                 break;
//             case "F":
//                 System.out.println("Fail");
//                 break;
//             default:
//                 System.out.println("Invalid Input");
//         }
//         sc.close();
//     }
// }

//AREA CALCULATOR

// import java.util.Scanner;
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Choice: \n1.Square\n2.Rectangle\n3.Circle");
//         int choice = sc.nextInt();

//         switch(choice){
//             case 1:
//                 System.out.println("Enter the side of Square: ");
//                 int side = sc.nextInt();

//                 int areaSq = side*side;

//                 System.out.println("Area : "+areaSq);
//                 break;
//             case 2:
//                 System.out.println("Enter the length of reactangle: ");
//                 int length = sc.nextInt();

//                 System.out.println("Enter the breadth of rectangle: ");
//                 int breadth = sc.nextInt();

//                 int area = length*breadth;
//                 System.out.println("Area: " +area);

//                 break;
//             case 3:
//                 System.out.println("Enter the radius of the Circle: ");
//                 float radius = sc.nextFloat();

//                 float areaC = (float)((3.14)*(radius)*(radius));

//                 System.out.println("Area: "+areaC);
//                 break;
//             default:

//                 System.out.println("Invalid Input");
//         }
//         sc.close();
//     }
// }




//Unit Converter
