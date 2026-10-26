// import java.util.*;

//Insert and print elements of dq
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Deque<Integer> dq = new ArrayDeque<>();

//         System.out.println("Enter the size : ");
//         int size = sc.nextInt();

//         for(int i=0;i<size;i++){
//             dq.addLast(sc.nextInt());
//         }

//         for(int i=0;i<size;i++){
//             System.out.println(dq.poll());
//         }
//     }
// }

//2 Insert at both ends
// import java.util.*;

// public class practice {
//     public static void main(String[] args) {
//         Deque<Integer> dq = new ArrayDeque<>();

//         dq.addLast(10);
//         dq.addLast(20);
//         dq.addFirst(5);

//         System.out.println(dq);
//     }
// }


//3. Remove from both ends
// import java.util.*;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Deque<Integer> dq = new ArrayDeque<>();

//         System.out.println("Enter size:");
//         int n = sc.nextInt();

//         System.out.println("Enter elements:");
//         for (int i = 0; i < n; i++) {
//             dq.addLast(sc.nextInt());
//         }

//         if (!dq.isEmpty()) {
//             dq.pollFirst();
//         }

//         if (!dq.isEmpty()) {
//             dq.pollLast();
//         }

//         System.out.println("Remaining Deque: " + dq);

//         sc.close();
//     }
// }

//4 Print the first and last elements

// import java.util.*;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Deque<Integer> dq = new ArrayDeque<>();

//         System.out.println("Enter size:");
//         int n = sc.nextInt();

//         System.out.println("Enter elements:");
//         for (int i = 0; i < n; i++) {
//             dq.addLast(sc.nextInt());
//         }

//         if (!dq.isEmpty()) {
//             System.out.println("First: " + dq.peekFirst());
//             System.out.println("Last: " + dq.peekLast());
//         } else {
//             System.out.println("Deque is empty");
//         }

//         sc.close();
//     }
// }

//5. Reverse deque

// import java.util.*;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Deque<Integer> dq = new ArrayDeque<>();

//         System.out.println("Enter size:");
//         int n = sc.nextInt();

//         System.out.println("Enter elements:");
//         for (int i = 0; i < n; i++) {
//             dq.addLast(sc.nextInt());
//         }

//         System.out.println("Reverse order:");

//         while (!dq.isEmpty()) {
//             System.out.print(dq.pollLast() + " ");
//         }

//         sc.close();
//     }
// }

