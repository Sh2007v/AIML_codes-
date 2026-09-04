import java.util.Scanner;
import java.util.HashMap;

//1.Input and print the entered elements using hashmap
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         HashMap<Integer,String> map = new HashMap<>();
//         int n =sc.nextInt();
//         for(int i=0;i<n;i++){
//             int id = sc.nextInt();
//             String Name = sc.next();
//             map.put(id,Name);
//         }
//         for(int id : map.keySet()){
//             System.out.print(id + "->" + map.get(id));
//         }
//     }
// }

// //2. Search student by roll number
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         HashMap<Integer,String> map = new HashMap<>();


//         for(int i=0;i<n;i++){
//             int id = sc.nextInt();
//             String name = sc.next();
//             map.put(id,name);
//         }

//         int search_index = sc.nextInt();

//         if(map.containsKey(search_index)){
//             System.out.print(map.get(search_index));
//         }
//         else{
//             System.out.println("Student not found !");
//         }
//     }
// }
//3. Count Frequency of Elements
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         HashMap<Integer,Integer> map = new HashMap<>();

//         for(int i=0;i<n;i++){
//             int num = sc.nextInt();
//             map.put(num,map.getOrDefault(num,0)+1);
//         }

//         for(int num : map.keySet()){
//             System.out.println(num+"->"+map.get(num));
//         }
//     }
// }

//4. Find first non repeating character in a string
// 

// 5. Find duplicate elements
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }

//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int elem : arr){
//             map.put(elem,map.getOrDefault(elem,0)+1);
//         }
        
//         for(int elem : map.keySet()){
//         if(map.get(elem)>1){
//             System.out.print(elem + " ");
//         }
//     }
//     }
// }

//6. Check wether two strings are anagram

public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        HashMap<Character,Integer> map_A = new HashMap<>();
        HashMap<Character,Integer> map_B = new HashMap<>();

        for(int i =0;i<str1.length();i++){
            ch_A = str1.charAt(i);
            map_A.put(ch_A,mapA.getOrDefault(ch_A,0)+1);
        }

        for(int i =0;i<str2.length();i++){
            ch_B = str2.charAt(i);
            map_B.put(ch_B,map_B.getOrDefault(ch_B,0)+1);
        }



        

        
    }
}
