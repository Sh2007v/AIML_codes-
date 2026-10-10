// package Java.Fundamentals.LinkedList;

// import java.util.Scanner;
// import java.util.LinkedList;

// // public class practice {
    
// //     public static void main(String[] args){
// //         Scanner sc = new Scanner(System.in);

// //         LinkedList<Integer> numbers = new LinkedList<>();

// //         System.out.print("Enter the size : ");
// //         int n = sc.nextInt();

// //         for(int i=0;i<n;i++){
// //             int val = sc.nextInt();
// //             numbers.add(val);
// //         }

// //         for(int i=0;i<numbers.size();i++){
// //             System.out.print(numbers.get(i)+" ");
// //         }
// //     }
// // }


// //


// // public class practice{
// //     public static void main(String[] args){
// //         Scanner sc = new Scanner(System.in);

// //         int n =sc.nextInt();
// //         LinkedList<Integer> num = new LinkedList<>();
        
// //         for(int i=0;i<n;i++){
// //             num.add(sc.nextInt());
// //         }

        


// //     }
// // }

// public class practice {

//     // Node structure
//     static class ListNode {
//         int val;
//         ListNode next;

//         // Constructor
//         ListNode(int val) {
//             this.val = val;
//             this.next = null;
//         }
//     }

//     public static void main(String[] args) {

//         // Create nodes
//         ListNode first = new ListNode(10);
//         ListNode second = new ListNode(20);
//         ListNode third = new ListNode(30);
//         ListNode fourth = new ListNode(40);

//         // Connect nodes
//         first.next = second;
//         second.next = third;
//         third.next = fourth;

//         // Head points to the first node
//         ListNode head = first;

//         // Traverse the LinkedList
//         ListNode current = head;

//         while (current != null) {
//             System.out.print(current.val + " / ");
//             current = current.next;
//         }

//         System.out.println("null");
//     }
// }


//5 easy problems

//1.Enter and print the list
// import java.util.Scanner;
// import java.util.LinkedList;

// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         LinkedList<Integer> list = new LinkedList<>();

//         System.out.println("List size : ");
//         int n = sc.nextInt();

//         for(int i=0;i<n;i++){
//             list.add(sc.nextInt());
//         }

//         for(int i=0;i<n;i++){
//             System.out.print(list.get(i) + " ");
//         }
//     }
// }

//2. Add elements at both ends.

// import java.util.Scanner;
// import java.util.LinkedList;

// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         LinkedList<Integer> list = new LinkedList<>();
        
//         System.out.println("Enter the size of list : ");
//         int size = sc.nextInt();

//         System.out.println("Enter the list : ");
//         for(int i=0;i<size;i++){
//             list.add(sc.nextInt());
//         }
        
//         System.out.println("Enter the first element : ");
//         int first_elem = sc.nextInt();
        
//         System.out.println("Enter the last element : ");
//         int last_elem = sc.nextInt();

//         list.addFirst(first_elem);
//         list.addLast(last_elem);

//         for(int i=0;i<list.size();i++){
//             System.out.print(list.get(i) +" ");
//         }
//     }
// }


//3.Access first, last and index element

// import java.util.Scanner;
// import java.util.LinkedList;

// public class practice {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         LinkedList<Integer> list = new LinkedList<>();

//         System.out.println("Enter the size of list:");
//         int size = sc.nextInt();

//         System.out.println("Enter the elements:");
//         for (int i = 0; i < size; i++) {
//             list.add(sc.nextInt());
//         }

//         System.out.println("First element: " + list.getFirst());
//         System.out.println("Last element: " + list.getLast());

//         System.out.println("Enter index:");
//         int index = sc.nextInt();

//         if (index >= 0 && index < list.size()) {
//             System.out.println("Indexed element: " + list.get(index));
//         } else {
//             System.out.println("Invalid index");
//         }

//         sc.close();
//     }
// }

//4.Update and remove elements in a linkedlist
// import java.util.Scanner;
// import java.util.LinkedList;

// public class practice {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         LinkedList<Integer> list = new LinkedList<>();

//         System.out.println("Enter the size of list:");
//         int size = sc.nextInt();

//         System.out.println("Enter the elements:");
//         for (int i = 0; i < size; i++) {
//             list.add(sc.nextInt());
//         }

//         // Update the element at index 2
//         list.set(2, 35);

//         // Remove the element at index 1
//         list.remove(1);

//         // Display the final list
//         System.out.println("Final list: " + list);

//         sc.close();
//     }
// }

//5.Search and count elements

// import java.util.Scanner;
// import java.util.LinkedList;

// public class practice {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         LinkedList<Integer> list = new LinkedList<>();

//         System.out.println("Enter the size:");
//         int size = sc.nextInt();

//         System.out.println("Enter the elements:");
//         for (int i = 0; i < size; i++) {
//             list.add(sc.nextInt());
//         }

//         System.out.println("Enter the element to find:");
//         int elem = sc.nextInt();

//         if (list.contains(elem)) {
//             System.out.println("Element is present");
//         } else {
//             System.out.println("Element is not present");
//         }

//         System.out.println("Number of elements: " + list.size());
//         System.out.println("Is empty: " + list.isEmpty());

//         sc.close();
//     }
// }

//5 medium  problems

//1. Insert at a given position

// import java.util.Scanner;
// import java.util.LinkedList;

// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         LinkedList<Integer> list = new LinkedList<>();
        
//         System.out.println("Enter the size : ");
//         int size = sc.nextInt();

//         System.out.println("Enter the list : ");
//         for(int i=0;i<size;i++){
//             list.add(sc.nextInt());
//         }

//         System.out.println("Enter the index where to add : ");
//         int position = sc.nextInt();
        
//         System.out.println("Enter the element to enter : ");
//         int elem = sc.nextInt();

//         list.add(position,elem);

//         for(int i=0;i<list.size();i++){
//             System.out.print(list.get(i)+" ");
//         }
//     }
// }

// //2. Remove all occurences of an element

// import java.util.Scanner;
// import java.util.LinkedList;

// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         LinkedList<Integer> list = new LinkedList<>();

//         System.out.println("Enter the size : ");
//         int size = sc.nextInt();

//         System.out.println("Enter the list : ");
//         for(int i=0;i<size;i++){
//             list.add(sc.nextInt());
//         }

//         System.out.println("Enter the element to find : ");
//         int element = sc.nextInt();

//         for(int i=0;i<list.size();i++){
//             if(list.get(i) == element){
//                 list.remove(i);
//                 i--;
//             }
//         }

//         for(int i=0;i<list.size();i++){
//             System.out.print(list.get(i)+" ");
//         }
//     }
// }

//3. Reverse a linkedlist (alter the same list)

// import java.util.Scanner;
// import java.util.LinkedList;

// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         LinkedList<Integer> list = new LinkedList<>();

//         System.out.println("Enter the size : ");
//         int size = sc.nextInt();

//         for(int i=0;i<size;i++){
//             list.add(sc.nextInt());
//         }

//         for(int i=list.size()-1;i>=0;i--){
//             System.out.print(list.get(i)+" ");
//         }

//     }
// }

//4. Move even elements to the front

//using 1 linkedlist
// import java.util.LinkedList;
// import java.util.Scanner;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         LinkedList<Integer> list = new LinkedList<>();

//         System.out.println("Enter the size:");
//         int size = sc.nextInt();

//         System.out.println("Enter the elements:");
//         for (int i = 0; i < size; i++) {
//             list.add(sc.nextInt());
//         }

//         int evenIndex = 0;

//         for (int i = 0; i < list.size(); i++) {
//             if (list.get(i) % 2 == 0) {
//                 int even = list.get(i);

//                 // Shift elements between evenIndex and i right
//                 for (int j = i; j > evenIndex; j--) {
//                     list.set(j, list.get(j - 1));
//                 }

//                 list.set(evenIndex, even);
//                 evenIndex++;
//             }
//         }

//         System.out.println("Rearranged list: " + list);
//         sc.close();
//     }
// }

//using 2 linkedlists.

// import java.util.LinkedList;
// import java.util.Scanner;

// public class practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         LinkedList<Integer> list = new LinkedList<>();
//         LinkedList<Integer> result = new LinkedList<>();

//         System.out.println("Enter the size:");
//         int size = sc.nextInt();

//         System.out.println("Enter the elements:");
//         for (int i = 0; i < size; i++) {
//             list.add(sc.nextInt());
//         }

//         // Add even numbers first
//         for (int num : list) {
//             if (num % 2 == 0) {
//                 result.add(num);
//             }
//         }

//         // Add odd numbers afterward
//         for (int num : list) {
//             if (num % 2 != 0) {
//                 result.add(num);
//             }
//         }

//         System.out.println("Rearranged list: " + result);
//         sc.close();
//     }
// }

