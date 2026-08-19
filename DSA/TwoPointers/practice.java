package DSA.TwoPointers;

import java.util.Scanner;
// import java.util.Arrays;

public class practice {

    // FINDING PAIR WITH GIVEN SUM
    // static void findPair(int[] arr, int target){

    // int left = 0;
    // int right = arr.length-1;

    // boolean found = false;

    // while(left<right){
    // int sum = arr[left]+arr[right];

    // if(sum<target){
    // left++;
    // }else if(sum>target){
    // right--;
    // }else{
    // found = true;
    // //System.out.println("Pair found");
    // break;
    // }
    // }
    // if(found){
    // System.out.println("Pair Found");
    // }else{
    // System.out.println("Pair does not exist");
    // }
    // }
    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter the size:");
    // int size = sc.nextInt();

    // int[] arr = new int[size];

    // System.out.println("Enter the array : ");
    // for(int i=0;i<size;i++){
    // arr[i] = sc.nextInt();
    // }

    // System.out.println("Enter the sum : ");
    // int target = sc.nextInt();

    // Arrays.sort(arr);
    // findPair(arr,target);

    // }

    // REVERSE AN ARRAY

    // static void reverse(int[] arr){

    // int left=0;
    // int right=arr.length-1;

    // while(left<right){
    // {
    // int temp = arr[right];
    // arr[right] = arr[left];
    // arr[left] = temp;

    // }
    // left++;
    // right--;
    // }
    // for(int i=0;i<arr.length;i++){
    // System.out.print(arr[i]+" ");
    // }
    // }

    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter the size : ");
    // int size = sc.nextInt();

    // int[] arr = new int[size];

    // for(int i=0;i<size;i++){
    // arr[i] = sc.nextInt();
    // }

    // reverse(arr);
    // }

    // IS GIVEN ARRAY PALINDROME
    // static void isPalindrome(int[] arr){
    // int left=0;
    // int right = arr.length-1;

    // boolean notPal = false;

    // while(left<right){
    // if(arr[left] != arr[right]){
    // notPal = true;
    // break;
    // }
    // left++;
    // right--;
    // }
    // if(notPal){
    // System.out.println("Not Palindrome");
    // }
    // else{
    // System.out.println("Palindrome");
    // }
    // }

    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter the size : ");
    // int size = sc.nextInt();

    // int[] arr = new int[size];

    // System.out.println("Enter the Array : ");
    // for(int i=0;i<size;i++){
    // arr[i] = sc.nextInt();
    // }
    // isPalindrome(arr);
    // }

    // FIND PAIR DIFFERENCE
    // static void findpairDiff(int[] arr, int target){
    // int left = 0;
    // int right = arr.length-1;

    // boolean found = false;
    // while(left<right){
    // int diff = arr[left] - arr[right];

    // if(diff==target){
    // found = true;
    // break;
    // }
    // else if(diff<target){
    // left++;
    // }else{
    // right--;
    // }
    // }
    // if(found){
    // System.out.println("Pair found !");
    // }else{
    // System.out.println("No Pair found ");
    // }
    // }
    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter the size : ");
    // int size = sc.nextInt();

    // int[] arr = new int[size];

    // System.out.println("Enter the Array : ");

    // for(int i=0;i<size;i++){
    // arr[i] = sc.nextInt();
    // }

    // System.out.println("Enter the required difference : ");
    // int target = sc.nextInt();

    // findpairDiff(arr, target);

    // }

    // Remove duplicate elements (most important)
    // static void removeDuplicates(int[] arr) {

    // int slow = 0;
    // int fast = 1;

    // while (fast < arr.length) {

    // if (arr[slow] != arr[fast]) {
    // slow++;
    // arr[slow] = arr[fast];
    // }

    // fast++;
    // }

    // // Print unique elements
    // for (int i = 0; i <= slow; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // }

    // public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter the size:");
    // int size = sc.nextInt();

    // int[] arr = new int[size];

    // System.out.println("Enter the Array:");
    // for (int i = 0; i < size; i++) {
    // arr[i] = sc.nextInt();
    // }

    // removeDuplicates(arr);

    // }

    // Move Zeroes to the end of an array
    // static void moveZeroes(int[] arr) {

    // int slow = 0;

    // for(int fast = 0; fast < arr.length; fast++) {

    // if(arr[fast] != 0) {

    // int temp = arr[slow];
    // arr[slow] = arr[fast];
    // arr[fast] = temp;

    // slow++;
    // }
    // }

    // for(int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // }
    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter the size : ");
    // int size = sc.nextInt();

    // int[] arr = new int[size];

    // for(int i=0;i<arr.length;i++){
    // arr[i] = sc.nextInt();
    // }
    // moveZeroes(arr);
    // }

    // REMOVE A PARTICULAR ELEMENT IN PLACE

    // static void removeElem(int[] arr, int x){

    // int start = 0;
    // for(int f=0;f<arr.length;f++){
    // if(arr[f]!=x){

    // int temp = arr[f];
    // arr[f] = arr[start];
    // arr[start] = temp;

    // start++;

    // }
    // }

    // int ct = 0;

    // for(int i=0;i<arr.length;i++){
    // if(arr[i]==x){
    // ct++;
    // }
    // }

    // for(int i=0;i<arr.length-ct;i++){
    // System.out.print(arr[i]+" ");
    // }
    // }
    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter the size :");
    // int size = sc.nextInt();

    // int[] arr = new int[size];

    // System.out.println("Enter the elem : ");
    // int x = sc.nextInt();

    // System.out.println("Enter the Array :");
    // for(int i=0;i<arr.length;i++){
    // arr[i] = sc.nextInt();
    // }
    // removeElem(arr, x);
    // }

    // MERGE TWO SORTED ARRAYS

    // static void mergeArrays(int[] arr1, int[] arr2){

    // int i = 0;
    // int j = 0;
    // int k = 0;

    // int[] result = new int[arr1.length + arr2.length];

    // while(i < arr1.length && j < arr2.length){

    // if(arr1[i] < arr2[j]){
    // result[k] = arr1[i];
    // i++;
    // }
    // else{
    // result[k] = arr2[j];
    // j++;
    // }

    // k++;
    // }

    // while(i < arr1.length){
    // result[k] = arr1[i];
    // i++;
    // k++;
    // }

    // while(j < arr2.length){
    // result[k] = arr2[j];
    // j++;
    // k++;
    // }

    // for(int x : result){
    // System.out.print(x + " ");
    // }
    // }

    // FIND INTERSECTION OF TWO ARRAYS

    // static void findCommon(int[] arr1, int[] arr2){

    // int i=0;
    // int j=0;

    // boolean found = false;

    // while(i<arr1.length && j<arr2.length){

    // if(arr1[i]<arr2[j]){
    // i++;
    // }else if(arr1[i]>arr2[j]){
    // j++;
    // }else{
    // System.out.print(arr1[i]+" ");
    // found = true;
    // i++;
    // j++;
    // }
    // }
    // if(!found){
    // System.out.println("No common elements found ");
    // }
    // }

    // public static void main(String[] args){

    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter the Size of 1st Array : ");
    // int size_1 = sc.nextInt();

    // System.out.println("Enter the Size of 2nd Array : ");
    // int size_2 = sc.nextInt();

    // int[] arr_1 = new int[size_1];
    // int[] arr_2 = new int[size_2];

    // System.out.println("Enter 1st Array : ");
    // for(int i=0;i<size_1;i++){
    // arr_1[i] = sc.nextInt();
    // }

    // System.out.println("Enter 2nd Array : ");
    // for(int j=0;j<arr_2.length;j++){
    // arr_2[j] = sc.nextInt();
    // }

    // findCommon(arr_1,arr_2);
    // }

    // FIND UNION OF TWO ARRAYS

    static void findUnion(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[j] + " ");
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
            // Remaining arr1
            while (i < arr1.length) {
                System.out.print(arr1[i] + " ");
                i++;
            }

            // Remaining arr2
            while (j < arr2.length) {
                System.out.print(arr2[j] + " ");
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

    }

}