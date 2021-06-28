package bootcamp.java.mod5.aula1.tt;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {
    public static void main(String[] args) {
        int a[] = { 3, 673, 106, 45, 2, 23 };
        sort(a);
    }

    public static void sort(int[] arr) {
        final int NUM_OF_BUCKETS = 10;
        List<List<String>> buckets = createBuckets(NUM_OF_BUCKETS);
        String list[] = convert(arr);
        int maxLen = list[0].length();

        for (int w = maxLen - 1; w >= 0; w--) {
            for (String s : list) {
                int b = Character.getNumericValue(s.charAt(w));
                buckets.get(b).add(s);
            }

            int i = 0;
            for (List<String> b : buckets) {
                for (String s : b) {
                    list[i] = s;
                    i++;
                }
                b.clear();
            }
        }

        for (String s : list) {
            System.out.printf("%s ", s);
        }
        System.out.println("");
    }

    private static List<List<String>> createBuckets(int n) {
        List<List<String>> buckets = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            buckets.add(new ArrayList<>());
        }
        return buckets;
    }

    private static String[] convert(int[] r) {
        int max = 0;
        for (int x : r) {
            max = max > x ? max : x;
        }
        int maxLen = Integer.toString(max).length();

        String[] s = new String[r.length];
        for (int i = 0; i < r.length; i++) {
            String p = Integer.toString(r[i]);
            s[i] = "0".repeat(maxLen - p.length()) + p;
        }
        return s;
    }
}
