// import java.util.*;

// public class Practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

//         int size = sc.nextInt();

//         for(int i=0;i<size;i++){
//             pq.offer(arr[i]);
//         }

//         int sum = 0;

//         for(int i=0;i<k;i++){
//             sum += pq.poll();
//         }

//         System.out.println(sum);

//     }
// }

//2. Valid Palindrome
// import java.util.*;

// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         // 1. keep only letters and digits, in lowercase
//         String cleaned = str.toLowerCase().replaceAll("[^a-z0-9]", "");

//         // 2. reverse it
//         String reversed = new StringBuilder(cleaned).reverse().toString();

//         // 3. compare
//         if (cleaned.equals(reversed)) {
//             System.out.println("Valid Palindrome !");
//         } else {
//             System.out.println("Not a valid Palindrome !");
//         }
//     }
// }


// import java.util.*;
// import java.util.stream.*;

// public class Practice {
//     public static void main(String[] args) {

//         // ---------- CONSTRUCTORS ----------

//         // 1. Empty min-heap
//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         // 2. Max-heap
//         PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
//         maxPq.offer(5);
//         maxPq.offer(50);
//         maxPq.offer(25);
//         System.out.println("2. Max-heap top: " + maxPq.peek());              // 50

//         // 3. Custom comparator (sort int[] pairs by second value)
//         PriorityQueue<int[]> pairPq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
//         pairPq.offer(new int[]{1, 30});
//         pairPq.offer(new int[]{2, 10});
//         pairPq.offer(new int[]{3, 20});
//         System.out.println("3. Smallest pair by 2nd value: " + Arrays.toString(pairPq.peek()));  // [2, 10]

//         // 4. Build from an existing collection
//         PriorityQueue<Integer> fromList = new PriorityQueue<>(List.of(9, 3, 7, 1));
//         System.out.println("4. From list, top: " + fromList.peek());         // 1

//         // ---------- INSERT ----------

//         // 5. offer(x)
//         pq.offer(30);
//         pq.offer(10);
//         System.out.println("5. After offer: " + pq.size() + " elements");    // 2

//         // 6. add(x)
//         pq.add(20);
//         System.out.println("6. After add: " + pq.size() + " elements");      // 3

//         // 7. addAll(collection)
//         pq.addAll(List.of(40, 50, 60));
//         System.out.println("7. After addAll: " + pq.size() + " elements");   // 6

//         // ---------- LOOK AT THE TOP ----------

//         // 8. peek()
//         System.out.println("8. peek: " + pq.peek());                         // 10

//         // 9. element()
//         System.out.println("9. element: " + pq.element());                   // 10

//         // ---------- INFORMATION ----------

//         // 14. size()
//         System.out.println("14. size: " + pq.size());                       // 6

//         // 15. isEmpty()
//         System.out.println("15. isEmpty: " + pq.isEmpty());                  // false

//         // 16. contains(obj)
//         System.out.println("16. contains(30): " + pq.contains(30));          // true
//         System.out.println("16. contains(99): " + pq.contains(99));          // false

//         // 17. comparator()
//         System.out.println("17. pq comparator: " + pq.comparator());         // null (natural order)
//         System.out.println("17. maxPq comparator is null? " + (maxPq.comparator() == null)); // false

//         // ---------- TRAVERSAL AND CONVERSION ----------

//         // 18. iterator()  (heap order, NOT sorted)
//         System.out.print("18. iterator: ");
//         Iterator<Integer> it = pq.iterator();
//         while (it.hasNext()) {
//             System.out.print(it.next() + " ");
//         }
//         System.out.println();

//         // 19. toArray()  (heap order, NOT sorted)
//         Object[] arr = pq.toArray();
//         System.out.println("19. toArray: " + Arrays.toString(arr));

//         // 20. stream()
//         int total = pq.stream().mapToInt(Integer::intValue).sum();
//         System.out.println("20. stream sum: " + total);                      // 210

//         // ---------- REMOVE ----------

//         // 12. remove(obj)
//         boolean removed = pq.remove(60);
//         System.out.println("12. remove(60): " + removed + ", size now " + pq.size());  // true, 5

//         // 10. poll()
//         System.out.println("10. poll: " + pq.poll());                        // 10

//         // 11. remove()
//         System.out.println("11. remove: " + pq.remove());                    // 20

//         System.out.println("    Left in queue: " + pq.size());               // 3

//         // 13. clear()
//         pq.clear();
//         System.out.println("13. After clear, isEmpty: " + pq.isEmpty());     // true

//         // ---------- EMPTY-QUEUE BEHAVIOUR ----------
//         System.out.println("poll on empty: " + pq.poll());                   // null
//         System.out.println("peek on empty: " + pq.peek());                   // null

//         try {
//             pq.element();                                                    // throws
//         } catch (NoSuchElementException e) {
//             System.out.println("element() on empty throws NoSuchElementException");
//         }

//         try {
//             pq.remove();                                                     // throws
//         } catch (NoSuchElementException e) {
//             System.out.println("remove() on empty throws NoSuchElementException");
//         }
//     }
// }

//Minimum cost to join ropes

// import java.util.*;

// public class Practice {

//     static int minCost(int[] ropes) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         // 1. put all ropes in a min-heap
//         for (int r : ropes) {
//             pq.offer(r);
//         }

//         int totalCost = 0;

//         // 2. join the two smallest until one rope is left
//         while (pq.size() > 1) {
//             int first = pq.poll();
//             int second = pq.poll();

//             int joined = first + second;
//             totalCost += joined;        // pay the cost
//             pq.offer(joined);           // new rope goes back
//         }

//         return totalCost;
//     }

//     public static void main(String[] args) {
//         System.out.println(minCost(new int[]{4, 3, 2, 6}));  // 29
//         System.out.println(minCost(new int[]{1, 2, 3}));     // 9
//     }
// }


//