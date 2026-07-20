package Java.Fundamentals.LoopingTheory;

// import java.util.Scanner;
// public class practice {


    // public static void main(String[] args) {

    //     Scanner sc = new Scanner(System.in);

        // System.out.print("Enter Number: ");
        // int n = sc.nextInt();

        // int i = 1;
        // int sum = 0;
        // int count = 0;
        // int reverse = 0;
        // int temp = n;

        // ==========================================
        // QUESTION 1 : Print Natural Numbers
        // ==========================================

        /*
        while(i <= n){
            System.out.println(i);
            i++;
        }
        */

        // ==========================================
        // QUESTION 2 : Sum of First N Natural Numbers
        // ==========================================

        /*
        while(i <= n){
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
        */

        // ==========================================
        // QUESTION 3 : Multiplication Table
        // ==========================================

        /*
        while(i <= 10){
            System.out.println(n + " x " + i + " = " + (n * i));
            i++;
        }
        */

        // ==========================================
        // QUESTION 4 : Count Digits
        // ==========================================

        /*
        while(temp > 0){
            count++;
            temp = temp / 10;
        }

        System.out.println("Number of Digits = " + count);
        */

        // ==========================================
        // QUESTION 5 : Reverse a Number
        // ==========================================

        /*
        while(temp > 0){
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        System.out.println("Reverse = " + reverse);
        */

       

        // ================================
        // Take Input
        // ================================

        // System.out.print("Enter First Number: ");
        // int n1 = sc.nextInt();

        // Uncomment only for GCD & LCM
        /*
        System.out.print("Enter Second Number: ");
        int n2 = sc.nextInt();
        */

        // int temp = n1;
        // int reverse = 0;
        // int sum = 0;

        // ==========================================
        // QUESTION 6 : Palindrome Number
        // ==========================================

        /*
        while(temp > 0){
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        if(reverse == n1){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
        */

        // ==========================================
        // QUESTION 7 : GCD
        // ==========================================

        /*
        int a = n1;
        int b = n2;

        while(b != 0){
            int rem = a % b;
            a = b;
            b = rem;
        }

        System.out.println("GCD = " + a);
        */

        // ==========================================
        // QUESTION 8 : LCM
        // ==========================================

        /*
        int a = n1;
        int b = n2;

        int x = a;
        int y = b;

        while(y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }

        int gcd = x;
        int lcm = (a * b) / gcd;

        System.out.println("LCM = " + lcm);
        */

        // ==========================================
        // QUESTION 9 : Armstrong Number (3-digit)
        // ==========================================

        /*
        while(temp > 0){
            int digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }

        if(sum == n1){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
        */

        // ==========================================
        // QUESTION 10 : Sum of Digits
        // ==========================================

        /*
        while(temp > 0){
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        System.out.println("Sum = " + sum);
        */

        

//         sc.close();
//     }
// }


// import java.util.Scanner;

// public class practice {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

        // ============================
        // INPUT
        // ============================

        // System.out.print("Enter First Number: ");
        // int num = sc.nextInt();

        // Uncomment only for Prime Numbers in Range
        /*
        System.out.print("Enter Second Number: ");
        int end = sc.nextInt();
        */

        // int temp = num;
        // int result = 0;
        // int place = 1;
        // int power = 1;
        // int sum = 0;

        // ==========================================
        // QUESTION 1 : Decimal to Binary
        // ==========================================

        /*
        while(temp > 0){

            int rem = temp % 2;

            result = result + (rem * place);

            place = place * 10;

            temp = temp / 2;
        }

        System.out.println("Binary = " + result);
        */

        // ==========================================
        // QUESTION 2 : Binary to Decimal
        // ==========================================

        /*
        while(temp > 0){

            int digit = temp % 10;

            result = result + (digit * power);

            power = power * 2;

            temp = temp / 10;
        }

        System.out.println("Decimal = " + result);
        */

        // ==========================================
        // QUESTION 3 : Happy Number
        // ==========================================

        /*
        while(num != 1 && num != 4){

            sum = 0;

            while(num > 0){

                int digit = num % 10;

                sum = sum + (digit * digit);

                num = num / 10;
            }

            num = sum;
        }

        if(num == 1){
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Unhappy Number");
        }
        */

        // ==========================================
        // QUESTION 4 : Frequency of Digits
        // ==========================================

        /*
        int digit = 0;

        while(digit <= 9){

            int count = 0;

            temp = num;

            while(temp > 0){

                int rem = temp % 10;

                if(rem == digit){
                    count++;
                }

                temp = temp / 10;
            }

            if(count > 0){
                System.out.println(digit + " : " + count);
            }

            digit++;
        }
        */

        // ==========================================
        // QUESTION 5 : Prime Numbers in Range
        // ==========================================

        /*
        int start = num;

        while(start <= end){

            int i = 2;
            boolean prime = true;

            if(start < 2){
                prime = false;
            }

            while(i <= start / 2){

                if(start % i == 0){
                    prime = false;
                    break;
                }

                i++;
            }

            if(prime){
                System.out.print(start + " ");
            }

            start++;
        }
        */

//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class Practice {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

        // ============================
        // INPUT
        // ============================

        // System.out.print("Enter First Number: ");
        // int num = sc.nextInt();

        // Uncomment for GCD/LCM/Menu/Prime Range
        /*
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
        */

        // int i = 1;
        // int sum = 0;
        // int temp = num;
        // int reverse = 0;
        // int result = 0;
        // int place = 1;
        // int power = 1;

        // ==========================================
        // QUESTION 1 : Print Numbers 1 to N
        // ==========================================

        /*
        do{
            System.out.println(i);
            i++;
        }while(i <= num);
        */

        // ==========================================
        // QUESTION 2 : Sum of First N Numbers
        // ==========================================

        /*
        do{
            sum += i;
            i++;
        }while(i <= num);

        System.out.println("Sum = " + sum);
        */

        // ==========================================
        // QUESTION 3 : Multiplication Table
        // ==========================================

        /*
        do{
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }while(i <= 10);
        */

        // ==========================================
        // QUESTION 4 : Count Digits
        // ==========================================

        /*
        int count = 0;

        do{
            count++;
            temp = temp / 10;
        }while(temp > 0);

        System.out.println("Digits = " + count);
        */

        // ==========================================
        // QUESTION 5 : Reverse Number
        // ==========================================

        /*
        do{

            int digit = temp % 10;

            reverse = reverse * 10 + digit;

            temp = temp / 10;

        }while(temp > 0);

        System.out.println("Reverse = " + reverse);
        */

        // ==========================================
        // QUESTION 6 : Palindrome Number
        // ==========================================

        /*
        do{

            int digit = temp % 10;

            reverse = reverse * 10 + digit;

            temp = temp / 10;

        }while(temp > 0);

        if(reverse == num){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
        */

        // ==========================================
        // QUESTION 7 : Sum of Digits
        // ==========================================

        /*
        do{

            int digit = temp % 10;

            sum += digit;

            temp = temp / 10;

        }while(temp > 0);

        System.out.println("Sum = " + sum);
        */

        // ==========================================
        // QUESTION 8 : Decimal to Binary
        // ==========================================

        /*
        do{

            int rem = temp % 2;

            result = result + (rem * place);

            place = place * 10;

            temp = temp / 2;

        }while(temp > 0);

        System.out.println("Binary = " + result);
        */

        // ==========================================
        // QUESTION 9 : Binary to Decimal
        // ==========================================

        /*
        do{

            int digit = temp % 10;

            result = result + (digit * power);

            power = power * 2;

            temp = temp / 10;

        }while(temp > 0);

        System.out.println("Decimal = " + result);
        */

        // ==========================================
        // QUESTION 10 : Menu Driven Calculator
        // ==========================================

        /*
        int choice;

        do{

            System.out.println("\n1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            if(choice >= 1 && choice <= 4){

                System.out.print("Enter First Number: ");
                int a = sc.nextInt();

                System.out.print("Enter Second Number: ");
                int b = sc.nextInt();

                switch(choice){

                    case 1:
                        System.out.println("Addition = " + (a + b));
                        break;

                    case 2:
                        System.out.println("Subtraction = " + (a - b));
                        break;

                    case 3:
                        System.out.println("Multiplication = " + (a * b));
                        break;

                    case 4:
                        if(b != 0)
                            System.out.println("Division = " + (a / b));
                        else
                            System.out.println("Cannot divide by zero");
                        break;
                }

            }

        }while(choice != 5);

        System.out.println("Program Exited.");
        */

//         sc.close();
//     }
// }





