package DSA.Sorting;

import java.util.Scanner;
// 1 . BUBBLE SORT IN ASCENDING ORDER

public class bubbleSortpractice {

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

}