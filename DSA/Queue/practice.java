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

// import java.util.*;

// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Queue<Integer> q = new LinkedList<>();

//         System.out.println("Enter the size : ");
//         int size = sc.nextInt();
    
//         System.out.println("Enter the queue : ");
//             for(int i=0;i<size;i++){
//                 q.offer(sc.nextInt());
//             }
        
//         System.out.println("Enter the target element : ");
//         int elem = sc.nextInt();

//         Queue<Integer> res_q = new LinkedList<>();

//         for(int i=0;i<size;i++){
//            int curren_elem = q.poll();

//            if(curren_elem != elem){
//             res_q.offer(curren_elem);
//            }
           
//         System.out.println(res_q);
//     }
//     }
// }


//
// import java.util.*;

// public class practice {

//     static void printReverse(Queue<Integer> queue) {
//         int n = queue.size();

//         // Pick the last element first, then the one before it, and so on
//         for (int i = n - 1; i >= 0; i--) {

//             // Rotate i times so the element at position i comes to the front
//             for (int j = 0; j < i; j++) {
//                 queue.add(queue.poll());
//             }

//             System.out.print(queue.peek() + " ");

//             // Rotate the remaining n - i times to restore the original order
//             for (int j = 0; j < n - i; j++) {
//                 queue.add(queue.poll());
//             }
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = Integer.parseInt(sc.nextLine());
//         Queue<Integer> queue = new LinkedList<>();

//         for (int i = 0; i < n; i++) {
//             queue.add(Integer.parseInt(sc.nextLine()));
//         }

//         printReverse(queue);
//     }
// }


// Interleave two queues

// import java.util.*;

// public class Practice {

//     static Queue<Integer> interleave(Queue<Integer> q1, Queue<Integer> q2) {
//         Queue<Integer> result = new LinkedList<>();

//         // Step 1: take one from each queue alternately
//         while (!q1.isEmpty() && !q2.isEmpty()) {
//             result.add(q1.poll());
//             result.add(q2.poll());
//         }

//         // Step 2: one queue may still have elements, so add the leftovers
//         while (!q1.isEmpty()) {
//             result.add(q1.poll());
//         }
//         while (!q2.isEmpty()) {
//             result.add(q2.poll());
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         Queue<Integer> q1 = new LinkedList<>();
//         Queue<Integer> q2 = new LinkedList<>();

//         int n = Integer.parseInt(sc.nextLine());
//         for (int i = 0; i < n; i++) {
//             q1.add(Integer.parseInt(sc.nextLine()));
//         }

//         int m = Integer.parseInt(sc.nextLine());
//         for (int i = 0; i < m; i++) {
//             q2.add(Integer.parseInt(sc.nextLine()));
//         }

//         System.out.println(interleave(q1, q2));
//     }
// }


//Reverse 1st K elements of a queue

// import java.util.*;

// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Queue<Integer> q = new LinkedList<>();

//         int size = sc.nextInt();

//         for(int i=0;i<size;i++){
//             q.add(sc.nextInt());
//         }

//         int k = sc.nextInt();

//         Queue<Integer> res_q = new LinkedList<>();

//         for(int i=k;i>0;i--){
//             res_q.add(q.poll());
//         }

//         for(int i=k;i<=size;i++){
//             res_q.add(q.poll());
//         }

//         System.out.println(res_q);
//     }
// }


// Sum and average of queue

// import java.util.*;

// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Queue<Integer> q = new LinkedList<>();

//         int size = sc.nextInt();

//         for(int i=0;i<size;i++){
//             q.add(sc.nextInt());
//         }

//         int sum = 0;
//         double avg = 0.0;

//         for(int i=0;i<size;i++){
//             sum+=q.poll();
//         }

//         avg = sum/size;

//         System.out.println("Sum : " + sum);
//         System.out.println("Average : " + avg);
//     }
// }


//

// import java.util.*;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         Queue<Integer> q = new LinkedList<>();

//         int size = sc.nextInt();
//         int max = Integer.MIN_VALUE;

//         for (int i = 0; i < size; i++) {
//             q.add(sc.nextInt());
//         }

//         for (int i = 0; i < size; i++) {
//             int x = q.poll();      // poll once and keep the value
//             if (x > max) {
//                 max = x;
//             }
//             q.add(x);              // put it back at the rear
//         }

//         System.out.println(max);
//         System.out.println(q);     // the queue is unchanged
//     }
// }

//