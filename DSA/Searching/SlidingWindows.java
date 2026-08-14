// import java.util.Scanner;

// public class SlidingWindows{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();

//         int[] arr = new int[size];

        
//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }

//         int max = 0;

//         for(int i=0;i<=size-3;i++){
//             int sum = 0;
//             for(int j=i;j<i+3;j++){
                
//             sum += arr[j] ;
            
//         }
//         if(sum>max){
//             max = sum;
//         }
//         }
//         System.out.println(max);
//     }
// }