// 5 quality programs for linear search

//Search an element in an array
import java.util.Scanner;

// public class LinearSearch1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter elements:");
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter element to search: ");
//         int key = sc.nextInt();

//         boolean found = false;

//         for(int i = 0; i < n; i++){
//             if(arr[i] == key){
//                 found = true;
//                 break;
//             }
//         }

//         if(found)
//             System.out.println("Element Found");
//         else
//             System.out.println("Element Not Found");
//     }
// }

//Find the index of an Element
import java.util.Scanner;

// public class LinearSearch2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter elements:");
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter element to search: ");
//         int key = sc.nextInt();

//         int index = -1;

//         for(int i = 0; i < n; i++){
//             if(arr[i] == key){
//                 index = i;
//                 break;
//             }
//         }

//         if(index != -1)
//             System.out.println("Element found at index: " + index);
//         else
//             System.out.println("Element not found");
//     }
// }

// Count occurences of an Element
// import java.util.Scanner;

// public class LinearSearch3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter elements:");
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter element to search: ");
//         int key = sc.nextInt();

//         int count = 0;

//         for(int i = 0; i < n; i++){
//             if(arr[i] == key){
//                 count++;
//             }
//         }

//         System.out.println("Occurrences = " + count);
//     }
// }

// Find first and last occurence
// import java.util.Scanner;

// public class LinearSearch4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter elements:");
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter element to search: ");
//         int key = sc.nextInt();

//         int first = -1;
//         int last = -1;

//         for(int i = 0; i < n; i++){
//             if(arr[i] == key){
//                 if(first == -1)
//                     first = i;

//                 last = i;
//             }
//         }

//         if(first == -1){
//             System.out.println("Element not found");
//         }
//         else{
//             System.out.println("First Occurrence: " + first);
//             System.out.println("Last Occurrence: " + last);
//         }
//     }
// }

//Find all positions of occurences of an Elem
// import java.util.Scanner;

// public class LinearSearch5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter elements:");
//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter element to search: ");
//         int key = sc.nextInt();

//         boolean found = false;

//         System.out.print("Element found at indices: ");

//         for(int i = 0; i < n; i++){
//             if(arr[i] == key){
//                 System.out.print(i + " ");
//                 found = true;
//             }
//         }

//         if(!found){
//             System.out.println("Element not found");
//         }
//     }
// }

// Find missing number in an Array

import java.util.Scanner;

public class LinearSearch6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Size : ");
        int size = sc.nextInt();

        System.out.println("Enter Array : ");
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for(int i=1;i<=size+1;i++){
            sum+=i;
        }

        int arr_sum = 0;

        for(int i=0;i<arr.length;i++){
            arr_sum+=arr[i];
        }
         
        int miss_num = sum - arr_sum;

        System.out.println("Missing Number : "+miss_num);


    }
}