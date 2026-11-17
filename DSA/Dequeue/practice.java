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
//             System.out.println(dq.peek());
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
//             dq.peekFirst();
//         }

//         if (!dq.isEmpty()) {
//             dq.peekLast();
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
//             System.out.print(dq.peekLast() + " ");
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
//             if (dq.peekFirst() != dq.peekLast()) {   // chars compared by value here (see note)
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
//                 res[i] = dq.peekFirst();   // even position -> front
//             } else {
//                 res[i] = dq.peekLast();    // odd position -> back
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
//                 dq.peekFirst();
//             }

//             // 2. remove bigger values from the back (they can never be the min)
//             while (!dq.isEmpty() && nums[dq.peekLast()] >= nums[i]) {
//                 dq.peekLast();
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


// 1. Two-End Coin Game
// Coins are in a row. Two players take turns, and each takes the larger of the two end coins. Print both scores.
// Example: [4, 9, 2, 7] → A = 16, B = 6

// import java.util.*;
// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         Deque<Integer> dq = new ArrayDeque<>();

//         int size = sc.nextInt();
//         for (int i = 0; i < size; i++) {
//             dq.add(sc.nextInt());
//         }

//         int sum_A = 0;
//         int sum_B = 0;
//         boolean aTurn = true;

//         while (!dq.isEmpty()) {
//             int coin;

//             // take the larger end coin (on a tie, take from the front)
//             if (dq.peekFirst() >= dq.peekLast()) {
//                 coin = dq.pollFirst();
//             } else {
//                 coin = dq.pollLast();
//             }

//             if (aTurn) {
//                 sum_A += coin;
//             } else {
//                 sum_B += coin;
//             }

//             aTurn = !aTurn;   // switch players
//         }

//         System.out.println("A = " + sum_A);
//         System.out.println("B = " + sum_B);
//     }
// }


//Recently Viewed Products
// Keep the last N viewed products, with the most recent at the front. Viewing a product that is already in the list moves it to the front, and the oldest one is dropped when the list is full.
// Example: capacity 3, views A, B, C, A, D → [D, A, C]

// import java.util.*;
// public class practice {

//     static void view(Deque<String> dq, int capacity, String product) {
//         if (dq.contains(product)) {
//             dq.remove(product);          // already there: take it out of its old place
//         } else if (dq.size() == capacity) {
//             dq.removeLast();             // new product and list is full: drop the oldest
//         }
//         dq.addFirst(product);            // the latest view always goes to the front
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int capacity = Integer.parseInt(sc.nextLine());
//         int n = Integer.parseInt(sc.nextLine());

//         Deque<String> dq = new ArrayDeque<>();

//         for (int i = 0; i < n; i++) {
//             view(dq, capacity, sc.nextLine());
//         }

//         System.out.println(dq);
//     }
// }



//Some more important MEDIUM level problems

// 1. Safe Ticket Counter
// People join with join(name, isVip). VIPs go to the front and regular customers to the rear. A name already in the line cannot join again. serve() takes from the front, serveLast() takes from the rear, and both print Line is empty instead of crashing.
// Example: join R1, R2, V1(vip), R1 (rejected), serve, serveLast, serve, serve → V1, R2, R1, Line is empty
// Practice: offerFirst, offerLast, contains, pollFirst, pollLast

// 2. Exception or Null?
// Run the same four operations on an empty deque in two ways: getFirst, getLast, removeFirst, removeLast inside try/catch, and peekFirst, peekLast, pollFirst, pollLast with null checks. Print what each one does.
// Example output: getFirst -> NoSuchElementException, peekFirst -> null
// Practice: getFirst, getLast, removeFirst, removeLast, peekFirst, peekLast, pollFirst, pollLast

// 3. Palindrome Checker
// Put the characters of a string into a deque and check if it is a palindrome by comparing the two ends and removing them, until fewer than two characters remain.
// Example: "racecar" → true; "abca" → false
// Practice: addLast, pollFirst, pollLast, size

// 4. Zigzag Printer
// Print the elements alternately from the front and the rear.
// Example: [1, 2, 3, 4, 5] → 1 5 2 4 3
// Practice: removeFirst, removeLast, isEmpty

// 5. Rotate by K
// Rotate a deque left by K positions or right by K positions, based on a command. Handle K larger than the size (use k % size).
// Example: [1, 2, 3, 4, 5], left 2 → [3, 4, 5, 1, 2]; right 2 → [4, 5, 1, 2, 3]
// Practice: pollFirst, addLast, pollLast, addFirst, size

// 6. Reverse a Deque Two Ways
// Reverse a deque using only pollFirst and addFirst into a second deque. Then reverse it again using push and pop as a stack.
// Example: [1, 2, 3, 4] → [4, 3, 2, 1]
// Practice: pollFirst, addFirst, push, pop, isEmpty

// 7. Playlist Editor
// A playlist can contain repeated songs. Support the commands REMOVE_FIRST song (removes the first occurrence from the front) and REMOVE_LAST song (removes the last occurrence, searching from the rear). Print Not found when the song is missing.
// Example: [A, B, A, C, A], REMOVE_FIRST A, REMOVE_LAST A → [B, A, C]
// Practice: removeFirstOccurrence, removeLastOccurrence, contains

// 8. Undo / Redo Editor
// Commands: TYPE text, UNDO, REDO, SHOW. Keep two deques used as stacks, one for done actions and one for undone actions. A new TYPE clears the redo history.
// Example: TYPE a, TYPE b, UNDO, REDO, UNDO, TYPE c, REDO → text ac, and the final REDO prints Nothing to redo
// Practice: push, pop, peekFirst, clear, isEmpty

// 9. Remove Adjacent Duplicates
// Repeatedly remove pairs of equal adjacent characters from a string, using a deque as a stack.
// Example: "abbaca" → "ca"
// Idea: if the top (peekFirst) equals the current character, pop; otherwise push.
// Practice: push, pop, peekFirst, isEmpty

// 10. Postfix Expression Evaluator
// Evaluate expressions such as "5 3 + 8 2 - *". Push numbers, and for each operator pop two numbers and push the result.
// Example: "5 3 + 8 2 - *" → 48
// Practice: push, pop, isEmpty

// 11. Capacity-Limited Task Tray
// Use new LinkedBlockingDeque<>(3) for a tray with a capacity of 3. Urgent tasks use offerFirst, normal tasks use offerLast. Print Tray full: <task> rejected when the offer returns false.
// Example: offers N1, N2, U1(urgent), N3 → N3 rejected
// Note: a plain ArrayDeque has no capacity limit, so its offer methods always return true. They return false only for a bounded deque like this one.
// Practice: offerFirst, offerLast, pollFirst, size

// 12. Merge Two Sorted Deques
// Merge two sorted deques into one sorted deque without copying either into an array.
// Example: [1, 4, 7] and [2, 3, 9] → [1, 2, 3, 4, 7, 9]
// Practice: peekFirst, pollFirst, addLast, isEmpty

// 13. Pile Builder
// You have a row of cubes with side lengths. You build one vertical pile, always taking the cube from the left end or the right end of the row. Each cube placed must have a side length less than or equal to the one below it. Print Yes if you can build the pile, otherwise No.
// Example: [4, 3, 2, 1, 3, 4] → Yes; [1, 3, 2] → No
// Idea: always take the larger of the two ends, and fail if it is larger than the last placed cube.
// Practice: peekFirst, peekLast, pollFirst, pollLast

// 14. Window Minimum Temperature
// For every window of K consecutive days, print the lowest temperature. Keep a deque of indices with increasing temperatures, so the front is always the minimum.
// Example: [8, 5, 7, 3, 6, 9], K=3 → 5, 3, 3, 3
// Practice: peekFirst, peekLast, pollFirst, pollLast, addLast

// 15. Deque Command Interpreter
// Read commands and run them on one deque. Print the result of each command, and use the null-returning or boolean-returning methods so an empty deque never crashes the program.

