
//Count Elements in a Range
// import java.util.*;

// public class Practice {

//     static int countInRange(TreeSet<Integer> set, int lo, int hi) {
//         if (lo > hi) {
//             return 0;                       // subSet would throw IllegalArgumentException
//         }
//         return set.subSet(lo, true, hi, true).size();
//     }

//     public static void main(String[] args) {
//         TreeSet<Integer> a = new TreeSet<>(List.of(1, 3, 5, 7, 9));
//         System.out.println(countInRange(a, 3, 7));   // 3

//         TreeSet<Integer> b = new TreeSet<>(List.of(1, 3, 5));
//         System.out.println(countInRange(b, 6, 9));   // 0
//     }
// }



//Exam Room Seats
// import java.util.*;

// public class Practice {

//     static int seat(TreeSet<Integer> set, int s) {
//         if (set.isEmpty()) {
//             set.add(s);
//             return -1;                         // nobody to compare with
//         }
//         if (set.contains(s)) {
//             return 0;                          // seat already taken
//         }

//         Integer lo = set.lower(s);
//         Integer hi = set.higher(s);

//         int dist = Integer.MAX_VALUE;
//         if (lo != null) dist = Math.min(dist, s - lo);
//         if (hi != null) dist = Math.min(dist, hi - s);

//         set.add(s);
//         return dist;
//     }

//     static void run(int[] occupied, int s) {
//         TreeSet<Integer> set = new TreeSet<>();
//         for (int x : occupied) set.add(x);
//         System.out.println(seat(set, s));
//     }

//     public static void main(String[] args) {
//         run(new int[]{2, 10}, 6);   // 4
//         run(new int[]{}, 3);        // -1
//         run(new int[]{5}, 8);       // 3
//         run(new int[]{5}, 1);       // 4
//         run(new int[]{2, 10}, 9);   // 1
//         run(new int[]{2, 10}, 3);   // 1
//         run(new int[]{4, 7}, 4);    // 0
//     }
// }

//Invalid meeting checker
// import java.util.*;

// public class Practice {

//     static boolean book(TreeSet<int[]> set, int[] m) {
//         if (m[0] >= m[1]) {
//             return false;                                  // invalid meeting
//         }

//         int[] prev = set.floor(m);                         // start <= m's start
//         int[] next = set.ceiling(m);                       // start >= m's start

//         if (prev != null && prev[1] > m[0]) {
//             return false;                                  // previous ends after we start
//         }
//         if (next != null && next[0] < m[1]) {
//             return false;                                  // next starts before we end
//         }

//         set.add(m);                                        // no clash: accept
//         return true;
//     }

//     static void run(int[]... meetings) {
//         TreeSet<int[]> set = new TreeSet<>((a, b) -> Integer.compare(a[0], b[0]));
//         StringBuilder sb = new StringBuilder();
//         for (int[] m : meetings) {
//             sb.append(book(set, m) ? "accepted " : "rejected ");
//         }
//         System.out.println(sb.toString().trim());
//     }

//     public static void main(String[] args) {
//         run(new int[]{1, 5}, new int[]{5, 8}, new int[]{4, 6});      // accepted accepted rejected
//         run(new int[]{10, 20}, new int[]{1, 5});                     // accepted accepted
//         run(new int[]{1, 10}, new int[]{3, 5});                      // accepted rejected
//         run(new int[]{3, 5}, new int[]{1, 10});                      // accepted rejected
//         run(new int[]{1, 5}, new int[]{1, 5});                       // accepted rejected
//         run(new int[]{1, 3}, new int[]{5, 7}, new int[]{3, 5});      // accepted accepted accepted
//         run(new int[]{1, 4}, new int[]{6, 9}, new int[]{3, 7});      // accepted accepted rejected
//     }
// }


