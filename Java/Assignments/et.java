
public class EnigmaTest {

    static int passed = 0;
    static int failed = 0;

    static void test(String name, String actual, String expected) {

        if (actual.equals(expected)) {
            System.out.println("[PASS] " + name);
            passed++;
        } else {
            System.out.println("[FAIL] " + name);
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
            failed++;
        }
    }

    static void testException(String name, String plugs) {

        try {
            new Enigma('A', 'A', 'A', plugs);

            System.out.println("[FAIL] " + name);
            failed++;

        } catch (IllegalArgumentException e) {

            System.out.println("[PASS] " + name);
            passed++;
        }
    }

    static void testRotorException(String name,
                                   char l, char m, char r) {

        try {
            new Enigma(l, m, r, "");

            System.out.println("[FAIL] " + name);
            failed++;

        } catch (IllegalArgumentException e) {

            System.out.println("[PASS] " + name);
            passed++;
        }
    }

    static void testDecryption(String name,
                               char l, char m, char r,
                               String plugs, String message) {

        Enigma encoder = new Enigma(l, m, r, plugs);

        String encrypted = encoder.process(message);

        Enigma decoder = new Enigma(l, m, r, plugs);

        String decrypted = decoder.process(encrypted);

        test(name, decrypted, message.toUpperCase()
                .replaceAll("[^A-Z]", ""));
    }

    public static void main(String[] args) {

        System.out.println(
                "========== ENIGMA I TEST SUITE ==========\n");

        // 1. Basic encryption tests

        Enigma e1 = new Enigma('A', 'A', 'A', "");

        test("Basic encryption",
                e1.process("AAAAA"), "BDZGO");

        Enigma e2 = new Enigma('A', 'A', 'A', "");

        test("Single character",
                e2.process("A"), "B");


        // 2. Different rotor positions

        testDecryption("Rotor B-B-B",
                'B', 'B', 'B', "", "HELLO");

        testDecryption("Rotor Z-Z-Z",
                'Z', 'Z', 'Z', "", "ENIGMA");


        // 3. Plugboard tests

        testDecryption("Plugboard AB CD",
                'A', 'A', 'A', "AB CD", "AAAAA");

        testDecryption("Plugboard AZ BY CX",
                'A', 'A', 'A', "AZ BY CX", "HELLOWORLD");

        testDecryption("Plugboard multiple pairs",
                'A', 'A', 'A', "AB CD EF GH", "ENIGMA");


        // 4. Edge cases

        Enigma e3 = new Enigma('A', 'A', 'A', "");

        test("Empty input",
                e3.process(""), "");

        Enigma e4 = new Enigma('A', 'A', 'A', "");

        test("Numbers only",
                e4.process("12345"), "");

        Enigma e5 = new Enigma('A', 'A', 'A', "");

        test("Spaces and punctuation",
                e5.process("HELLO WORLD!"), "HELLOWORLD");

        Enigma e6 = new Enigma('A', 'A', 'A', "");

        test("Lowercase input",
                e6.process("hello"), "HELLO");


        // 5. Encryption and decryption

        testDecryption("Encryption and decryption",
                'A', 'A', 'A', "AB CD", "HELLOWORLD");

        testDecryption("Long message",
                'A', 'A', 'A', "", 
                "THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG");


        // 6. Invalid plugboard tests

        testException("Same letter pair", "AA");

        testException("Overlapping pairs", "AB AC");

        testException("Single character pair", "A");

        testException("Three character pair", "ABC");

        testException("Duplicate pairs", "AB AB");

        testException("Invalid plugboard character", "A1");


        // 7. Invalid rotor positions

        testRotorException("Invalid left rotor",
                '1', 'A', 'A');

        testRotorException("Invalid middle rotor",
                'A', '@', 'A');

        testRotorException("Invalid right rotor",
                'A', 'A', '5');


        // 8. Rotor stepping

        testDecryption("26-character rotor stepping",
                'A', 'A', 'A', "",
                "AAAAAAAAAAAAAAAAAAAAAAAAAA");


        // 9. Final report

        System.out.println(
                "\n========== TEST SUMMARY ==========");

        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Total: " + (passed + failed));

        System.out.println(failed == 0
                ? "\nALL TESTS PASSED!"
                : "\nSOME TESTS FAILED!");
    }
}
