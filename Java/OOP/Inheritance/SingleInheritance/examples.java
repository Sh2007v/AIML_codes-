package Java.OOP.Inheritance.SingleInheritance;



//e.g : 1

// import java.util.Scanner;

// class Employee{
    
//     protected int employeeId;
//     protected String employeeName;
    
//     public void setEmployee(int employeeId, String employeeName){
        
//         this.employeeId = employeeId;
//         this.employeeName = employeeName;

//     } 
//     public void displayEmployee(){

//         System.out.println("Employee ID : "+employeeId);
//         System.out.println("Employee Name : "+employeeName);

//     }
// }

// class Manager extends Employee{

//    // protected String department;
//    // protected int salary;

//    private String department;
//    private int salary;

//     public void setManager(String department, int salary){

//         this.department = department;
//         this.salary = salary;

//     }

//     public void displayManager(){

//         System.out.println("Department : "+department);
//         System.out.println("Salary "+salary);

//     }
// }
// public class examples {
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter ID : ");
//         int employeeId = sc.nextInt();

//         sc.nextLine();

//         System.out.println("Enter Name : ");
//         String employeeName = sc.nextLine();

//         System.out.println("Enter Department : ");
//         String department = sc.nextLine();

//         System.out.println("Enter Salary : ");
//         int salary = sc.nextInt();


//         //Employee e = new Employee();

//         Manager m = new Manager();

//         m.setEmployee(employeeId,employeeName);

//         m.setManager(department,salary);


//         System.out.println("\nEmployee Details"); //Starts from a new line
//         m.displayEmployee();
//         m.displayManager();

//         sc.close();
//     }
// }




//e.g : 2

// import java.util.Scanner;

// class BankAcc{

//     private int accNum;
//     private String holderName;

//     public void setBankAcc(int accNum, String holderName){

//         this.accNum = accNum;
//         this.holderName = holderName;

//     }

//     public void displayBankAcc(){

//         System.out.println("Account Number : "+accNum);
//         System.out.println("Holder Name : "+holderName);

//     }
// }

// class SavingsAcc extends BankAcc{

//     private int balance;

//     public void setSavingsAcc(int balance){

//         this.balance = balance;

//     }

//     public void displaySavingsAcc(){

//         System.out.println("Balance : "+balance);

//     }
// }

// public class examples{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Account Number : ");
//         int accNum = sc.nextInt();

//         sc.nextLine();

//         System.out.println("Enter Holder Name : ");
//         String holderName = sc.nextLine();

//         System.out.println("Enter Balance : ");
//         int balance = sc.nextInt();

//         SavingsAcc s = new SavingsAcc();

//         System.out.println("\nAccount Details ");

//         s.setBankAcc(accNum,holderName);
//         s.setSavingsAcc(balance);

//         s.displayBankAcc();
//         s.displaySavingsAcc();
//         //System.out.println("Account Number : "+accNum);
//     }
// }


