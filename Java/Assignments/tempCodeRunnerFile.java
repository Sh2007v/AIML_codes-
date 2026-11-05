
public class EnigmaTest {

    static int passed = 0;
    static int failed = 0;

    // Compare actual and expected results
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

    // Check invalid plugboard inputs
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

    // Check encryption and decryption
    static void testDecryption(String name, char l, char m, char r,
                               String plugs, String message) {

        Enigma encoder = new Enigma(l, m, r, plugs);
        String encrypted = encoder.process(message);

        Enigma decoder = new Enigma(l, m, r, plugs);
        String decrypted = decoder.process(encrypted);

        test(name, decrypted, message);
    }

    public static void main(String[] args) {

        System.out.println("========== ENIGMA TEST SUITE ==========\n");

        // Basic encryption
        Enigma e1 = new Enigma('A', 'A', 'A', "");
        test("Basic encryption", e1.process("AAAAA"), "BDZGO");

        Enigma e2 = new Enigma('A', 'A', 'A', "");
        test("Single character", e2.process("A"), "B");

        // Different rotor positions
        testDecryption("Rotor B-B-B", 'B', 'B', 'B', "", "HELLO");
        testDecryption("Rotor Z-Z-Z", 'Z', 'Z', 'Z', "", "ENIGMA");

        // Plugboard
        testDecryption("Plugboard AB CD", 'A', 'A', 'A',
                       "AB CD", "AAAAA");

        testDecryption("Plugboard AZ BY CX", 'A', 'A', 'A',
                       "AZ BY CX", "HELLOWORLD");

        // Decryption
        testDecryption("Encryption and decryption", 'A', 'A', 'A',
                       "AB CD", "HELLOWORLD");

        // Edge cases
        Enigma e3 = new Enigma('A', 'A', 'A', "");
        test("Empty input", e3.process(""), "");

        Enigma e4 = new Enigma('A', 'A', 'A', "");
        test("Numbers only", e4.process("12345"), "");

        Enigma e5 = new Enigma('A', 'A', 'A', "");
        test("Spaces and punctuation",
             e5.process("HELLO WORLD!"), "HELLOWORLD");

        testDecryption("Lowercase input", 'A', 'A', 'A',
                       "", "hello");

        // Invalid plugboard
        testException("Same letter pair", "AA");
        testException("Overlapping pairs", "AB AC");
        testException("Single character pair", "A");
        testException("Three character pair", "ABC");

        // Rotor stepping
        testDecryption("26-character rotor stepping", 'A', 'A', 'A',
                       "", "AAAAAAAAAAAAAAAAAAAAAAAAAA");

        // Final report
        System.out.println("\n========== TEST SUMMARY ==========");
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Total: " + (passed + failed));

        System.out.println(failed == 0
                ? "\nALL TESTS PASSED!"
                : "\nSOME TESTS FAILED!");
    }
}
