import java.util.Scanner;


class Employee{
    String name;
    int salary;
    displayEmployee(){
        System.out.println("Name : "+name);
        System.out.println("Salary :"+salary);
    }
}
class Manager extends Employee{
    String department;
    displayEmployee();
    System.out.println("Department :"+department);
}
class Developer extends Employee{
    String programminLanguage;
    displayEmployee();
    System.out.println("Programmin Language : "+programmingLanguage);
}
public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    }
}