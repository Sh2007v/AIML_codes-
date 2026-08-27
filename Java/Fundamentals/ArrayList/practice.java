import java.util.Scanner;
import java.util.ArrayList;


//Sum of arraylist elem
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner (System.in);

//         System.out.println("Enter array size : ");
//         int size = sc.nextInt();
//         ArrayList<Integer> numbers = new ArrayList<>();

//         for(int i=0;i<size;i++){
//             int val = sc.nextInt();
//             numbers.add(val);
//         }
//         int sum = 0;
//         for(int i=0;i<size;i++){
//             sum += numbers.get(i);
//         }
//         System.out.println("Sum : "+sum);
//     }
// }

// Find max in arraylist
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the array size");
//         int num = sc.nextInt();

//         ArrayList<Integer> number = new ArrayList<>();
//         System.out.println("Enter the Array : ");

//         for(int i=0;i<num;i++){
//             int val = sc.nextInt();
//             number.get(val);
//         }

//         int max = 0;

//         for(int i =0;i<num;i++){
//             if(max>number.get(i)){
//                 max = number.get(i);
//             }
//         }

//         System.out.println("Maximum Element : "+ max);

//     }
//}


//Skip the entered elem from the arraylist
// import java.util.ArrayList;

// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size : ");
//         int size = sc.nextInt();

//         ArrayList<Integer> number = new ArrayList<>();
//         System.out.println("Enter the array : ");

//         for(int i=0;i<size;i++){
//             int val = sc.nextInt();
//             number.add(val);
//         }
        
//         System.out.println("Enter the Element to remove : ");
//         int elem = sc.nextInt();

//         ArrayList<Integer> res_number = new ArrayList<>();

//         for(int i=0;i<size;i++){
//             if(number.get(i) == elem){
//                 continue;
//             }else{
//                 res_number.add(number.get(i));
//             }
//         }

//         System.out.print(res_number);

//     }
// }



//Count a particular element in arraylist
// import java.util.ArrayList;
// import java.util.Scanner;

// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size : ");
//         int size = sc.nextInt();

//         ArrayList<Integer> number = new ArrayList<>();

//         System.out.println("Enter the array : ");
//         for(int i=0;i<size;i++){
//             int val = sc.nextInt();
//             number.add(val);
//         }

//         System.out.println("Enter the element : ");
//         int elem = sc.nextInt();


//         int ct = 0;

//         for(int i=0;i<size;i++){
//             if(number.get(i) == elem){
//                 ct++;
//             }
//         }

//         System.out.println("Count is : "+ ct);
//     }
// }

//Reverse an arraylist
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size of array : ");
//         int size = sc.nextInt();

//         ArrayList<Integer> number = new ArrayList<>();
//         System.out.println("Enter the Array : ");

//         for(int i=0;i<size;i++){
//             int val = sc.nextInt();
//             number.add(val);
//         }

//         ArrayList<Integer> rev_array = new ArrayList<>();
//         for(int i=number.size()-1;i>=0;i--){
//             //number.get(i);
//             rev_array.add(number.get(i));
//         }
        
//         for(int i=0;i<size;i++){
//             System.out.print(rev_array.get(i)+" ");
//         }
        
//     }
// }


//REMOVE DUPLICATES IN ARRAYLIST
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         ArrayList<Integer> num = new ArrayList<>();
//         for(int i=0;i<n;i++){
//             int val = sc.nextInt();
//             num.add(val);
//         }

//         ArrayList<Integer> uniq_Array = new ArrayList<>();
//         for(int i=0;i<n-1;i++){
//             if(num.get(i) == num.get(i+1)){
//                 uniq_Array.add(i);
//                 i++;
//             }
//         }

//         for(int i=0;i<uniq_Array.size();i++){
//             int res_val = uniq_Array.get(i);
//             System.out.print(res_val+" ");
//         }
//     }
// }


//FIND COMMON ELEMENTS
// public class practice {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n1 = sc.nextInt();

//         ArrayList<Integer> arr1 = new ArrayList<>();

//         for (int i = 0; i < n1; i++) {
//             arr1.add(sc.nextInt());
//         }

//         int n2 = sc.nextInt();

//         ArrayList<Integer> arr2 = new ArrayList<>();

//         for (int i = 0; i < n2; i++) {
//             arr2.add(sc.nextInt());
//         }

//         ArrayList<Integer> common_arr = new ArrayList<>();

//         for (int i = 0; i < arr1.size(); i++) {

//             int value = arr1.get(i);

//             if (arr2.contains(value) && !common_arr.contains(value)) {
//                 common_arr.add(value);
//             }
//         }

//         for (int i = 0; i < common_arr.size(); i++) {
//             System.out.print(common_arr.get(i) + " ");
//         }

//         sc.close();
//     }
// }

//MOVE ZEROES TO THE END OF ARRAY

// public class practice {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         ArrayList<Integer> number = new ArrayList<>();

//         for(int i = 0; i < n; i++){
//             number.add(sc.nextInt());
//         }

//         int slow = 0;

//         for(int fast = 0; fast < number.size(); fast++){

//             if(number.get(fast) != 0){

//                 int temp = number.get(fast);
//                 number.set(fast, number.get(slow));
//                 number.set(slow, temp);

//                 slow++;
//             }
//         }

//         System.out.println(number);

//         sc.close();
//     }
// }







