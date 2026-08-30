import java.util.Scanner;
import java.util.HashSet;


//Print unique elements
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();

//         int[] arr = new int[size];

//         for(int i=0;i<size;i++){
//             arr[i] = sc.nextInt();
//         }

//         HashSet<Integer> numbers = new HashSet<>();

//         for(int j=0;j<size;j++){
//             numbers.add(arr[j]);
//         }

//         // for(int i=0;i<numbers.size();i++){
//         //     System.out.print(numbers.get(i)+" ");            //HashSet does not have get() as it is unordered.
//         // }
        
//         for(int val : numbers){
//             System.out.print(val+" ");
//         }
//     }
// }


// Check wether an element exists or not
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int size = sc.nextInt();
//         HashSet<Integer> numbers = new HashSet<>();

//         for(int i=0;i<size;i++){
//             numbers.add(sc.nextInt());
//         }

//         int elem = sc.nextInt();

//         if(numbers.contains(elem)){
//             System.out.println("Found");
//         }else{
//             System.out.println("Not Found");
//         }
//     }
// }

// Count number of uniue elements
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         HashSet<Integer> num = new HashSet<>();

//         for(int i=0;i<n;i++){
//             num.add(sc.nextInt());
//         }

//         System.out.println(num.size());
//     }
// }


// Find common elements of two arrays

// public class practice {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // Size of first array
//         int n1 = sc.nextInt();

//         HashSet<Integer> first = new HashSet<>();

//         // Store first array elements
//         for (int i = 0; i < n1; i++) {
//             first.add(sc.nextInt());
//         }

//         // Size of second array
//         int n2 = sc.nextInt();

//         HashSet<Integer> common = new HashSet<>();

//         // Check second array elements
//         for (int i = 0; i < n2; i++) {

//             int element = sc.nextInt();

//             if (first.contains(element)) {
//                 common.add(element);
//             }
//         }

//         // Print common elements
//         System.out.println(common);

//         sc.close();
//     }
// }


//Check Whether Two Arrays Contain the Same Unique Elements
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         HashSet<Integer> num1 = new HashSet<>();
//         HashSet<Integer> num2 = new HashSet<>();

//         int n1 = sc.nextInt();
//         for(int i=0;i<n1;i++){
//             num1.add(sc.nextInt());
//         }

//         int n2 = sc.nextInt();
//         for(int j=0;j<n2;j++){
//             num2.add(sc.nextInt());
//         }

//         //int isUnique = 1;

//         // for(int val : num1){
//         //     if(!num2.contains(val)){
//         //         isUnique = 0;
//         //     }
//         // }

//         // if(isUnique == 1){
//         //     System.out.println("contaon unique element");
//         // }else{
//         //     System.out.println("does not contain unique element");
//         // }

//         if(num1.equals(num2)) {
//             System.out.println("Same");
//         } else {
//             System.out.println("Different");
//         }


//     }
// }


// Find the missing number from the array 1 to N

