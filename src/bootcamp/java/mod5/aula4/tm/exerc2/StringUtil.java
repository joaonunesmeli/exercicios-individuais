package bootcamp.java.mod5.aula4.tm.exerc2;

public final class StringUtil {
    private StringUtil() {
    }

    private static String pad(char c, int n) {
        char p[] = new char[n];
        for (int i = 0; i < n; i++) {
            p[i] = c;
        }
        return String.valueOf(p);
    }

    public static String rpad(String s, char c, int n) {
        if (n < 1) {
            return s;
        }
        return s + pad(c, n);
    }

    public static String lpad(String s, char c, int n) {
        if (n < 1) {
            return s;
        }
        return pad(c, n) + s;
    }

    public static String ltrim(String s) {
        char chars[] = s.toCharArray();
        int p = 0;
        while (Character.isWhitespace(chars[p])) {
            p++;
        }
        return String.valueOf(chars, p, chars.length - p);
    }

    public static String rtrim(String s) {
        char chars[] = s.toCharArray();
        int len = chars.length;
        while (Character.isWhitespace(chars[len - 1])) {
            len--;
        }
        return String.valueOf(chars, 0, len);
    }

    public static String trim(String s) {
        return rtrim(ltrim(s));
    }

    public static int indexOfN(String s, char c, int n) {
        if (n < 1) {
            return -1;
        }

        int count = n;
        char chars[] = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                if (count == 1) {
                    return i;
                }
                count--;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String ss[] = {
                "A         AAAA            ",
                "          AAAA            ",
                "          AAAA           A",
        };

        for (String s : ss) {
            System.out.printf("String: '%s'\n", s);
            System.out.printf("\tltrim: '%s'\n", ltrim(s));
            System.out.printf("\trtrim: '%s'\n", rtrim(s));
            System.out.printf("\t trim: '%s'\n", trim(s));
        }

        System.out.println("\n\n");

        String r = "AAAA";
        System.out.printf("String: '%s'\n", r);
        System.out.printf("\tlpad: '%s'\n", lpad(r, '.', 4));
        System.out.printf("\trpad: '%s'\n", rpad(r, '.', 4));

        System.out.println("\n\n");

        String w = "121456189";
        System.out.printf("String: '%s'\n", r);
        System.out.printf("\tindexOf(1): %d\n", indexOfN(w, '1', 1));
        System.out.printf("\tindexOf(2): %d\n", indexOfN(w, '1', 2));
        System.out.printf("\tindexOf(3): %d\n", indexOfN(w, '1', 3));
        System.out.printf("\tindexOf(4): %d\n", indexOfN(w, '1', 4));
    }
}
