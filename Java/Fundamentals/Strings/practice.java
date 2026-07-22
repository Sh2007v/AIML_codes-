// // =======================================================
// // PROGRAM 1 : Count Vowels and Consonants
// // =======================================================

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a String: ");
//         String str = sc.nextLine();

//         int vowels = 0;
//         int consonants = 0;

//         str = str.toLowerCase();

//         for(int i=0;i<str.length();i++){

//             char ch = str.charAt(i);

//             if(ch>='a' && ch<='z'){

//                 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//                     vowels++;
//                 else
//                     consonants++;
//             }
//         }

//         System.out.println("Vowels = "+vowels);
//         System.out.println("Consonants = "+consonants);

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 2 : Reverse a String
// // =======================================================

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a String: ");
//         String str = sc.nextLine();

//         String reverse="";

//         for(int i=str.length()-1;i>=0;i--){
//             reverse = reverse + str.charAt(i);
//         }

//         System.out.println("Reversed String = "+reverse);

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 3 : Check Palindrome String
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a String: ");
//         String str = sc.nextLine();

//         String reverse="";

//         for(int i=str.length()-1;i>=0;i--){
//             reverse += str.charAt(i);
//         }

//         if(str.equals(reverse))
//             System.out.println("Palindrome");
//         else
//             System.out.println("Not Palindrome");

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 4 : Count Words in a Sentence
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a Sentence: ");
//         String str = sc.nextLine();

//         String[] words = str.trim().split("\\s+");

//         System.out.println("Total Words = "+words.length);

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 5 : Count Frequency of Each Character
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a String: ");
//         String str = sc.nextLine();

//         str = str.toLowerCase();

//         for(int i=0;i<str.length();i++){

//             char ch = str.charAt(i);

//             if(ch==' ')
//                 continue;

//             boolean visited = false;

//             for(int j=0;j<i;j++){

//                 if(ch==str.charAt(j)){
//                     visited=true;
//                     break;
//                 }
//             }

//             if(visited)
//                 continue;

//             int count=0;

//             for(int j=0;j<str.length();j++){

//                 if(ch==str.charAt(j))
//                     count++;
//             }

//             System.out.println(ch+" = "+count);
//         }

//         sc.close();
//     }
// }

// =======================================================
// PROGRAM 6 : Remove All Spaces from a String
// =======================================================

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a String: ");
//         String str = sc.nextLine();

//         String result = "";

//         for(int i = 0; i < str.length(); i++) {

//             char ch = str.charAt(i);

//             if(ch != ' ') {
//                 result = result + ch;
//             }
//         }

//         System.out.println("String After Removing Spaces: " + result);

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 7 : Check Whether Two Strings are Anagrams
// // =======================================================

// import java.util.Arrays;
// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter First String: ");
//         String str1 = sc.nextLine();

//         System.out.print("Enter Second String: ");
//         String str2 = sc.nextLine();

//         str1 = str1.replace(" ", "").toLowerCase();
//         str2 = str2.replace(" ", "").toLowerCase();

//         if(str1.length() != str2.length()) {

//             System.out.println("Not Anagram");

//         } else {

//             char[] arr1 = str1.toCharArray();
//             char[] arr2 = str2.toCharArray();

//             Arrays.sort(arr1);
//             Arrays.sort(arr2);

//             if(Arrays.equals(arr1, arr2))
//                 System.out.println("Anagram");
//             else
//                 System.out.println("Not Anagram");
//         }

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 8 : Find First Non-Repeated Character
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a String: ");
//         String str = sc.nextLine();

//         str = str.toLowerCase();

//         boolean found = false;

//         for(int i = 0; i < str.length(); i++) {

//             char ch = str.charAt(i);

//             if(ch == ' ')
//                 continue;

//             int count = 0;

//             for(int j = 0; j < str.length(); j++) {

//                 if(ch == str.charAt(j))
//                     count++;
//             }

//             if(count == 1) {

//                 System.out.println("First Non-Repeated Character = " + ch);
//                 found = true;
//                 break;
//             }
//         }

//         if(!found)
//             System.out.println("No Non-Repeated Character Found");

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 9 : Count Alphabets, Digits and Special Characters
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a String: ");
//         String str = sc.nextLine();

//         int alphabets = 0;
//         int digits = 0;
//         int special = 0;

//         for(int i = 0; i < str.length(); i++) {

//             char ch = str.charAt(i);

//             if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

//                 alphabets++;

//             } else if(ch >= '0' && ch <= '9') {

//                 digits++;

//             } else if(ch != ' ') {

//                 special++;

//             }
//         }

//         System.out.println("Alphabets = " + alphabets);
//         System.out.println("Digits = " + digits);
//         System.out.println("Special Characters = " + special);

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 10 : Find the Longest Word in a Sentence
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a Sentence: ");
//         String str = sc.nextLine();

//         String[] words = str.trim().split("\\s+");

//         String longest = words[0];

//         for(int i = 1; i < words.length; i++) {

//             if(words[i].length() > longest.length()) {

//                 longest = words[i];

//             }
//         }

//         System.out.println("Longest Word = " + longest);

//         sc.close();
//     }
// }

// // =======================================================
// // PROGRAM 11 : Count Frequency of Each Word
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a Sentence: ");
//         String str = sc.nextLine().toLowerCase();

//         String[] words = str.trim().split("\\s+");

//         for(int i = 0; i < words.length; i++) {

//             boolean visited = false;

//             for(int j = 0; j < i; j++) {
//                 if(words[i].equals(words[j])) {
//                     visited = true;
//                     break;
//                 }
//             }

//             if(visited)
//                 continue;

//             int count = 0;

//             for(int j = 0; j < words.length; j++) {
//                 if(words[i].equals(words[j]))
//                     count++;
//             }

//             System.out.println(words[i] + " = " + count);
//         }

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 12 : Remove Duplicate Characters
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a String: ");
//         String str = sc.nextLine();

//         String result = "";

//         for(int i = 0; i < str.length(); i++) {

//             char ch = str.charAt(i);

//             if(result.indexOf(ch) == -1)
//                 result += ch;
//         }

//         System.out.println("After Removing Duplicates: " + result);

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 13 : Longest Common Prefix
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Number of Strings: ");
//         int n = sc.nextInt();
//         sc.nextLine();

//         String[] arr = new String[n];

//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextLine();
//         }

//         String prefix = arr[0];

//         for(int i = 1; i < n; i++) {

//             while(!arr[i].startsWith(prefix)) {

//                 prefix = prefix.substring(0, prefix.length() - 1);

//                 if(prefix.isEmpty())
//                     break;
//             }
//         }

//         System.out.println("Longest Common Prefix = " + prefix);

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 14 : Check Whether Two Strings are Rotations
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter First String: ");
//         String str1 = sc.nextLine();

//         System.out.print("Enter Second String: ");
//         String str2 = sc.nextLine();

//         if(str1.length() == str2.length() &&
//            (str1 + str1).contains(str2)) {

//             System.out.println("Rotation");

//         } else {

//             System.out.println("Not Rotation");

//         }

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 15 : String Compression
// // Example : aaabbcccc -> a3b2c4
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a String: ");
//         String str = sc.nextLine();

//         String result = "";

//         int count = 1;

//         for(int i = 0; i < str.length(); i++) {

//             if(i < str.length() - 1 &&
//                str.charAt(i) == str.charAt(i + 1)) {

//                 count++;

//             } else {

//                 result += str.charAt(i);
//                 result += count;
//                 count = 1;

//             }

//         }

//         System.out.println("Compressed String = " + result);

//         sc.close();
//     }
// }
// =======================================================
// PROGRAM 16 : Find Highest Frequency Character
// =======================================================

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a String: ");
//         String str = sc.nextLine().toLowerCase();

//         char maxChar = '\0';
//         int maxCount = 0;

//         for(int i = 0; i < str.length(); i++) {

//             char ch = str.charAt(i);

//             if(ch == ' ')
//                 continue;

//             int count = 0;

//             for(int j = 0; j < str.length(); j++) {

//                 if(ch == str.charAt(j))
//                     count++;

//             }

//             if(count > maxCount) {
//                 maxCount = count;
//                 maxChar = ch;
//             }
//         }

//         System.out.println("Highest Frequency Character = " + maxChar);
//         System.out.println("Frequency = " + maxCount);

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 17 : Print Duplicate Characters
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a String: ");
//         String str = sc.nextLine().toLowerCase();

//         System.out.println("Duplicate Characters:");

//         for(int i = 0; i < str.length(); i++) {

//             char ch = str.charAt(i);

//             if(ch == ' ')
//                 continue;

//             boolean visited = false;

//             for(int j = 0; j < i; j++) {

//                 if(ch == str.charAt(j)) {
//                     visited = true;
//                     break;
//                 }

//             }

//             if(visited)
//                 continue;

//             int count = 0;

//             for(int j = 0; j < str.length(); j++) {

//                 if(ch == str.charAt(j))
//                     count++;

//             }

//             if(count > 1)
//                 System.out.println(ch);

//         }

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 18 : Longest Palindromic Word in a Sentence
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static boolean isPalindrome(String word) {

//         int left = 0;
//         int right = word.length() - 1;

//         while(left < right) {

//             if(word.charAt(left) != word.charAt(right))
//                 return false;

//             left++;
//             right--;

//         }

//         return true;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a Sentence: ");
//         String str = sc.nextLine();

//         String[] words = str.trim().split("\\s+");

//         String longest = "";

//         for(String word : words) {

//             if(isPalindrome(word) && word.length() > longest.length())
//                 longest = word;

//         }

//         if(longest.equals(""))
//             System.out.println("No Palindrome Word Found");
//         else
//             System.out.println("Longest Palindrome Word = " + longest);

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 19 : Check Isomorphic Strings
// // =======================================================

// import java.util.HashMap;
// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter First String: ");
//         String s1 = sc.nextLine();

//         System.out.print("Enter Second String: ");
//         String s2 = sc.nextLine();

//         if(s1.length() != s2.length()) {

//             System.out.println("Not Isomorphic");
//             return;

//         }

//         HashMap<Character, Character> map = new HashMap<>();

//         boolean flag = true;

//         for(int i = 0; i < s1.length(); i++) {

//             char c1 = s1.charAt(i);
//             char c2 = s2.charAt(i);

//             if(map.containsKey(c1)) {

//                 if(map.get(c1) != c2) {
//                     flag = false;
//                     break;
//                 }

//             } else {

//                 if(map.containsValue(c2)) {
//                     flag = false;
//                     break;
//                 }

//                 map.put(c1, c2);

//             }

//         }

//         if(flag)
//             System.out.println("Isomorphic");
//         else
//             System.out.println("Not Isomorphic");

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 20 : Run Length Encoding
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a String: ");
//         String str = sc.nextLine();

//         String encoded = "";

//         int count = 1;

//         for(int i = 0; i < str.length(); i++) {

//             if(i < str.length() - 1 &&
//                str.charAt(i) == str.charAt(i + 1)) {

//                 count++;

//             } else {

//                 encoded += str.charAt(i);
//                 encoded += count;
//                 count = 1;

//             }

//         }

//         System.out.println("Encoded String = " + encoded);

//         sc.close();
//     }
// }
