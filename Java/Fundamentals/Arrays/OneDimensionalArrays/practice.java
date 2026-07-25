package Java.Fundamentals.Arrays.OneDimensionalArrays;

public class practice {
//         System.out.println("Enter the size of array : ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter the array ");
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


//Max and min element.

// import java.util.Scanner;
// public class arrays_rev{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size of array : ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter array ");

//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int max = arr[0];
//         int min = arr[0];

//         for(int i=0;i<n;i++){
//            if(arr[i]>max){
//             max = arr[i];
//            }
//         }
        
//         for(int i=0;i<n;i++){
//             if(arr[i]<min){
//                 min = arr[i];
//             }
//         }
//         System.out.println("Max element : "+max);
//         System.out.println("Min element : "+min);
//     }
// }

//ct_even and ct_odd.
// import java.util.Scanner;

// public class arrays_rev{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter num");
//         int n =sc.nextInt();

//         int[] arr = new int[n];

//         int ct_even=0;
//         int ct_odd=0;

//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//             if(arr[i]%2==0){
//                 ct_even++;
//             }
//             else{
//                 ct_odd++;
//             }
//         }
//         System.out.println("Odd Num Count: "+ct_odd);
//         System.out.println("Even Num Count: "+ct_even);
//     }
// }

//reverse an array

// import java.util.Scanner;
// public class arrays_rev{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size :");
//         int n =sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter the array :");
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Reversed array :");
//         for(int i=n-1;i>-1;i--){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


//Sum and average of an array

// import java.util.Scanner;
// public class arrays_rev{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter size of array : ");
//         int n = sc.nextInt();

//         sc.nextLine();

//         int[] arr = new int[n];

//         System.out.println("Enter the array :");
        
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int sum = 0;
        
//             for(int i=0;i<n;i++){
//                 sum+=arr[i];
//             }
//         System.out.println("Sum : "+sum);
//     }
// }

//THIRD LARGEST ELEMENT
// import java.util.Scanner;
// public class arrays_rev{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Size of Array :");
//         int size = sc.nextInt();

//         int[] arr = new int[size];

//         System.out.println("Enter the Array :");
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i=0;i<size;i++){
//             for(int j=i+1;j<size;j++){
//                 if(arr[i]>arr[j]){
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                 }
//             }
//         }
//         for(int i=0;i<size;i++){
            
//                 System.out.print(arr[i]+" ");
            
//         }
//         System.out.println();

//         System.out.println("Third Largest Element : " + arr[size-3]);
//     }
// }


//SORTING AN ARRAY USING BUBBLE SORT
// import java.util.Scanner;
// public class arrays_rev{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Size of Array :");
//         int size = sc.nextInt();

//         int[] arr = new int[size];

//         System.out.println("Enter the Array :");
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<size+1;i++){
//             if(arr[i]>arr[i+1]){
//                 int temp = arr[i+1];
//                 arr[i+1] = arr[i];
//                 arr[i] = temp;
//             }
//         }
//         for(int i=0;i<size;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }



//PLACE ALL ZEROES AT THE END OF AN ARRAY

// import java.util.Scanner;
// public class arrays_rev{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Size of Array :");
//         int size = sc.nextInt();

//         int[] arr = new int[size];

//         System.out.println("Enter the Array :");
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<=size;i++){
//             if(arr[i]==0 && arr[i+1]!=0){
//                 int temp = arr[i+1];
//                 arr[i+1] = arr[i];
//                 arr[i] = temp;
//             }
//         }
//         for(int i=0;i<size;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }
    
}

// =======================================================
// PROGRAM 1 : Largest & Smallest Element with Indices
// =======================================================

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter Elements:");

//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int max = arr[0];
//         int min = arr[0];
//         int maxIndex = 0;
//         int minIndex = 0;

//         for(int i = 1; i < n; i++) {

//             if(arr[i] > max) {
//                 max = arr[i];
//                 maxIndex = i;
//             }

//             if(arr[i] < min) {
//                 min = arr[i];
//                 minIndex = i;
//             }

//         }

//         System.out.println("Maximum Element = " + max + " at Index " + maxIndex);
//         System.out.println("Minimum Element = " + min + " at Index " + minIndex);

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 2 : Count Elements Greater Than Average
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         int sum = 0;

//         System.out.println("Enter Elements:");

//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//             sum += arr[i];
//         }

//         double average = (double) sum / n;

//         int count = 0;

//         for(int i = 0; i < n; i++) {

//             if(arr[i] > average)
//                 count++;

//         }

//         System.out.println("Average = " + average);
//         System.out.println("Count = " + count);

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 3 : Check Whether Array is Sorted
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter Elements:");

//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         boolean sorted = true;

//         for(int i = 0; i < n - 1; i++) {

//             if(arr[i] > arr[i + 1]) {
//                 sorted = false;
//                 break;
//             }

//         }

//         if(sorted)
//             System.out.println("Array is Sorted");
//         else
//             System.out.println("Array is Not Sorted");

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 4 : Count Positive, Negative and Zero Elements
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         int positive = 0;
//         int negative = 0;
//         int zero = 0;

//         System.out.println("Enter Elements:");

//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         for(int i = 0; i < n; i++) {

//             if(arr[i] > 0)
//                 positive++;

//             else if(arr[i] < 0)
//                 negative++;

//             else
//                 zero++;

//         }

//         System.out.println("Positive Count = " + positive);
//         System.out.println("Negative Count = " + negative);
//         System.out.println("Zero Count = " + zero);

//         sc.close();
//     }
// }

// // =======================================================
// // PROGRAM 1 : Find Maximum Element Using Method
// // =======================================================

// // import java.util.Scanner;

// // public class Main {

// //     public static int findMax(int[] arr) {

// //         int max = arr[0];

// //         for(int i = 1; i < arr.length; i++) {

// //             if(arr[i] > max) {
// //                 max = arr[i];
// //             }

// //         }

// //         return max;
// //     }

// //     public static void main(String[] args) {

// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Enter Size: ");
// //         int n = sc.nextInt();

// //         int[] arr = new int[n];

// //         System.out.println("Enter Elements:");

// //         for(int i = 0; i < n; i++) {
// //             arr[i] = sc.nextInt();
// //         }

// //         System.out.println("Maximum Element = " + findMax(arr));

// //         sc.close();
// //     }
// // }


// // // =======================================================
// // // PROGRAM 2 : Find Minimum Element Using Method
// // // =======================================================

// // import java.util.Scanner;

// // public class Main {

// //     public static int findMin(int[] arr) {

// //         int min = arr[0];

// //         for(int i = 1; i < arr.length; i++) {

// //             if(arr[i] < min) {
// //                 min = arr[i];
// //             }

// //         }

// //         return min;
// //     }

// //     public static void main(String[] args) {

// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Enter Size: ");
// //         int n = sc.nextInt();

// //         int[] arr = new int[n];

// //         System.out.println("Enter Elements:");

// //         for(int i = 0; i < n; i++) {
// //             arr[i] = sc.nextInt();
// //         }

// //         System.out.println("Minimum Element = " + findMin(arr));

// //         sc.close();
// //     }
// // }


// // // =======================================================
// // // PROGRAM 3 : Find Sum and Average Using Methods
// // // =======================================================

// // import java.util.Scanner;

// // public class Main {

// //     public static int findSum(int[] arr) {

// //         int sum = 0;

// //         for(int i = 0; i < arr.length; i++) {
// //             sum += arr[i];
// //         }

// //         return sum;
// //     }

// //     public static double findAverage(int[] arr) {

// //         return (double) findSum(arr) / arr.length;

// //     }

// //     public static void main(String[] args) {

// //         Scanner sc = new Scanner(System.in);

// //         System.out.print("Enter Size: ");
// //         int n = sc.nextInt();

// //         int[] arr = new int[n];

// //         System.out.println("Enter Elements:");

// //         for(int i = 0; i < n; i++) {
// //             arr[i] = sc.nextInt();
// //         }

// //         System.out.println("Sum = " + findSum(arr));
// //         System.out.println("Average = " + findAverage(arr));

// //         sc.close();
// //     }
// // }

// // =======================================================
// // PROGRAM 4 : Count Even and Odd Elements Using Methods
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static int countEven(int[] arr) {

//         int count = 0;

//         for(int i = 0; i < arr.length; i++) {

//             if(arr[i] % 2 == 0)
//                 count++;

//         }

//         return count;
//     }

//     public static int countOdd(int[] arr) {

//         int count = 0;

//         for(int i = 0; i < arr.length; i++) {

//             if(arr[i] % 2 != 0)
//                 count++;

//         }

//         return count;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter Elements:");

//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Even Count = " + countEven(arr));
//         System.out.println("Odd Count = " + countOdd(arr));

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 5 : Linear Search Using Method
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static int linearSearch(int[] arr, int key) {

//         for(int i = 0; i < arr.length; i++) {

//             if(arr[i] == key)
//                 return i;

//         }

//         return -1;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter Elements:");

//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter Element to Search: ");
//         int key = sc.nextInt();

//         int index = linearSearch(arr, key);

//         if(index != -1)
//             System.out.println("Element Found at Index " + index);
//         else
//             System.out.println("Element Not Found");

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 6 : Reverse Array Using Method
// // =======================================================

// import java.util.Scanner;
// import java.util.Arrays;

// public class Main {

//     public static void reverseArray(int[] arr) {

//         int start = 0;
//         int end = arr.length - 1;

//         while(start < end) {

//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;

//             start++;
//             end--;

//         }
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter Elements:");

//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         reverseArray(arr);

//         System.out.println("Reversed Array:");
//         System.out.println(Arrays.toString(arr));

//         sc.close();
//     }
// }

