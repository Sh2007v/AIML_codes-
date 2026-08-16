package DSA.TwoPointers;

import java.util.Scanner;
// import java.util.Arrays;

public class practice {
    
    //FINDING PAIR WITH GIVEN SUM
    // static void findPair(int[] arr, int target){
        
    //     int left = 0;
    //     int right = arr.length-1;
        
    //     boolean found = false;

    //     while(left<right){
    //         int sum = arr[left]+arr[right];

    //         if(sum<target){
    //             left++;
    //         }else if(sum>target){
    //             right--;
    //         }else{
    //             found = true;
    //             //System.out.println("Pair found");
    //             break;
    //         }
    //     }
    //     if(found){
    //         System.out.println("Pair Found");
    //     }else{
    //         System.out.println("Pair does not exist");
    //     }
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter the size:");
    //     int size = sc.nextInt();

    //     int[] arr = new int[size];

    //     System.out.println("Enter the array : ");
    //     for(int i=0;i<size;i++){
    //         arr[i] = sc.nextInt();
    //     }

    //     System.out.println("Enter the sum : ");
    //     int target = sc.nextInt();

    //     Arrays.sort(arr);
    //     findPair(arr,target);

    // }

    //REVERSE AN ARRAY

    // static void reverse(int[] arr){
        
    //     int left=0;
    //     int right=arr.length-1;

    //     while(left<right){
    //     {
    //         int temp = arr[right];
    //         arr[right] = arr[left];
    //         arr[left] = temp;

    //     }
    //     left++;
    //     right--;
    // }
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }


    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter the size : ");
    //     int size = sc.nextInt();

    //     int[] arr = new int[size];

    //     for(int i=0;i<size;i++){
    //         arr[i] = sc.nextInt();
    //     }

    //     reverse(arr);
    // }

    //IS GIVEN ARRAY PALINDROME
    // static void isPalindrome(int[] arr){
    //     int left=0;
    //     int right = arr.length-1;

    //     boolean notPal = false;

    //     while(left<right){
    //         if(arr[left] != arr[right]){
    //             notPal = true;
    //             break;
    //         }
    //         left++;
    //         right--;
    //     }
    //     if(notPal){
    //         System.out.println("Not Palindrome");
    //     }
    //     else{
    //         System.out.println("Palindrome");
    //     }
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter the size : ");
    //     int size = sc.nextInt();

    //     int[] arr = new int[size];

    //     System.out.println("Enter the Array : ");
    //     for(int i=0;i<size;i++){
    //         arr[i] = sc.nextInt();
    //     }
    //     isPalindrome(arr);
    // }

    //FIND PAIR DIFFERENCE
    // static void findpairDiff(int[] arr, int target){
    //     int left = 0;
    //     int right = arr.length-1;

    //     boolean found = false;
    //     while(left<right){
    //         int diff = arr[left] - arr[right];

    //         if(diff==target){
    //             found = true;
    //             break;
    //         }
    //         else if(diff<target){
    //             left++;
    //         }else{
    //             right--;
    //         }
    //     }
    //     if(found){
    //         System.out.println("Pair found !");
    //     }else{
    //         System.out.println("No Pair found ");
    //     }
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter the size : ");
    //     int size = sc.nextInt();

    //     int[] arr = new int[size];

    //     System.out.println("Enter the Array : ");
        
    //     for(int i=0;i<size;i++){
    //         arr[i] = sc.nextInt();
    //     }

    //     System.out.println("Enter the required difference : ");
    //     int target = sc.nextInt();

    //     findpairDiff(arr, target);

    // }

    //Remove duplicate elements (most important)
//     static void removeDuplicates(int[] arr) {

//     int slow = 0;
//     int fast = 1;

//     while (fast < arr.length) {

//         if (arr[slow] != arr[fast]) {
//             slow++;
//             arr[slow] = arr[fast];
//         }

//         fast++;
//     }

//     // Print unique elements
//     for (int i = 0; i <= slow; i++) {
//         System.out.print(arr[i] + " ");
//     }
// }

// public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size:");
//     int size = sc.nextInt();

//     int[] arr = new int[size];

//     System.out.println("Enter the Array:");
//     for (int i = 0; i < size; i++) {
//         arr[i] = sc.nextInt();
//     }

//     removeDuplicates(arr);


//     }

//Move Zeroes to the end of an array
// static void moveZeroes(int[] arr) {

//     int slow = 0;

//     for(int fast = 0; fast < arr.length; fast++) {

//         if(arr[fast] != 0) {

//             int temp = arr[slow];
//             arr[slow] = arr[fast];
//             arr[fast] = temp;

//             slow++;
//         }
//     }

//     for(int i = 0; i < arr.length; i++) {
//         System.out.print(arr[i] + " ");
//     }
// }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size : ");
//     int size = sc.nextInt();

//     int[] arr = new int[size];

//     for(int i=0;i<arr.length;i++){
//         arr[i] = sc.nextInt();
//     }
//     moveZeroes(arr);
//     }

// REMOVE A PARTICULAR ELEMENT IN PLACE

// static void removeElem(int[] arr, int x){
    
//     int start = 0;
//     for(int f=0;f<arr.length;f++){
//         if(arr[f]!=x){

//             int temp = arr[f];
//             arr[f] = arr[start];
//             arr[start] = temp;

//             start++;
        
//         }
//     }

//     int ct = 0;

//     for(int i=0;i<arr.length;i++){
//         if(arr[i]==x){
//             ct++;
//         }
//     }

//     for(int i=0;i<arr.length-ct;i++){
//         System.out.print(arr[i]+" ");
//     }
// }
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size :");
//     int size = sc.nextInt();

//     int[] arr = new int[size];

//     System.out.println("Enter the elem : ");
//     int x = sc.nextInt();

//     System.out.println("Enter the Array :");
//     for(int i=0;i<arr.length;i++){
//         arr[i] = sc.nextInt();
//     }
//     removeElem(arr, x);    
// }



}