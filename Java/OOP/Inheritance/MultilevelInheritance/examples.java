package Java.OOP.Inheritance.MultilevelInheritance;


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





// import java.util.Scanner;

// class Vehicle{

//     protected String brand;

//     public void setVehicle(String brand){

//         this.brand = brand;
//     }

//     public void getVehicle(){

//         System.out.println("Brand : "+brand);

//     }

// }

// class Car extends Vehicle{

//     protected String model;

//     public void setCar(String model){

//         this.model = model;

//     }
//     public void getCar(){

//         System.out.println("Model : "+model);

//     }
// }

// class ElectricCar extends Car{

//     private int batteryCapacity;

//     public void setElectricCar(int batteryCapacity){

//         if(batteryCapacity<20){

//             this.batteryCapacity = batteryCapacity;

//         }
//     }

//     public void getElectricCar(){

//         System.out.println("Battery : "+ batteryCapacity);

//     }
// }

// public class examples{

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Brand :");
//         String brand = sc.nextLine();

//         System.out.println("Model : ");
//         String model = sc.nextLine();

//         System.out.println("Enter Battery Capacity : ");
//         int batteryCapacity = sc.nextInt();

//         ElectricCar e = new ElectricCar();

//         e.setVehicle(brand);
//         e.setCar(model);
//         e.setElectricCar(batteryCapacity);

//         System.out.println();
        
//         e.getVehicle();
//         e.getCar();
//         e.getElectricCar();
//     }
// }




// import java.util.Scanner;

// class Account{

//     protected int accountNumber;

//     public void setaccount(int accountNumber){

//         this.accountNumber = accountNumber;

//     }

//     public void displayaccount(){

//         System.out.println("Account Number : "+accountNumber);

//     }

// }

// class SavingsAccount extends Account{

//     protected int balance;

//     public void setbalance(int balance){

//         if(balance<1000){

//             this.balance = 1000;

//         }
//         else{

//             this.balance = balance;

//         }
//     }

//     public void displaybalance(){

//         System.out.println("Balance : "+balance);
//     }
// }

// class PremiumSavings extends SavingsAccount{

//     private int interestRate;

//     public void setinterestRate(int interestRate){

//         if(interestRate<4){

//             this.interestRate = 4;

//         }else{

//             this.interestRate = interestRate;
//         }
//     }

//     public void displayinterestRate(){

//         System.out.println("Interest Rate : "+interestRate+"%");

//     }
// }

// public class examples{

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Account Number : ");
//         int accountNumber = sc.nextInt();

//         sc.nextLine();

//         System.out.println("Enter Balance : ");
//         int balance = sc.nextInt();

//         sc.nextLine();

//         System.out.println("Enter Interest Rate : ");
//         int interestRate = sc.nextInt();

//         PremiumSavings p = new PremiumSavings();

//         p.setaccount(accountNumber);
//         p.setbalance(balance);
//         p.setinterestRate(interestRate);

//         p.displayaccount();
//         p.displaybalance();
//         p.displayinterestRate();        
//     }
// }
////////////////////////////////////////////
///  I WILL NOT STOP !!!! //////////////////
////////////////////////////////////////////
/// 
/// 

