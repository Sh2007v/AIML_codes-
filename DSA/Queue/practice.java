// Remove elements

// import java.util.*;

// public class practice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         Queue<Integer> q = new LinkedList<>();

//         System.out.println("Enter num of integers:");
//         int size = sc.nextInt();

//         for (int i = 0; i < size; i++) {
//             q.offer(sc.nextInt());
//         }

//         System.out.println("Enter the num of integers to remove: ");
//         int how_many = sc.nextInt();
        
//         for(int i=0;i<how_many;i++){
//             q.poll();
//         }

//         System.out.println("Remaining queue: " + q);

//         sc.close();
//     }
// }


// Print front element
// import java.util.*;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         Queue<Integer> q = new LinkedList<>();

//         System.out.println("Enter 4 integers:");

//         for (int i = 0; i < 4; i++) {
//             q.offer(sc.nextInt());
//         }

//         System.out.println("Front element: " + q.peek());
//         System.out.println("Queue after peek: " + q);

//         sc.close();
//     }
// }


//Find an element
// import java.util.*;

// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Queue<Integer> q = new LinkedList<>();

//         System.out.println("Enter 7 integers ");
//         for(int i=0;i<7;i++){
//             q.offer(sc.nextInt());
//         }

//         System.out.println("Enter the element to search : ");
//         int target = sc.nextInt();

//         if(q.contains(target)){
//             System.out.println("Found");
//         }
//         else{
//             System.out.println("Not found");
//         }
//     }
// }

//Process until empty

// import java.util.*;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         Queue<Integer> q = new LinkedList<>();

//         System.out.println("Enter the size of queue:");
//         int size = sc.nextInt();

//         System.out.println("Enter the elements:");
//         for (int i = 0; i < size; i++) {
//             q.offer(sc.nextInt());
//         }

//         System.out.println("Removed elements:");

//         while (!q.isEmpty()) {
//             System.out.print(q.poll() + " ");
//         }

//         System.out.println("\nFinal queue: " + q);

//         sc.close();
//     }
// }


//5. Count even and odd elements in a queue

// import java.util.*;

// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Queue<Integer> q = new LinkedList<>();

//         System.out.println("Enter the size : ");
//         int size = sc.nextInt();

//         int ct_even = 0;
//         int ct_odd = 0;

//         System.out.println("Enter the queue : ");
//         for(int i=0;i<size;i++){
//             q.offer(sc.nextInt());
//         }

//         for(int num : q){
//             if(num%2 == 0){
//                 ct_even++;
//             }else{
//                 ct_odd++;
//             }
//         }

//         System.out.println("Odd elements : "+ct_odd);
//         System.out.println("Even elements : "+ct_even);

        
//     }
// }

//6.Sum of queue elements

// import java.util.*;

// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Queue<Integer> q = new LinkedList<>();

//         System.out.println("Enter the size: ");
//         int size = sc.nextInt();

//         System.out.println("Enter the queue: ");
//         for(int i=0;i<size;i++){
//             q.offer(sc.nextInt());
//         }

//         int sum=0;

//         for(int num : q){
//             sum+=num;
//         }

//         System.out.println("Sum is : "+sum);
//     }
// }

//7. Find largest element in queue

// import java.util.*;

// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Queue<Integer> q = new LinkedList<>();

//         System.out.println("Enter the size : ");
//         int size = sc.nextInt();

//         System.out.println("Enter the queue : ");
//         for(int i=0;i<size;i++){
//             q.offer(sc.nextInt());
//         }

//         int max = Integer.MIN_VALUE;

//         for(int num : q){
//             if(num>max){
//                 max = num;
//             }
//         }

//         System.out.println("Largest element : "+max);


//     } 
// }

//8.Count occurences of an element

// import java.util.*;

// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Queue<Integer> q = new LinkedList<>();

//         System.out.println("Enter the size : ");
//         int size = sc.nextInt();

//         System.out.println("Enter the queue : ");
//         for(int i=0;i<size;i++){
//             q.offer(sc.nextInt());
//         }

//         System.out.println("Enter the target : ");
//         int target = sc.nextInt();

//         int ct = 0;

//         for(int num:q ){
//             if(num == target){
//                 ct++;
//             }
//         }

//         System.out.println("Occurrences : "+ct);


//     }
// }

//5 medium problems

//1. Reverse k elements in a queue using queue only.

// import java.util.*;

// public class practice {
//     public static void main(String[] args) {
//         Queue<Integer> q = new ArrayDeque<>();
//         Queue<Integer> temp = new ArrayDeque<>();

//         q.offer(10);
//         q.offer(20);
//         q.offer(30);
//         q.offer(40);
//         q.offer(50);

//         int k = 3;
//         int n = q.size();

//         if (k < 0 || k > n) {
//             System.out.println("Invalid k");
//             return;
//         }

//         // Move the first k elements into temp
//         for (int i = 0; i < k; i++) {
//             temp.offer(q.poll());
//         }

//         // Reverse temp using queues only
//         for (int i = 0; i < k; i++) {
//             for (int j = 0; j < k - 1; j++) {
//                 temp.offer(temp.poll());
//             }
//         }

//         // Move reversed elements back to q
//         while (!temp.isEmpty()) {
//             q.offer(temp.poll());
//         }

//         // Move the remaining original elements to the front
//         for (int i = 0; i < n - k; i++) {
//             q.offer(q.poll());
//         }

//         System.out.println(q);
//     }
// }


//2. Remove all occurences of an element from a queue

import java.util.*;

public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();

        System.out.println("Enter the size : ");
        int size = sc.nextInt();
    
        System.out.println("Enter the queue : ");
            for(int i=0;i<size;i++){
                q.offer(sc.nextInt());
            }
        
        System.out.println("Enter the target element : ");
        int elem = sc.nextInt();

        Queue<Integer> res_q = new LinkedList<>();

        for(int i=0;i<size;i++){
           int curren_elem = q.poll();

           if(curren_elem != elem){
            res_q.offer(curren_elem);
           }
           
        System.out.println(res_q);
    }
    }
}