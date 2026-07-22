package Java.Fundamentals.Arrays.MultiDimensionalArrays;

// public class practice  {
    // ROW SUM
// import java.util.Scanner;
// public class arrays_rev{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Size of Array :");
//         int size = sc.nextInt();

//         int[][] arr = new int[size][size];

//         System.out.println("Enter the Array :");
        
//         for(int i=0;i<size;i++){
//             for(int j=0;j<size;j++){
//                 arr[i][j] = sc.nextInt();
//         }
//     }
//         for(int i=0;i<size;i++){
//             int row_sum = 0;
//             for(int j =0;j<size;j++){
//                 row_sum+=arr[i][j];
//             }
//             System.out.print(row_sum+" ");
//             System.out.println();
//         }
//     }
// }

//COLUMN SUM
// import java.util.Scanner;
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the rows num :");
//         int row = sc.nextInt();

//         System.out.println("Enter the cols num :");
//         int cols = sc.nextInt();

//         int[][] arr = new int[row][cols];

//         for(int i=0;i<row;i++){
//             for(int j =0;j<cols;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//     }
// }

//
    
// }

// ==========================================================
// 1. MATRIX ADDITION
// ==========================================================

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter Columns: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        System.out.println("Enter First Matrix:");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter Second Matrix:");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                b[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }

        System.out.println("Result:");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
*/


// ==========================================================
// 2. MATRIX SUBTRACTION
// ==========================================================

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int rows=sc.nextInt();

        System.out.print("Enter Columns: ");
        int cols=sc.nextInt();

        int[][] a=new int[rows][cols];
        int[][] b=new int[rows][cols];
        int[][] sub=new int[rows][cols];

        System.out.println("Enter First Matrix:");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter Second Matrix:");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                b[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sub[i][j]=a[i][j]-b[i][j];
            }
        }

        System.out.println("Result:");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(sub[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
*/


// ==========================================================
// 3. MATRIX MULTIPLICATION
// ==========================================================

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int rows=sc.nextInt();

        System.out.print("Enter Columns: ");
        int cols=sc.nextInt();

        int[][] a=new int[rows][cols];
        int[][] b=new int[rows][cols];
        int[][] result=new int[rows][cols];

        System.out.println("Enter First Matrix:");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter Second Matrix:");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                b[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){

            for(int j=0;j<cols;j++){

                result[i][j]=0;

                for(int k=0;k<cols;k++){
                    result[i][j]+=a[i][k]*b[k][j];
                }

            }

        }

        System.out.println("Result:");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
*/


// ==========================================================
// 4. TRANSPOSE OF MATRIX
// ==========================================================

/*
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int rows=sc.nextInt();

        System.out.print("Enter Columns: ");
        int cols=sc.nextInt();

        int[][] matrix=new int[rows][cols];

        System.out.println("Enter Elements:");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Transpose:");

        for(int i=0;i<cols;i++){

            for(int j=0;j<rows;j++){

                System.out.print(matrix[j][i]+" ");

            }

            System.out.println();

        }

        sc.close();
    }
}
*/


// ==========================================================
// 5. SUM OF EACH ROW
// ==========================================================

/*
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int rows=sc.nextInt();

        System.out.print("Enter Columns: ");
        int cols=sc.nextInt();

        int[][] matrix=new int[rows][cols];

        System.out.println("Enter Elements:");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Sum of Each Row:");

        for(int i=0;i<rows;i++){

            int sum=0;

            for(int j=0;j<cols;j++){
                sum+=matrix[i][j];
            }

            System.out.println("Row "+(i+1)+" Sum = "+sum);

        }

        sc.close();
    }
}
*/

//PART 2

// ==========================================================
// 6. SUM OF EACH COLUMN
// ==========================================================

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter Columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter Elements:");

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of Each Column:");

        for(int j = 0; j < cols; j++){

            int sum = 0;

            for(int i = 0; i < rows; i++){
                sum += matrix[i][j];
            }

            System.out.println("Column " + (j + 1) + " Sum = " + sum);

        }

        sc.close();
    }
}
*/


// ==========================================================
// 7. LARGEST ELEMENT IN MATRIX
// ==========================================================

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter Columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter Elements:");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        int largest = matrix[0][0];

        for(int i=0;i<rows;i++){

            for(int j=0;j<cols;j++){

                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }

            }

        }

        System.out.println("Largest Element = " + largest);

        sc.close();
    }
}
*/


// ==========================================================
// 8. SMALLEST ELEMENT IN MATRIX
// ==========================================================

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter Columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter Elements:");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        int smallest = matrix[0][0];

        for(int i=0;i<rows;i++){

            for(int j=0;j<cols;j++){

                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }

            }

        }

        System.out.println("Smallest Element = " + smallest);

        sc.close();
    }
}
*/


// ==========================================================
// 9. PRIMARY & SECONDARY DIAGONAL
// ==========================================================

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Square Matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter Elements:");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Primary Diagonal:");

        for(int i=0;i<n;i++){
            System.out.print(matrix[i][i]+" ");
        }

        System.out.println();

        System.out.println("Secondary Diagonal:");

        for(int i=0;i<n;i++){
            System.out.print(matrix[i][n-1-i]+" ");
        }

        sc.close();
    }
}
*/


// ==========================================================
// 10. CHECK SYMMETRIC MATRIX
// ==========================================================

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Square Matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter Elements:");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        boolean symmetric = true;

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){

                if(matrix[i][j] != matrix[j][i]){
                    symmetric = false;
                    break;
                }

            }

            if(!symmetric){
                break;
            }

        }

        if(symmetric){
            System.out.println("Matrix is Symmetric");
        }
        else{
            System.out.println("Matrix is Not Symmetric");
        }

        sc.close();
    }
}
*/


