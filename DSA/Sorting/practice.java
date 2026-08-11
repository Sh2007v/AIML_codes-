package DSA.Sorting;

import java.util.Scanner;
// 1 . BUBBLE SORT IN ASCENDING ORDER

public class practice {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size : ");
//         int size = sc.nextInt();

//         int[] arr = new int[size];

//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i=0;i<size;i++){
//             for(int j=0;j<size-i-1;j++){
//                 if(arr[j]>arr[j+1]){
                    
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
                
//                 }
//             }
//         }

//         for(int i=0;i<size;i++){
//             System.out.println(arr[i]+" ");
//         }


//     }   

// BUBBLE SORT IN DESCENDING ORDER

// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size: ");
//     int size = sc.nextInt();

//     int[] arr = new int[size];

//     for(int i=0;i<size;i++){
//         arr[i] = sc.nextInt();
//     }

//     for(int i=0;i<size;i++){
//         for(int j=0;j<size-i-1;j++){
//             if(arr[j]<arr[j+1]){
                
//                 int temp = arr[j+1];
//                 arr[j+1] = arr[j];
//                 arr[j] = temp;

//             }
//         }
//     }

//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//     }
// }
// }

//OPTIMIZED BUBBLE SORT
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size: ");
//     int size = sc.nextInt();

//     int[] arr = new int[size];

//     for(int i=0;i<size;i++){
//         arr[i] = sc.nextInt();
//     }

    
//     for(int i=0;i<size;i++){
//         boolean swapped = false;
//         for(int j=0;j<size-i-1;j++){
//             if(arr[j]>arr[j+1]){
//                 int temp = arr[j+1];
//                 arr[j+1] = arr[j];
//                 arr[j] = temp;

//                 swapped = true;
//             }
//         }
//         if(!swapped){
//             break;
//         }
//     }

//     for(int i=0;i<size;i++){
//         System.out.print(arr[i]+" ");
//     }
// }
// }

//TOTAL NUMBER OF SWAPS
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size : ");
//     int n = sc.nextInt();

//     int[] arr = new int[n];

//     for(int i=0;i<n;i++){
//         arr[i] = sc.nextInt();
//     }

//     int ct = 0;

//     for(int i=0;i<n;i++){
//         for(int j=0;j<n-i-1;j++){
//             if(arr[j]>arr[j+1]){
//                 int temp = arr[j+1];
//                 arr[j+1] = arr[j];
//                 arr[j] = temp;

//                 ct++;
//             }
//         }
//     }

//     System.out.println("Total Number of Swaps : "+ct);

//     System.out.println("Sorted Array : ");

//     for(int i=0;i<n;i++){
//         System.out.print(arr[i]+" ");
//     }

//     }
// }

// ALREADY SORTED OR NOT
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size of the array:");
//     int size = sc.nextInt();

//     int[] arr = new int[size];

//     System.out.println("Enter the array : ");
    
//     for(int i=0;i<size;i++){
//         arr[i] = sc.nextInt();
//     }

//     int f=0;

//     for(int i=0;i<size;i++){                                            
//         for(int j=0;j<size-i-1;j++){
//             if(arr[j]>arr[j+1]){
//                 f=1;
//                 break;
//             }
//         }
//     }

//     if(f==0){
//         System.out.println("Array Sorted");
//     }
//     else{
//         System.out.println("Not Sorted");
//     }

// }
// }

//Better approach: Stop the outer loop and inner loop when there is any swap detected.

// boolean swapped = false;

// for(int i = 0; i < size - 1; i++){
//     swapped = false;

//     for(int j = 0; j < size - i - 1; j++){
//         if(arr[j] > arr[j + 1]){
//             swapped = true;
//             break;
//         }
//     }

//     if(swapped){
//         break;
//     }

//Sort only even numbers in the given array

// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size of array: ");
//     int size = sc.nextInt();

//     int[] arr = new int[size];

//     System.out.println("Enter the array: ");

//     for(int i=0;i<size;i++){
//         arr[i] = sc.nextInt();
//     }

//     int even_ct = 0;
    
//     for(int i=0;i<size;i++){
//         if(arr[i]%2==0){
//             even_ct++;
//         }
//     }

//     int[] even_arr = new int[even_ct];
//     int index = 0;

//     for(int i=0;i<size;i++){
//         if(arr[i]%2==0){
//             even_arr[index] += arr[i]; 
//         }
//     }

//     for(int i=0;i<even_ct-1;i++){
//         for(int j=0;j<even_ct-i-1;j++){
//             if(even_arr[j]>even_arr[j+1]){
//                 int temp = even_arr[j+1];
//                 even_arr[j+1] = even_arr[j];
//                 even_arr[j] = temp; 
//             }
//         }
//     }
//     index=0;
//     for(int i=0;i<size;i++){
//         if(arr[i]%2==0){
//             arr[i] = even_arr[index++];
//         }
//     }

//     for(int i=0;i<size;i++){
//         System.out.print(arr[i]+" ");
//     }
// }


//SORT ONLY ODD NUMBERS

// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size: ");
//     int size = sc.nextInt();

//     int[] arr = new int[size];

//     for(int i=0;i<size;i++){
//         arr[i] = sc.nextInt();
//     }

//     int ct_odd = 0;
    
//     for(int i=0;i<size;i++){
//         if(arr[i]%2!=0){
//             ct_odd++;
//         }
//     }

//     int[] odd_arr = new int[ct_odd];
    
//     int index = 0;
//     for(int i=0;i<size;i++){
//         if(arr[i]%2!=0){
//             odd_arr[index++] = arr[i];
//         }
//     }

//     for(int i=0;i<ct_odd;i++){
//         for(int j=0;j<ct_odd-i-1;j++){
//             if(odd_arr[j]>odd_arr[j+1]){
//                 int temp = odd_arr[j+1];
//                 odd_arr[j+1] = odd_arr[j];
//                 odd_arr[j] = temp;
//             }
//         }
//     }
//     index=0;
//     for(int i=0;i<size;i++){
//         if(arr[i]%2!=0){
//             arr[i] = odd_arr[index++];
//         }
//     }

//     for(int i=0;i<size;i++){
//         System.out.print(arr[i]+" ");
//     }
// }

//Find the median in a sorted array
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size of array : ");
//     int size = sc.nextInt();

//     System.out.println("Enter the array : ");
//     int[] arr = new int[size];

//     for(int i=0;i<size;i++){
//         arr[i] = sc.nextInt();
//     }

//     for(int i=0;i<size;i++){
//         for(int j=0;j<size-i-1;j++){
//             if(arr[j]>arr[j+1]){
//                 int temp = arr[j+1];
//                 arr[j+1] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//     }

//     if(size%2!=0){
//         System.out.println(arr[((size)/2)]);
//     }
//     else{
//       //  System.out.println(arr[((size/2)-1)]+arr[((size)/2)]/2);
//         System.out.println((arr[size/2 - 1] + arr[size/2]) / 2); //rounded-down
//         System.out.println((arr[size/2 - 1] + arr[size/2]) / 2.0);//exact median value
//     }
// }
// }

// // FIND SECOND LARGEST ELEMENT AFTER BUBBLE SORT
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size of array : ");
//     int size = sc.nextInt();

//     System.out.println("Enter the array : ");
//     int[] arr = new int[size];

//     for(int i=0;i<size;i++){
//         arr[i] = sc.nextInt();
//     }

//     for(int i=0;i<size;i++){
//         for(int j=0;j<size-i-1;j++){
//             if(arr[j]>arr[j+1]){
//                 int temp = arr[j+1];
//                 arr[j+1] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//     }

//     // HINT : After sorting, search backwards till the element does not change...
//     int max = arr[size-1];
//     int pos = -1;

//     for(int i=size-2;i>=0;i--){
//         if(arr[i]!=max){
//             pos = i;
//             break;
//         }
//     }
// if(pos==-1){
//     System.out.println("No second largest element");
// }
// else{
//     System.out.println("Second largest Element : "+arr[pos]);
// }
// }
// }

//REMOVE DUPLICATES FROM THE ARRAY OR PRINT UNIQUE ELEMENTS

// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter array size : ");
//     int size = sc.nextInt();

//     int[] arr = new int[size];
    
//     System.out.println("Enter the array : ");

//     for(int i=0;i<size;i++){
//         arr[i] = sc.nextInt();
//     }

//use bubble sort

    
//    for(int i=0;i<size-1;i++){
//     if(arr[i]!=arr[i+1]){
//         System.out.print(arr[i]+" ");
//     }
//    }
//   }

//COUNT DUPLICATE ELEMENTS NUMBER IN AN ARRAY

// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size : ");
//     int size = sc.nextInt();

//     int[] arr = new int[size];
//     for(int i=0;i<size;i++){
//         {
//             arr[i] = sc.nextInt();
//         }
//     }

//     for(int i=0;i<size;i++){
//         for(int j=i;j<size-i-1;j++){
//             if(arr[j]>arr[j+1]){
//                 int temp = arr[j+1];
//                 arr[j+1] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//     }

//     int ct=0;

//     int flag = 0;
//     for(int i=0;i<size;i++){
//         for(int j=i+1;j<size;j++){
//             if(arr[i]==arr[j]){
//                 flag = 1;
//             }
//         }
//         if(flag==1){
//             ct++; //to return the count of repeating elements
//             System.out.print(arr[i]+" ");//to return the repeating elements
//             break;
//         }
//     }
//         System.out.println(ct);
//     }


//Selection Sort

//1 : SORT IN ASCENDING ORDER
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size of Array : ");
//     int size = sc.nextInt();

//     int[] arr = new int[size];

//     System.out.println("Enter the Array : ");

//     for(int i=0;i<size;i++){
//         arr[i] = sc.nextInt();
//     }

//     for(int i=0;i<size-1;i++){
//         int minIndex = i;
//         for(int j=i+1;j<size;j++){
//             if(arr[minIndex]>arr[j]){
//                 minIndex = j;
//             }
//         }
//         int temp = arr[minIndex];
//         arr[minIndex] = arr[i];
//         arr[i] = temp;

//     }

//     for(int i=0;i<size;i++){
//         System.out.println(arr[i]+" ");
//     }
// }


//2. SORT AN ARRAY IN DESCENDING ORDER
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter array size : ");
//     int size = sc.nextInt();

//     int[] arr = new int[size];
//     for(int i=0;i<size;i++){
//         arr[i] = sc.nextInt();
//     }

//     System.out.println("Enter array : ");

//     for(int i=0;i<size-1;i++){
//         int maxIndex = i;
//         for(int j=i+1;j<size;j++){
//             if(arr[j]>arr[maxIndex]){
//                 maxIndex = j;
//             }
//         }

//         int temp = arr[maxIndex];
//         arr[maxIndex] = arr[i];
//         arr[i] = temp;
//     }

//     for(int i=0;i<size;i++){
//         System.out.println(arr[i]+" ");
//     }
// }

//SORT AN ARRAY AND COUNT THE NUMBER OF SWAPS USING SELECTION SORT
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size of array : ");
//     int size = sc.nextInt();

//     int[] arr = new int[size];

//     System.out.println("Enter the array : ");

//     for(int i=0;i<size;i++){
//         arr[i] = sc.nextInt();
//     }

//     //sort
//     int ct_swap=0;
    
//     for(int i=0;i<size-1;i++){
//         int minIndex = i;
//         for(int j=i+1;j<size;j++){
//             if(arr[minIndex]>arr[j]){
//                 minIndex = j;
//             }
//         }
//         //swap
//         if(minIndex!=i){
//         int temp = arr[minIndex];
//         arr[minIndex] = arr[i];
//         arr[i] = temp;
//         ct_swap++;
//         }
//     }
    
// }

//FIND THE MINIMUM ELEMENT SELECTED IN EVERY PASS
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size of Array : ");
//     int size = sc.nextInt();

//     int[] arr = new int[size];
    
//     System.out.println("Enter the Array : ");
        
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }

//         //sort it
//         for(int i=0;i<size-1;i++){
//             int minIndex = i;
//             for(int j=i+1;j<size;j++){
//                 if(arr[minIndex] > arr[j]){
//                     minIndex = j;
//                     System.out.print(arr[minIndex]+" ");
//                 }
//             }
//         //swap
//             int temp = arr[minIndex];
//             arr[minIndex] = arr[i];
//             arr[i] = temp;

//         }

//     }


// PRINT EVERY MINIMUM ELEMENT SELECTED IN EACH SORTING 

// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size : ");
//     int size = sc.nextInt();

//     int[] arr = new int[size];

//     System.out.println("Enter the Array : ");

//     for(int i=0;i<size;i++){
//         arr[i] = sc.nextInt();
//     }

//     // sort

//     int ct_comp = 0;
//     int ct_swap = 0;

//     for(int i=0;i<size-1;i++){
//         int minIndex = i;
//         for(int j=i+1;j<size;j++){
//             if(arr[minIndex]>arr[j]){
//                minIndex =j;
//                ct_comp ++;
//             }
//         }
//      int temp = arr[minIndex];
//      arr[minIndex] = arr[i];
//      arr[i] = temp;
     
//      ct_swap++;
//     }

//     System.out.println("Swaps: "+ct_swap);
//     System.out.println("Comparsions : "+ct_comp);
// }

// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the Size : ");
//     int size = sc.nextInt();

//     int[] arr = new int[size];

//     System.out.println("Enter the array : ");
//     for(int i=0;i<size;i++){
//         arr[i] = sc.nextInt();
//     }

//     //sort
//     for(int i=0;i<size-1;i++){
//         int minIndex = i;
//         for(int j=i+1;j<size;j++){
//             if(arr[minIndex]>arr[j]){
//                 minIndex = j;
//             }
//         }
        
//         //swap
//         int temp = arr[minIndex];
//         arr[minIndex] = arr[i];
//         arr[i] = temp;

//         System.out.print(arr[i]+" ");
        
//     }
//     }       

// SECOND SMALLEST DISTINCT ELEMENT AFTER SELECTION SORT
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the Size : ");
//     int size = sc.nextInt();

//     int[] arr = new int[size];

//     System.out.println("Enter the Array : ");
//     for(int i=0;i<size;i++){
//         arr[i] = sc.nextInt();
//     }

//     //sort
//     for(int i=0;i<size-1;i++){
//         int minIndex = i;
//         for(int j=i+1;j<size;j++){
//             if(arr[minIndex]>arr[j]){
//                 minIndex = j;
//             }
//         }
//         int temp = arr[minIndex];
//         arr[minIndex] = arr[i];
//         arr[i] = temp;

//     }
//    int sec_min = -1;

//     for(int i = 1; i < size; i++){
//         if(arr[i] != arr[0]){
//             sec_min = i;
//             break;
//         }
//     }
//     if(sec_min == -1){
//         System.out.println("No second smallest");
//     }
//     else{
//         System.out.println(arr[sec_min]);
//     }
    
//     }

//SORT ONLY THE FIRST K ELEMENTS

// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the Size : ");
//     int size = sc.nextInt();

//     int[] arr = new int[size];
//     System.out.println("Enter the Array : ");

//     for(int i=0;i<size;i++){
//         arr[i] = sc.nextInt();
//     }

//     System.out.println("Enter the limit K :");
//     int K = sc.nextInt();

//     for(int i=0;i<K-1;i++){
//         int minIndex = i;
//         for(int j=i+1;j<K;j++){
//             if(arr[minIndex]>arr[j]){
//                 minIndex = j;
//             }
//         }
//         int temp = arr[minIndex];
//         arr[minIndex] = arr[i];
//         arr[i] = temp;
//     }

//     for(int i=0;i<size;i++){
//         System.out.print(arr[i]+" ");
//     }

// }

//CHECK WHETHER SELECTION SORT MAKES ANY SWAP (IS THERE ANY SWAP)
// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the Size : ");
//     int size = sc.nextInt();

//     int[] arr = new int[size];

//     System.out.println("Enter the Array : ");
//     for(int i=0;i<size;i++){
//         arr[i] = sc.nextInt();
//     }

//     boolean notSorted = false;

//     for(int i=0;i<size-1;i++){
//         int minIndex = i;
//         for(int j=i+1;j<size;j++){
//             if(arr[minIndex]>arr[j]){
//                 notSorted = true;
//                 break;
//             }
//         }
//     }
//     if(notSorted){
//         System.out.println("Not Sorted");
//     }
//     else{
//         System.out.println("Sorted");
//     }
// }

// Find the Number of Passes Required to Place a Given Element
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter the Size : ");
    //     int size = sc.nextInt();

    //     int[] arr = new int[size];

    //     System.out.println("Enter the Array : ");
    //     for (int i = 0; i < size; i++) {
    //         arr[i] = sc.nextInt();
    //     }

    //     System.out.println("Enter the Element : ");
    //     int elem = sc.nextInt();

    //     int pass = -1;

    //     // Selection Sort
    //     for (int i = 0; i < size - 1; i++) {

    //         int minIndex = i;

    //         // Find minimum
    //         for (int j = i + 1; j < size; j++) {
    //             if (arr[j] < arr[minIndex]) {
    //                 minIndex = j;
    //             }
    //         }

    //         // Swap
    //         int temp = arr[i];
    //         arr[i] = arr[minIndex];
    //         arr[minIndex] = temp;

    //         // Check after completing the pass
    //         if (arr[i] == elem) {
    //             pass = i + 1;
    //             break;
    //         }
    //     }

    //     if (pass != -1) {
    //         System.out.println("Pass : " + pass);
    //     } else {
    //         System.out.println("Element not found in required pass");
    //     }
    // }

    
}


