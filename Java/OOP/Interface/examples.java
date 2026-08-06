// import java.util.Scanner;

// interface Result{
//     void calculateResult();

// }

// class Marks implements Result{
//     public void calculateResult(){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter marks of all subjects : ");
//         int m1 = sc.nextInt();
//         int m2 = sc.nextInt();
//         int m3 = sc.nextInt();
//         int m4 = sc.nextInt();
//         int m5 = sc.nextInt();

//         int total_mks = (m1+m2+m3+m4+m5);
//         int per = (total_mks/500)*100;

//         String grade = new String();
//         if(per>90){
//             grade = "A";
//         }else if(per>=80 && per<90){
//             grade = "B";
//         }else if(per>=70 && per<80){
//             grade = "C";
//         }else{
//             grade="F";
//         }

//         System.out.println("Total Marks = "+total_mks);
//         System.out.println("Percentage = "+per);
//         System.out.println("Grade = "+grade);

//     }
// }

// public class examples{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Marks m = new Marks();
//         m.calculateResult();



//     }
// }

// import java.util.Scanner;

// interface Bank{
//     void deposit();
//     void withdraw();
// }

// class SBI implements Bank{
//     Scanner sc = new Scanner(System.in);

//     int balance = 0;

//     public void deposit(){
//         System.out.println("Enter the deposit amount");
//         int dep_amt = sc.nextInt();

//         balance += dep_amt;
//     }
//     public void withdraw(){
//         System.out.println("Enter the withdraw amount");
//         int with_amt= sc.nextInt();

//         balance -=with_amt;
//     }
//     void display(){
//         System.out.println("Remaining balance = "+balance);
//     }
// }


// public class examples{
//     public static void main(String[] args){
        
//         SBI s = new SBI();
//         s.deposit();
//         s.withdraw();
//         s.display();
//     }
// }

// 
