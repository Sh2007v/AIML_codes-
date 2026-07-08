// import java.util.Scanner;
// public class arrays_rev {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

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


