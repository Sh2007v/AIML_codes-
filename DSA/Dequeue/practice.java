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


//6. Palindrome check
// import java.util.*;

// public class practice {

//     static boolean isPalindrome(String s) {
//         Deque<Character> dq = new ArrayDeque<>();

//         for (int i = 0; i < s.length(); i++) {
//             dq.offerLast(s.charAt(i));
//         }

//         while (dq.size() > 1) {
//             if (dq.pollFirst() != dq.pollLast()) {   // chars compared by value here (see note)
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         System.out.println(isPalindrome("racecar")); // true
//         System.out.println(isPalindrome("hello"));   // false
//     }
// }


//7. Print elem from both ends alternately
// import java.util.*;

// public class practice{

//     static int[] alternateEnds(int[] arr) {
//         Deque<Integer> dq = new ArrayDeque<>();

//         // put all elements in the deque
//         for (int x : arr) {
//             dq.addLast(x);
//         }

//         int[] res = new int[arr.length];

//         for (int i = 0; i < arr.length; i++) {
//             if (i % 2 == 0) {
//                 res[i] = dq.pollFirst();   // even position -> front
//             } else {
//                 res[i] = dq.pollLast();    // odd position -> back
//             }
//         }
//         return res;
//     }

//     public static void main(String[] args) {
//         int[] a = {1, 2, 3, 4, 5};
//         int[] b = {10, 20, 30, 40};

//         System.out.println(Arrays.toString(alternateEnds(a)));  // [1, 5, 2, 4, 3]
//         System.out.println(Arrays.toString(alternateEnds(b)));  // [10, 40, 20, 30]
//     }
//}

//5. Rotate dq towrds left by k positions
// import java.util.*;

// public class practice {

//     static Deque<Integer> rotateLeft(Deque<Integer> dq, int k) {
//         if (dq.isEmpty()) {
//             return dq;
//         }

//         k = k % dq.size();                 // handles k bigger than the size

//         for (int i = 0; i < k; i++) {
//             dq.addLast(dq.removeFirst());  // front goes to the back
//         }
//         return dq;
//     }

//     public static void main(String[] args) {
//         Deque<Integer> a = new ArrayDeque<>(List.of(1, 2, 3, 4, 5));
//         Deque<Integer> b = new ArrayDeque<>(List.of(10, 20, 30));

//         System.out.println(rotateLeft(a, 2));  // [3, 4, 5, 1, 2]
//         System.out.println(rotateLeft(b, 1));  // [20, 30, 10]
//     }
// }

//6. Minimum of every window of size K

// import java.util.*;

// public class practice {
// static int[] minSlidingWindow(int[] nums, int k) {
//     int[] res = new int[nums.length - k + 1];

//     for (int i = 0; i <= nums.length - k; i++) {
//         int min = nums[i];
//         for (int j = i; j < i + k; j++) {
//             min = Math.min(min, nums[j]);
//         }
//         res[i] = min;
//     }
//     return res;
// }
// }

// import java.util.*;

// public class practice {

//     static int[] minSlidingWindow(int[] nums, int k) {
//         Deque<Integer> dq = new ArrayDeque<>();       // stores indices
//         int[] res = new int[nums.length - k + 1];

//         for (int i = 0; i < nums.length; i++) {

//             // 1. remove the front if it is outside the window
//             if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
//                 dq.pollFirst();
//             }

//             // 2. remove bigger values from the back (they can never be the min)
//             while (!dq.isEmpty() && nums[dq.peekLast()] >= nums[i]) {
//                 dq.pollLast();
//             }

//             // 3. add the current index
//             dq.addLast(i);

//             // 4. once the first window is full, the front is the answer
//             if (i >= k - 1) {
//                 res[i - k + 1] = nums[dq.peekFirst()];
//             }
//         }
//         return res;
//     }

//     public static void main(String[] args) {
//         System.out.println(Arrays.toString(minSlidingWindow(new int[]{5, 3, 8, 1, 4, 7}, 3)));
//         // [3, 1, 1, 1]
//         System.out.println(Arrays.toString(minSlidingWindow(new int[]{2, 2, 2, 2}, 2)));
//         // [2, 2, 2]
//     }
// }
 
//7. Reverse the First K Elements of a Deque

// import java.util.*;

// public class practice {

//     static Deque<Integer> reverseFirstK(Deque<Integer> dq, int k) {
//         k = Math.min(k, dq.size());           // safety if k is bigger than the deque

//         Deque<Integer> temp = new ArrayDeque<>();

//         // 1. take the first k elements out (order kept)
//         for (int i = 0; i < k; i++) {
//             temp.addLast(dq.removeFirst());
//         }

//         // 2. push them back at the front one by one (this reverses them)
//         while (!temp.isEmpty()) {
//             dq.addFirst(temp.removeFirst());
//         }
//         return dq;
//     }

//     public static void main(String[] args) {
//         Deque<Integer> a = new ArrayDeque<>(List.of(1, 2, 3, 4, 5));
//         Deque<Integer> b = new ArrayDeque<>(List.of(10, 20, 30, 40));

//         System.out.println(reverseFirstK(a, 3));  // [3, 2, 1, 4, 5]
//         System.out.println(reverseFirstK(b, 2));  // [20, 10, 30, 40]
//     }
// }


// import java.util.*;

// public class Practice {

//     static Deque<Integer> reverseFirstK(Deque<Integer> dq, int k) {
//         k = Math.min(k, dq.size());        // safety if k is bigger than the deque
//         if (k <= 0) return dq;

//         Deque<Integer> r_dq = new ArrayDeque<>();

//         // Step 1: move the first k elements into r_dq; addFirst reverses them
//         for (int i = 0; i < k; i++) {
//             r_dq.addFirst(dq.removeFirst());
//         }

//         // Step 2: move them back to the front of dq, keeping their (now reversed) order
//         for (int i = 0; i < k; i++) {
//             dq.addFirst(r_dq.removeLast());
//         }

//         return dq;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = Integer.parseInt(sc.nextLine());
//         Deque<Integer> dq = new ArrayDeque<>();

//         for (int i = 0; i < n; i++) {
//             dq.addLast(Integer.parseInt(sc.nextLine()));
//         }

//         int k = Integer.parseInt(sc.nextLine());

//         System.out.println(reverseFirstK(dq, k));
//     }
// }


import java.util.*;

public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Deque<Integer> dq = new ArrayDeque<>();
        
        int size = sc.nextInt();

        for(int i=0;i<size;i++){
            dq.add(sc.nextInt());
        }

        int sum_A = 0;
        int sum_B = 0;

        for(int i=0;i<dq.size();i++){
            if(dq.pollFirst() > dq.pollLast()){
                sum_A+=dq.pollFirst();
                sum_B+=dq.pollLast();
        }
        else{
            sum_A+=dq.pollLast();
            sum_B+=dq.pollFirst();
        }
    }
    System.out.println(sum_A);
    System.out.println(sum_B);
}
}




