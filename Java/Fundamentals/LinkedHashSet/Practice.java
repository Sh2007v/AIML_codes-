
//Remove duplicates from a String

// import java.util.*;

// public class Practice {

//     static String removeDuplicateChars(String s) {
//         Set<Character> lhs = new LinkedHashSet<>();

//         for (int i = 0; i < s.length(); i++) {
//             lhs.add(s.charAt(i));
//         }

//         StringBuilder res = new StringBuilder();
//         for (char c : lhs) {              // for-each, no index needed
//             res.append(c);
//         }
//         return res.toString();
//     }

//     public static void main(String[] args) {
//         System.out.println(removeDuplicateChars("programming"));  // progamin
//         System.out.println(removeDuplicateChars("aabbcc"));       // abc
//     }
// }

//  Unique Words in Order of First Appearance

// import java.util.*;

// public class Practice {

//     static List<String> uniqueWords(String sentence) {
//         String[] words = sentence.trim().toLowerCase().split("\\s+");

//         LinkedHashSet<String> lhs = new LinkedHashSet<>();
//         for (int i = 0; i < words.length; i++) {
//             lhs.add(words[i]);
//         }

//         return new ArrayList<>(lhs);       // set -> list, order kept
//     }

//     public static void main(String[] args) {
//         System.out.println(uniqueWords("to be or not to be"));  // [to, be, or, not]
//         System.out.println(uniqueWords("Java java JAVA"));      // [java]
//     }
// }

// // Union of sets (preserve the order)

// import java.util.*;

// public class Practice {

//     static int[] orderedUnion(int[] a, int[] b) {
//         LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

//         for (int x : a) lhs.add(x);
//         for (int x : b) lhs.add(x);

//         int[] res = new int[lhs.size()];
//         int i = 0;
//         for (int x : lhs) {
//             res[i++] = x;                 // copy the set into the array
//         }
//         return res;
//     }

//     public static void main(String[] args) {
//         System.out.println(Arrays.toString(orderedUnion(new int[]{3, 1, 2}, new int[]{2, 5, 3, 4})));  // [3, 1, 2, 5, 4]
//         System.out.println(Arrays.toString(orderedUnion(new int[]{}, new int[]{7, 7})));               // [7]
//     }
// }


// import java.util.*;

// public class Practice{
//     public static void main(String[] args){
       
//     }
// }


// Kth Distinct Element

// import java.util.*;

// public class Practice {

//     static int kthDistinct(int[] arr, int k) {
//         LinkedHashSet<Integer> set = new LinkedHashSet<>(); 

//         for (int i = 0; i < arr.length; i++) {
//             set.add(arr[i]);
//         }

//         if (k < 1 || set.size() < k) {
//             return -1;
//         }

//         int count = 0;
//         for (int x : set) {        
//             count++;
//             if (count == k) {
//                 return x;            
//             }
//         }
//         return -1;                   
//     }

//     public static void main(String[] args) {
//         System.out.println(kthDistinct(new int[]{9, 8, 9, 7, 6}, 3));  
//         System.out.println(kthDistinct(new int[]{1, 2}, 5));           
//     }
// }


//Last Distinct Element

// import java.util.*;

// public class Practice {

//     static int lastDistinct(int[] arr) {
//         LinkedHashSet<Integer> set = new LinkedHashSet<>();

//         for (int i = 0; i < arr.length; i++) {
//             set.add(arr[i]);
//         }

//         int ct = 0;
//         for (int x : set) {
//             ct++;
//             if (ct == set.size()) {
//                 return x;            // last element of the set
//             }
//         }
//         return -1;                   // empty input: no elements at all
//     }

//     public static void main(String[] args) {
//         System.out.println(lastDistinct(new int[]{1, 2, 3, 2, 1}));   // 3
//         System.out.println(lastDistinct(new int[]{5, 5}));            // 5
//         System.out.println(lastDistinct(new int[]{4, 6, 4, 8, 6}));   // 8
//     }
// }

//15. Compare Two LinkedHashSets: Equal Content vs Equal Order

// import java.util.*;
// public class Practice {

//     static String compare(LinkedHashSet<Integer> a, LinkedHashSet<Integer> b) {
//         if (!a.equals(b)) {
//             return "different elements";            // set equality ignores order
//         }
//         if (new ArrayList<>(a).equals(new ArrayList<>(b))) {
//             return "same elements, same order";     // list equality checks order
//         }
//         return "same elements, different order";
//     }

//     public static void main(String[] args) {
//         LinkedHashSet<Integer> a1 = new LinkedHashSet<>(List.of(1, 2, 3));
//         LinkedHashSet<Integer> b1 = new LinkedHashSet<>(List.of(3, 2, 1));
//         System.out.println(compare(a1, b1));   // same elements, different order

//         LinkedHashSet<Integer> a2 = new LinkedHashSet<>(List.of(1, 2));
//         LinkedHashSet<Integer> b2 = new LinkedHashSet<>(List.of(1, 2));
//         System.out.println(compare(a2, b2));   // same elements, same order

//         LinkedHashSet<Integer> a3 = new LinkedHashSet<>(List.of(1, 2));
//         LinkedHashSet<Integer> b3 = new LinkedHashSet<>(List.of(1, 5));
//         System.out.println(compare(a3, b3));   // different elements
//     }
// }

////Order of First Occurrence Index
// import java.util.*;

// public class Practice {

//     static void firstIndexes(int[] arr) {
//         LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

//         for (int i = 0; i < arr.length; i++) {
//             if (lhs.add(arr[i])) {                    // true = first appearance
//                 System.out.println(arr[i] + "->" + i);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         firstIndexes(new int[]{7, 3, 7, 5, 3});   // 7->0, 3->1, 5->3
//         firstIndexes(new int[]{2, 2});            // 2->0
//     }
// }

