 package Java.Assignments;

 import java.util.*;
public class Assignment2 {
    
//     // interface Area{
//     //     public void display();
//     // }
//     // class Square implements Area{
//     //     public void display(){
//     //         System.out.println("I am from Square");
//     //     }
//     // }
//     // class Rect implements Area{
//     //     public void display(){
//     //         System.out.println("I am from Rectangle");
//     //     }
//     // }
//     // public class Main{
//     //     public static void main(String args[]){
//     //         Square Obj = new Square();
//     //         Obj.display();
//     //         Rect Obj1 = new Rect();
//     //         Obj1.display();
//     //     }
//     // }

//     // class Rect implements Area{

//     // }

//     // public static void main(String[] args){
//     //     Area Obj = new Square();
//     //     Obj1.display();
//     //     Area Obj1=new Rect();
//     //     Obj1.display();
//     // }

//     // }

// interface Example{
//     public void display1();
//     public void display2();
// }




// }

// public static void main(String[] args){
//     int a[] = new int[5];

//     ArrayList<String> a1 = new ArrayList<String>();
//     a1.add("Apple");
//     a1.add("Banana");
//     a1.add("Jackfruit");
//     a1.add("Custard apple");
//     System.out.println(a1);
//     a1.add(0,"Orange");
//     a1.remove(4);
//     System.out.println(a1);
//     System.out.println(a1.get(3));

//     }

// public static void main(String[] args){
//     ArrayList<Integer> a1 = new ArrayList<Integer>();
//     a1.add(5);
//     a1.add(4);
//     a1.add(3);
//     a1.add(2);
//     a1.add(1);
//     System.out.println(a1);
//     /*for(int i=0;i<a1.size()-1;i++){
//         for(int j=0;j<a1.size()-2;j++){
//             if(a1.get(j)>a1.get(j+1))
//             temp = a1.get(i+1);
//             a1.set(j+1.a1.get(j));
//             a1.set(j,temp);
//         }*/
//        Collections.sort(a1);
//         System.out.println(a1);
//     }

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;

// class Student {
//     public int Rollno;
//     public String Name;
//     public double Cgpa;

//     public Student(int Rollno, String Name, double Cgpa) {
//         this.Rollno = Rollno;
//         this.Name = Name;
//         this.Cgpa = Cgpa;
//     }

//     // Overriding toString() to display Student object details
//     @Override
//     public String toString() {
//         return "Student[RollNo=" + Rollno + ", Name=" + Name + ", CGPA=" + Cgpa + "]";
//     }
// }

// public class Example {
//     public static void main(String arg[]) {
//         // Fixed spelling of ArrayList and missing closing brackets in main method
//         ArrayList<Student> stud = new ArrayList<Student>();
        
//         stud.add(new Student(101, "Ayush", 99.99));
//         stud.add(new Student(102, "Bala", 98.99));
//         stud.add(new Student(103, "Kumar", 97.97));
//         stud.add(new Student(104, "Mini", 96.99));

//         System.out.println("--- Before Sorting ---");
//         for (Student s : stud) {
//             System.out.println(s);
//         }

//         // Sorting using a custom Comparator (Highest CGPA first)
//         Collections.sort(stud, new Comparator<Student>() {
//             @Override
//             public int compare(Student s1, Student s2) {
//                 return Double.compare(s2.Cgpa, s1.Cgpa); 
//             }
//         });

//         System.out.println("\n--- After Sorting (By CGPA Descending) ---");
//         for (Student s : stud) {
//             System.out.println(s);
//         }
//     }
// }

// import java.util.LinkedList;
// import java.util.Iterator;

// class Student {
//     public int Rollno;
//     public String Name;
//     public double Cgpa;

//     public Student(int Rollno, String Name, double Cgpa) {
//         this.Rollno = Rollno;
//         this.Name = Name;
//         this.Cgpa = Cgpa;
//     }

//     @Override
//     public String toString() {
//         return "Student[RollNo=" + Rollno + ", Name=" + Name + ", CGPA=" + Cgpa + "]";
//     }
// }

// public class LinkedListExample {
//     public static void main(String[] args) {
//         // Create a LinkedList of Student objects
//         LinkedList<Student> studentList = new LinkedList<>();

//         // 1. Adding elements to the end of the LinkedList
//         studentList.add(new Student(101, "Ayush", 99.99));
//         studentList.add(new Student(102, "Bala", 98.99));
//         studentList.add(new Student(104, "Mini", 96.99));

//         // 2. Inserting an element at a specific position (Index 2)
//         studentList.add(2, new Student(103, "Kumar", 97.97));

//         // 3. Adding elements to the absolute front and back (Deque methods)
//         studentList.addFirst(new Student(100, "Zayan", 95.50));
//         studentList.addLast(new Student(105, "Rahul", 94.20));

//         // 4. Displaying the list using a standard For-Each loop
//         System.out.println("--- Iterating using For-Each Loop ---");
//         for (Student s : studentList) {
//             System.out.println(s);
//         }

//         // 5. Removing the first and last elements
//         studentList.removeFirst(); // Removes Zayan
//         studentList.removeLast();  // Removes Rahul

//         // 6. Displaying the list using an Iterator
//         System.out.println("\n--- Iterating using Iterator (After Removals) ---");
//         Iterator<Student> itr = studentList.iterator();
//         while (itr.hasNext()) {
//             System.out.println(itr.next());
//         }
//     }
// }


// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Scanner;

// public class SimpleFileIO {
//     public static void main(String[] args) {
//         String fileName = "sample.txt";

//         // 1. WRITE FUNCTION
//         try {
//             FileWriter writer = new FileWriter(fileName);
//             writer.write("Hello, World!\n");
//             writer.write("This is a simple Java file program.");
//             writer.close(); // Saves and closes the file
//             System.out.println("Successfully written to the file.");
//         } catch (IOException e) {
//             System.out.println("An error occurred while writing.");
//         }

//         // 2. READ FUNCTION
//         try {
//             File myFile = new File(fileName);
//             Scanner reader = new Scanner(myFile);
            
//             System.out.println("\n--- Reading Content ---");
//             while (reader.hasNextLine()) {
//                 String data = reader.nextLine();
//                 System.out.println(data);
//             }
//             reader.close(); // Closes the scanner
//         } catch (IOException e) {
//             System.out.println("An error occurred while reading.");
//         }
//     }
// }


}
 