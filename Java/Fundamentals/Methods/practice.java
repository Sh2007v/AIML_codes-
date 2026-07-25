// // =======================================================
// // PROGRAM 1 : Factorial Using Method
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static long factorial(int n) {

//         long fact = 1;

//         for(int i = 1; i <= n; i++) {
//             fact *= i;
//         }

//         return fact;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a Number: ");
//         int n = sc.nextInt();

//         System.out.println("Factorial = " + factorial(n));

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 2 : Check Prime Number Using Method
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static boolean isPrime(int n) {

//         if(n <= 1)
//             return false;

//         for(int i = 2; i <= n / 2; i++) {

//             if(n % i == 0)
//                 return false;

//         }

//         return true;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a Number: ");
//         int n = sc.nextInt();

//         if(isPrime(n))
//             System.out.println("Prime Number");
//         else
//             System.out.println("Not a Prime Number");

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 3 : Greatest of Three Numbers Using Method
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static int greatest(int a, int b, int c) {

//         if(a >= b && a >= c)
//             return a;
//         else if(b >= a && b >= c)
//             return b;
//         else
//             return c;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter First Number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter Second Number: ");
//         int b = sc.nextInt();

//         System.out.print("Enter Third Number: ");
//         int c = sc.nextInt();

//         System.out.println("Greatest Number = " + greatest(a, b, c));

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 4 : Armstrong Number Using Method
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static boolean isArmstrong(int n) {

//         int temp = n;
//         int sum = 0;

//         while(temp > 0) {

//             int digit = temp % 10;
//             sum += digit * digit * digit;
//             temp /= 10;

//         }

//         return sum == n;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a Number: ");
//         int n = sc.nextInt();

//         if(isArmstrong(n))
//             System.out.println("Armstrong Number");
//         else
//             System.out.println("Not an Armstrong Number");

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 5 : Reverse a Number Using Method
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static int reverse(int n) {

//         int rev = 0;

//         while(n > 0) {

//             int digit = n % 10;
//             rev = rev * 10 + digit;
//             n /= 10;

//         }

//         return rev;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a Number: ");
//         int n = sc.nextInt();

//         System.out.println("Reversed Number = " + reverse(n));

//         sc.close();
//     }
// }

// =======================================================
// PROGRAM 6 : Check Palindrome Number Using Method
// =======================================================

// import java.util.Scanner;

// public class Main {

//     public static int reverse(int n) {

//         int rev = 0;

//         while(n > 0) {
//             int digit = n % 10;
//             rev = rev * 10 + digit;
//             n /= 10;
//         }

//         return rev;
//     }

//     public static boolean isPalindrome(int n) {

//         return n == reverse(n);

//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a Number: ");
//         int n = sc.nextInt();

//         if(isPalindrome(n))
//             System.out.println("Palindrome Number");
//         else
//             System.out.println("Not a Palindrome Number");

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 7 : GCD (HCF) Using Method
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static int gcd(int a, int b) {

//         while(b != 0) {

//             int temp = b;
//             b = a % b;
//             a = temp;

//         }

//         return a;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter First Number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter Second Number: ");
//         int b = sc.nextInt();

//         System.out.println("GCD = " + gcd(a, b));

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 8 : LCM Using Methods
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static int gcd(int a, int b) {

//         while(b != 0) {

//             int temp = b;
//             b = a % b;
//             a = temp;

//         }

//         return a;
//     }

//     public static int lcm(int a, int b) {

//         return (a * b) / gcd(a, b);

//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter First Number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter Second Number: ");
//         int b = sc.nextInt();

//         System.out.println("LCM = " + lcm(a, b));

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 9 : Sum of Digits Using Method
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static int sumOfDigits(int n) {

//         int sum = 0;

//         while(n > 0) {

//             sum += n % 10;
//             n /= 10;

//         }

//         return sum;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a Number: ");
//         int n = sc.nextInt();

//         System.out.println("Sum of Digits = " + sumOfDigits(n));

//         sc.close();
//     }
// }


// // =======================================================
// // PROGRAM 10 : Simple Calculator Using Methods
// // =======================================================

// import java.util.Scanner;

// public class Main {

//     public static int add(int a, int b) {
//         return a + b;
//     }

//     public static int subtract(int a, int b) {
//         return a - b;
//     }

//     public static int multiply(int a, int b) {
//         return a * b;
//     }

//     public static double divide(int a, int b) {

//         if(b == 0) {
//             System.out.println("Division by Zero is Not Possible.");
//             return 0;
//         }

//         return (double)a / b;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter First Number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter Second Number: ");
//         int b = sc.nextInt();

//         System.out.println("1. Addition");
//         System.out.println("2. Subtraction");
//         System.out.println("3. Multiplication");
//         System.out.println("4. Division");

//         System.out.print("Enter Your Choice: ");
//         int choice = sc.nextInt();

//         switch(choice) {

//             case 1:
//                 System.out.println("Result = " + add(a, b));
//                 break;

//             case 2:
//                 System.out.println("Result = " + subtract(a, b));
//                 break;

//             case 3:
//                 System.out.println("Result = " + multiply(a, b));
//                 break;

//             case 4:
//                 System.out.println("Result = " + divide(a, b));
//                 break;

//             default:
//                 System.out.println("Invalid Choice");

//         }

//         sc.close();
//     }
// }

