import java.util.Scanner;

public class practice {

    // 1. Replace Every Vowel with '*'
    static String replaceVowels(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {

                sb.setCharAt(i, '*');
            }
        }

        return sb.toString();
    }


    // 2. Replace Every Digit with '#'
    static String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {
                sb.setCharAt(i, '#');
            }
        }

        return sb.toString();
    }


    // 3. Remove All Spaces
    static String removeSpaces(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                sb.deleteCharAt(i);
                i--;
            }
        }

        return sb.toString();
    }


    // 4. Remove All Vowels
    static String removeVowels(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {

                sb.deleteCharAt(i);
                i--;
            }
        }

        return sb.toString();
    }


    // 5. Insert '*' After Every Vowel
    static String insertAfterVowels(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {

                sb.insert(i + 1, '*');
                i++;
            }
        }

        return sb.toString();
    }


    // 6. Reverse a String
    static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);

        sb.reverse();

        return sb.toString();
    }


    // 7. Replace a Given Word
    static String replaceWord(String s, String oldWord, String newWord) {
        StringBuilder sb = new StringBuilder(s);

        int index = sb.indexOf(oldWord);

        if (index != -1) {
            sb.replace(index, index + oldWord.length(), newWord);
        }

        return sb.toString();
    }


    public static void main(String[] args) {

        // Test cases

        System.out.println("1. Replace Vowels:");
        System.out.println(replaceVowels("hello world"));

        System.out.println();

        System.out.println("2. Replace Digits:");
        System.out.println(replaceDigits("Room 204, Floor 5!"));

        System.out.println();

        System.out.println("3. Remove Spaces:");
        System.out.println(removeSpaces("I love Java"));

        System.out.println();

        System.out.println("4. Remove Vowels:");
        System.out.println(removeVowels("Hello World"));

        System.out.println();

        System.out.println("5. Insert '*' After Vowels:");
        System.out.println(insertAfterVowels("hello"));

        System.out.println();

        System.out.println("6. Reverse String:");
        System.out.println(reverseString("hello"));

        System.out.println();

        System.out.println("7. Replace Given Word:");
        System.out.println(
            replaceWord("I love Java", "Java", "Python")
        );
    }
}