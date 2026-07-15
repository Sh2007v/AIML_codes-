// package Java.OOP.Constructors;

// import java.util.Scanner;

// class Rectangle{

//         private int length;
//         private int breadth;

//         public void setRectangle(int length, int breadth){
//             if(length>=0){
//                 this.length = length;
//             }
//             else{
//                 this.length = 1;
//             }

//             if(breadth>=0){
//                 this.breadth = breadth;
//             }
//             else{
//                 this.breadth = 1;
//             }
//     }
//         public void getRectangle(){

//             System.out.println("Area : "+(length*breadth));
        
//         }
// }

// public class examples{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int length = sc.nextInt();
//         sc.nextLine();
        
//         int breadth = sc.nextInt();

//         Rectangle r = new Rectangle();

//         r.setRectangle(length, breadth);
//         r.getRectangle();
//     } 
// }
// public class examples {
//     int a, b, c; float r1;
//     public examples() {
//         a=0; b=0;
//     }
//     public examples(int t1, int t2) {
//         a=t1; b=t2; c=0;
//     }
//     public void addData() {
//         c=a+b;
//         System.out.printf("a=%d b =%d c=%d\n", a, b, c);
//     }
//     public void subData() {
//         c=a-b;
//         System.out.printf("a=%d b=%d c=%d\n", a, b, c);
//     }
//     public void mulData() {
//         c=a*b;
//         System.out.printf("a=%d b=%d c=%d\n", a, b, c);
//     }
//     public static void main(String[] args) {
//         examples obj = new examples();
//         examples obj1 = new examples(5,6);
//         obj1.addData();
//         obj1.subData();
//         obj1.mulData();
//     }
// }

// //public class examples{

//     int radius; int l,b;
//     public Area(int r1) {
//         radius=r1;
//         System.out.println((22/7)*radius*radius);
//     }
//     public Area(int t1, int t2) {
//         l=t1; b=t2;
//         System.out.printf("Area of Rectangle = %d", l*b);
//     }
//     public static void main(String[] args) {
//         Area obj = new Area(7);
//         Area obj1 = new Area(3,5);
//     }
// }




//Magic Square

import java.util.Scanner;
public class example{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();


        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                
            }
        }

    }
}