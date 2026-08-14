// 5 quality programs for linear search

//Search an element in an array
// import java.util.Scanner;

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
// import java.util.Scanner;

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

// import java.util.Scanner;

// public class LinearSearch6{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Size : ");
//         int size = sc.nextInt();

//         System.out.println("Enter Array : ");
//         int[] arr = new int[size];

//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }

//         int sum = 0;

//         for(int i=1;i<=size+1;i++){
//             sum+=i;
//         }

//         int arr_sum = 0;

//         for(int i=0;i<arr.length;i++){
//             arr_sum+=arr[i];
//         }
         
//         int miss_num = sum - arr_sum;

//         System.out.println("Missing Number : "+miss_num);


//     }
// }



// 5 quality programs from the Binary Search

// import java.util.Scanner;

// public class ArraysDsa{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         for(int i=0;i<arr.length;i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.println(".Enter the target to find : ");
//         int key = sc.nextInt();

//         int low = 0;
//         int high = n-1;
//         int index = -1;

//         while(low<=high){
//             int mid = low+(high-low)/2;

//             if(arr[mid] == key){
//                 index = mid; 
//                 break;
//             }
//             else if(key<arr[mid]){
//                 high = mid - 1;
//             }
//             else{
//                 low = mid + 1;
//             }
//         }

//         if(index!=-1){
//             System.out.println("Elem found at index : "+ index);
//         }
//         else{
//             System.out.println("Element not found");
//         }
//     }
// }


// 2. Search Insert Position
// import java.util.Scanner;

// public class BinarySearch2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter sorted array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter target element: ");
//         int key = sc.nextInt();

//         int low = 0;
//         int high = n - 1;
//         int position = -1;

//         while (low <= high) {

//             int mid = low + (high - low) / 2;

//             if (arr[mid] == key) {
//                 position = mid;
//                 break;
//             }
//             else if (key < arr[mid]) {
//                 high = mid - 1;
//             }
//             else {
//                 low = mid + 1;
//             }
//         }

//         if (position == -1) {
//             position = low;
//         }

//         System.out.println("Insert Position: " + position);

//         sc.close();
//     }
// }


//3. First Occurence of an Element
// import java.util.Scanner;

// public class BinarySearch2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter sorted array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter target element: ");
//         int key = sc.nextInt();

//         int low = 0;
//         int high = n - 1;
//         int position = -1;

//         while (low <= high) {

//             int mid = low + (high - low) / 2;

//             if (arr[mid] == key) {
//                 position = mid;
//                 break;
//             }
//             else if (key < arr[mid]) {
//                 high = mid - 1;
//             }
//             else {
//                 low = mid + 1;
//             }
//         }

//         if (position == -1) {
//             position = low;
//         }

//         System.out.println("Insert Position: " + position);

//         sc.close();
//     }
// }

// 4. Last Occurence of an Element
// import java.util.Scanner;

// public class BinarySearch4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter sorted array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter element to search: ");
//         int key = sc.nextInt();

//         int low = 0;
//         int high = n - 1;
//         int pos = -1;

//         while (low <= high) {

//             int mid = low + (high - low) / 2;

//             if (arr[mid] == key) {
//                 pos = mid;
//                 low = mid + 1;      // Continue searching on the right
//             }
//             else if (arr[mid] < key) {
//                 low = mid + 1;
//             }
//             else {
//                 high = mid - 1;
//             }
//         }

//         if (pos != -1) {
//             System.out.println("Last Occurrence: " + pos);
//         } else {
//             System.out.println("Element not found.");
//         }

//         sc.close();
//     }
// }

//5. Find no of Occurence of an element
// Find First Occurrence
// int low = 0;
// int high = arr.length - 1;
// int first = -1;

// while (low <= high) {

//     int mid = low + (high - low) / 2;

//     if (arr[mid] == key) {
//         first = mid;
//         high = mid - 1;
//     }
//     else if (arr[mid] < key) {
//         low = mid + 1;
//     }
//     else {
//         high = mid - 1;
//     }
// }

// // Find Last Occurrence
// low = 0;
// high = arr.length - 1;
// int last = -1;

// while (low <= high) {

//     int mid = low + (high - low) / 2;

//     if (arr[mid] == key) {
//         last = mid;
//         low = mid + 1;
//     }
//     else if (arr[mid] < key) {
//         low = mid + 1;
//     }
//     else {
//         high = mid - 1;
//     }
// }

// // Count Occurrences
// if (first == -1) {
//     System.out.println("Count = 0");
// }
// else {
//     int count = last - first + 1;
//     System.out.println("Count = " + count);
// }

