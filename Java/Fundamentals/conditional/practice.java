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

// UNIVERSITY RESULT SYSTEM
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






