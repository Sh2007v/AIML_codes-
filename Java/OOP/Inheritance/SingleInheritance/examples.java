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

//    protected String department;
//    protected int salary;

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

//     protected int accNum;
//     protected String holderName;

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

//     protected int balance;

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


//e.g : 3 


// import java.util.Scanner;

// class Shape{
    
//     protected int length;
//     protected int breadth;

//     public void setShape(int length,int breadth){

//         this.length = length;
//         this.breadth = breadth;

//     }
//     public void displayShape(){

//         System.out.println("Length : "+length);
//         System.out.println("Breadth : "+breadth);

//     }
// }

// class Rectangle extends Shape{

//     public void displayArea(){

//         System.out.println("Area :"+length*breadth);

//     }
// }

// public class examples{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the length : ");
//         int length = sc.nextInt();

//         sc.nextLine();

//         System.out.println("Enter the breadth : ");
//         int breadth = sc.nextInt();

//         //System.out.println();
//         Rectangle r = new Rectangle();

//         r.setShape(length,breadth); 

//         System.out.println();

//         r.displayShape();
//         r.displayArea();
//     }
// }


// e.g. : 4

// import java.util.Scanner;

// class Person{

//     protected String name;
//     protected int age;

//     public void setPerson(String name, int age){

//         this.name = name;
        
//         if(age<18){
//             this.age = 18;
//         }else{
//             this.age = age;
//         }

//     }

//     public void displayPerson(){

//         System.out.println("Name : "+name);
//         System.out.println("Age :"+age);

//     }
// }

// class Teacher extends Person{

//     protected String subject;
//     protected int salary;

//     public void setTeacher(String subject, int salary){
        
//         this.subject = subject;

//         if(salary<20000){
//             //salary = 20000;
//             this.salary = 20000;
//         }else{
//             this.salary = salary;
//         }
//     }

//     public void displayTeacher(){
        
//         System.out.println("Subject : "+subject);
//         System.out.println("Salary : "+salary);

//     }
// }

// public class examples{

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter name : ");
//         String name = sc.nextLine();

//         System.out.println("Enter Age : ");
//         int age = sc.nextInt();

//         sc.nextLine();

//         System.out.println("Enter Subject : ");
//         String subject = sc.nextLine();

//         System.out.println("Enter Salary : ");
//         int salary = sc.nextInt();

//         // Person p = new Person();

//         Teacher t = new Teacher();
        
//         t.setPerson(name,age);
//         t.setTeacher(subject,salary);

//         t.displayPerson();
//         t.displayTeacher();

//     }
// }
///
///
///
///
////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////HARD SINGLE INHERITANCE PROBLEMS(to be continued during the semester break...)/////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// 
///
/// 
/// 


//  e.g.  1

// import java.util.Scanner;

// class Employee{

//     protected int employeeId;
//     protected String employeeName;
//     protected int basicSalary;

//     public void setEmployee(int employeeId, String employeeName, int basicSalary){

//         this.employeeId = employeeId;
//         this.employeeName = employeeName;
        
//         if(basicSalary<20000){
//             this.basicSalary = 20000;
//         }
//         else{
//             this.basicSalary = basicSalary;
//         } 
//     }

//     public void displayEmployee(){
        
//         System.out.println("Employee ID : "+employeeId);
//         System.out.println("Employee Name :"+employeeName);
//         System.out.println("Basic Salary :"+basicSalary);

//     }
// }

// class SoftwareEngineer extends Employee{

//     private String programmingLanguage;
//     private int yearsOfExperience;

//     public void setSoftwareEngineer(String programmingLangauge, int yearsOfExperience){

//         this.programmingLanguage = programmingLanguage;

//         if(yearsOfExperience<0){
//             this.yearsOfExperience = 0;
//         }
//         else{
//             this.yearsOfExperience = yearsOfExperience;
//         }
//     }
//     int bonus = 0;
//     // public int setBonus(int yearsOfExperience,int basicSalary){
        
//         public void displayBonus(){
        
//             if(yearsOfExperience<2){
//                 bonus = (basicSalary)*(5/100);
//             }
//             else if(yearsOfExperience>2 && yearsOfExperience<5){
//                 bonus = (basicSalary)*(10/100);
//             }
//             else{
//                 bonus = (basicSalary)*(20/100);
//             }

//             System.out.println("Bonus: "+bonus);
//         }

//     public void displayFinalSalary(){

//         System.out.println("Final Salary : "+(basicSalary-bonus));

//     }
// }

// public class examples{

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Employee ID : ");
//         int employeeId = sc.nextInt();

//         sc.nextLine();

//         System.out.println("Enter Name : ");
//         String employeeName = sc.nextLine();

//         System.out.println("Enter Basic Salary : ");
//         int basicSalary = sc.nextInt();

//         //sc.nextLine();

//         System.out.println("Enter the Programming Language : ");
//         String programmingLanguage = sc.nextLine();

//         System.out.println("Enter Years of Experience : ");
//         int yearsOfExperience = sc.nextInt();

//         SoftwareEngineer s = new SoftwareEngineer();

//         s.setEmployee(employeeId, employeeName, basicSalary);
//         s.setSoftwareEngineer(programmingLanguage,yearsOfExperience);

//         s.displayEmployee();
//         s.displayBonus();
//         s.displayFinalSalary();

//     }
// }










