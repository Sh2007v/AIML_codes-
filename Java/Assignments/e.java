
public class Enigma {

    private static final String REFLECTOR_B =
            "YRUHQSLDPXNGOKMIEBFZCWVJAT";

    private static class Rotor {

        int[] forward = new int[26];
        int[] backward = new int[26];

        int notch;
        int position;

        Rotor(String wiring, char notch, char start) {

            for (int i = 0; i < 26; i++) {
                forward[i] = wiring.charAt(i) - 'A';
                backward[forward[i]] = i;
            }

            this.notch = notch - 'A';
            this.position = start - 'A';
        }

        void step() {
            position = (position + 1) % 26;
        }

        boolean atNotch() {
            return position == notch;
        }

        int encryptForward(int c) {
            return (forward[(c + position) % 26]
                    - position + 26) % 26;
        }

        int encryptBackward(int c) {
            return (backward[(c + position) % 26]
                    - position + 26) % 26;
        }
    }

    private final Rotor left;
    private final Rotor middle;
    private final Rotor right;

    private final int[] reflector = new int[26];
    private final int[] plugboard = new int[26];

    public Enigma(char l, char m, char r, String plugs) {

        if (l < 'A' || l > 'Z' ||
            m < 'A' || m > 'Z' ||
            r < 'A' || r > 'Z') {

            throw new IllegalArgumentException(
                    "Invalid rotor position");
        }

        left = new Rotor(
                "EKMFLGDQVZNTOWYHXUSPAIBRCJ", 'Q', l);

        middle = new Rotor(
                "AJDKSIRUXBLHWTMCQGZNPYFVOE", 'E', m);

        right = new Rotor(
                "BDFHJLCPRTXVZNYEIWGAKMUSQO", 'V', r);

        for (int i = 0; i < 26; i++) {
            reflector[i] = REFLECTOR_B.charAt(i) - 'A';
            plugboard[i] = i;
        }

        setupPlugboard(plugs);
    }

    private void setupPlugboard(String plugs) {

        if (plugs == null || plugs.trim().isEmpty()) {
            return;
        }

        String[] pairs = plugs.trim().toUpperCase().split("\\s+");

        for (String pair : pairs) {

            if (pair.length() != 2) {
                throw new IllegalArgumentException(
                        "Invalid plugboard pair: " + pair);
            }

            int a = pair.charAt(0) - 'A';
            int b = pair.charAt(1) - 'A';

            if (a < 0 || a >= 26 ||
                b < 0 || b >= 26 ||
                a == b ||
                plugboard[a] != a ||
                plugboard[b] != b) {

                throw new IllegalArgumentException(
                        "Invalid or overlapping pair: " + pair);
            }

            plugboard[a] = b;
            plugboard[b] = a;
        }
    }

    private void stepRotors() {

        boolean middleNotch = middle.atNotch();
        boolean rightNotch = right.atNotch();

        if (middleNotch) {
            left.step();
            middle.step();
        }
        else if (rightNotch) {
            middle.step();
        }

        right.step();
    }

    private int encryptLetter(int c) {

        stepRotors();

        c = plugboard[c];

        c = right.encryptForward(c);
        c = middle.encryptForward(c);
        c = left.encryptForward(c);

        c = reflector[c];

        c = left.encryptBackward(c);
        c = middle.encryptBackward(c);
        c = right.encryptBackward(c);

        return plugboard[c];
    }

    public String process(String message) {

        if (message == null) {
            throw new IllegalArgumentException(
                    "Message cannot be null");
        }

        StringBuilder result = new StringBuilder();

        for (char ch : message.toUpperCase().toCharArray()) {

            if (ch >= 'A' && ch <= 'Z') {

                int encrypted = encryptLetter(ch - 'A');

                result.append((char) ('A' + encrypted));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Enigma machine = new Enigma('A', 'A', 'A', "");

        String message = "AAAAA";

        System.out.println("Original Message: " + message);
        System.out.println("Encrypted Message: "
                + machine.process(message));
    }
}
