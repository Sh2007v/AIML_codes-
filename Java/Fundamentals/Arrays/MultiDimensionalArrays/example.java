package Java.Fundamentals.Arrays.MultiDimensionalArrays;



// // INPUT A MATRIX AND PRINT IT
// import java.util.Scanner;
// public class example {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter row num :");
//         int r = sc.nextInt();

//         System.out.println("Enter col num :");
//         int c = sc.nextInt();

//         int[][] arr = new int[r][c];

//         System.out.println("Enter the matrix :");

//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Entered Matrix :");
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 System.out.print(arr[i][j]+" ");
//             }System.out.println();
//         }
//     }
// }


//COLWISE SUM

// import java.util.Scanner;

// public class example{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter row num :");
//         int r = sc.nextInt();

//         System.out.println("Enter col sum :");
//         int c = sc.nextInt();

//         int[][] arr = new int[r][c];

//         System.out.println("Enter the matrix :");
//             for(int i=0;i<r;i++){
//                 for(int j=0;j<c;j++){
//                     arr[i][j] = sc.nextInt();
//                 }
//             }
//         for(int j=0;j<c;j++){
//             int col_sum = 0;
//             for(int i=0;i<r;i++){
//                 col_sum+=arr[j][i];
//             }
//             System.out.print(col_sum+" ");
//             System.out.println();
//         }
//     }
// }



//ADDITION OF MATRIX
// import java.util.Scanner;
// public class example{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter row num :");
//         int r = sc.nextInt();

//         System.out.println("Enter col num :");
//         int c = sc.nextInt();

//         int[][] arrA = new int[r][c];
//         int[][] arrB = new int[r][c];

//         System.out.println("Enter the matrix A : ");
//             for(int i=0;i<r;i++){
//                 for(int j=0;j<c;j++){
//                     arrA[i][j] = sc.nextInt();
//                 }
//             }
//         System.out.println("Enter the matrix B : ");
//             for(int i=0;i<r;i++){
//                 for(int j=0;j<c;j++){
//                     arrB[i][j] = sc.nextInt();
//                 }
//             }
//         int[][] res_matrix = new int[r][c];

//         System.out.println("Resultant Matrix : ");
//             for(int i=0;i<r;i++){
//                 for(int j=0;j<c;j++){
//                     res_matrix[i][j] += arrA[i][j]+arrB[i][j];
//                     System.out.print(res_matrix[i][j]+" ");
//                 }
//                 System.out.println();
//             }
//     }
// }



