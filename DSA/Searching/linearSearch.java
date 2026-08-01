import java.util.Scanner;

public class linearSearch {

    //PRINT ALTERNATE ELEMENTS
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);

    //     int size = sc.nextInt();

    //     int[] arr = new int[size];

    //     for(int i=0;i<size;i++){
    //         arr[i] = sc.nextInt();
    //     }

    //     for(int i=0;i<size;i+=2){
    //         System.out.print(arr[i]+" ");
    //     }
    // }

    //PRINT LEADERS OF ARRAY
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);

    //     int size = sc.nextInt();

    //     int[] arr = new int[size];

    //     for(int i=0;i<size;i++){
    //         arr[i] = sc.nextInt();
    //     }

        
    //     for(int i=0;i<size;i++){
    //         boolean isLeader = true;
    //         for(int j=i+1;j<size;j++){
    //             if(arr[i]<arr[j]){
    //                 isLeader = false;
    //                 break;
    //             }
    //         }       
    //         if(isLeader){
    //             System.out.print(arr[i]+" ");
    //         }     
    //     }
    // }

    //PRINT DUPLICATE ELEMENTS
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        for (int i = 0; i < size; i++) {

            // Check if arr[i] has already appeared before
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            // Count occurrences
            int count = 1;

            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Duplicates");
        }

        //sc.close();
    }
}
