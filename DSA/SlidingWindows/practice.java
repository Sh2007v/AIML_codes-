import java.util.Scanner;

public class practice{

//1 Maximum sum of a sub-array with k length

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size of Array :");
//         int size = sc.nextInt();

//         int[] arr = new int[size];
        
//         System.out.println("Enter the Array :");

//         for(int i=0;i<arr.length;i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter the size of sub-array Index : ");
//         int k = sc.nextInt();

//         int maxSum = 0;
//         int WindowSum = 0;
        
//         for(int i=0;i<k;i++){
//             WindowSum += arr[i];
//         }

//         maxSum = WindowSum;

//         for(int i=k;i<arr.length;i++){
//             WindowSum += arr[i];
//             WindowSum -= arr[i-k];
            
//             maxSum = Math.max(WindowSum,maxSum);
//         }

//         System.out.println(maxSum);
//     }


//2
// public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size of array:");
//         int size = sc.nextInt();

//         int[] arr = new int[size];

//         System.out.println("Enter the array:");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter the size K:");
//         int k = sc.nextInt();

//         double[] arr_avg = new double[size - k + 1];

//         int windowSum = 0;

//         // Calculate the first window
//         for (int i = 0; i < k; i++) {
//             windowSum += arr[i];
//         }

//         arr_avg[0] = windowSum / (double) k;

//         // Slide the window
//         for (int i = k; i < arr.length; i++) {

//             windowSum += arr[i];
//             windowSum -= arr[i - k];

//             arr_avg[i - k + 1] = windowSum / (double) k;
//         }

//         // Display averages
//         System.out.println("Averages of all sub-arrays:");

//         for (int i = 0; i < arr_avg.length; i++) {
//             System.out.printf("%.2f ", arr_avg[i]);
//         }

//         sc.close();
//     }


//3. Min Sum Subarray of size k

// public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size of array:");
//         int size = sc.nextInt();

//         int[] arr = new int[size];

//         System.out.println("Enter the array:");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter the size K:");
//         int k = sc.nextInt();

//         int minSum = 0;
//         int windowSum = 0;

//         for(int i=0;i<k;i++){
//             windowSum +=arr[i];

//         }
//         minSum = windowSum;

//         for(int i=k;i<arr.length;i++){
        
//             windowSum+=arr[i];
//             windowSum-=arr[i-k];
//             minSum = (Math.min(windowSum,minSum));
            
//         }
//         System.out.print(minSum);
       


//     }


//4 Count even numbers in a window(MOST IMPORTANT)

// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size : ");
//     int size = sc.nextInt();

//     int[] arr = new int[size];

//     for(int i=0;i<size;i++){
//         arr[i] = sc.nextInt();
//     }

//     System.out.println("Enter the window size : ");
//     int k = sc.nextInt();
    
//     int ct_even = 0;

// for(int i = 0; i < k; i++){
//     if(arr[i] % 2 == 0){
//         ct_even++;
//     }
// }

// int[] arr_even = new int[size-k+1];

// arr_even[0] = ct_even;

// for(int i = k; i < size; i++){

//     // Remove outgoing element
//     if(arr[i-k] % 2 == 0){
//         ct_even--;
//     }

//     // Add incoming element
//     if(arr[i] % 2 == 0){
//         ct_even++;
//     }

//     arr_even[i-k+1] = ct_even;
//     }

// for(int i = 0; i < arr_even.length; i++){
//     System.out.print(arr_even[i] + " ");
//     }
    
// }

//5. Count odd elements in a given array (MOST IMPORTANT)
// public static void main(String[] args){

//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the size : ");

//     int size = sc.nextInt();

//     int[] arr = new int[size];

//     for(int i = 0; i < size; i++){
//         arr[i] = sc.nextInt();
//     }

//     System.out.println("Enter the window size : ");

//     int k = sc.nextInt();

//     int ct_odd = 0;

//     int[] arr_odd = new int[size-k+1];

//     // First window
//     for(int i = 0; i < k; i++){

//         if(arr[i] % 2 != 0){
//             ct_odd++;
//         }
//     }

//     arr_odd[0] = ct_odd;

//     // Sliding window
//     for(int i = k; i < arr.length; i++){

//         // Remove outgoing element
//         if(arr[i-k] % 2 != 0){
//             ct_odd--;
//         }

//         // Add incoming element
//         if(arr[i] % 2 != 0){
//             ct_odd++;
//         }

//         arr_odd[i-k+1] = ct_odd;
//     }

//     // Print result
//     for(int i = 0; i < arr_odd.length; i++){
//         System.out.print(arr_odd[i] + " ");
//     }
// }


}