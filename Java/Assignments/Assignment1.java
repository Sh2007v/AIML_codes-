package Java.Assignments;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //hardcode values : row : 3; col : 5;

        int rows = 3;
        int cols = 5;
        //int[][] arr = new int[rows][cols];

        // System.out.println("Enter the array : ");
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        int[][] arr = {
                {0, 1, 1, 1, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 0, 1, 1}
        };
        System.out.println("Enter the columns num : ");
        int col = sc.nextInt();

        int max_sum = 0;
        int sum = 0;

        for(int i=0;i<rows;i++){
            if(arr[i][col]==0){
                max_sum = sum;
                break;
            }
            else{
                sum+=arr[i][col];
            }
        }
        System.out.println("Max Sum : "+max_sum);
    }
}
