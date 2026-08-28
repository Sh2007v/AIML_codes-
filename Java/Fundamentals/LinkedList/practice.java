package Java.Fundamentals.LinkedList;

import java.util.Scanner;
import java.util.LinkedList;

// public class practice {
    
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         LinkedList<Integer> numbers = new LinkedList<>();

//         System.out.print("Enter the size : ");
//         int n = sc.nextInt();

//         for(int i=0;i<n;i++){
//             int val = sc.nextInt();
//             numbers.add(val);
//         }

//         for(int i=0;i<numbers.size();i++){
//             System.out.print(numbers.get(i)+" ");
//         }
//     }
// }


//


public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        LinkedList<Integer> num = new LinkedList<>();
        
        for(int i=0;i<n;i++){
            num.add(sc.nextInt());
        }

        


    }
}
