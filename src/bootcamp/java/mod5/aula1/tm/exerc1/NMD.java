package bootcamp.java.mod5.aula1.tm.exerc1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NMD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("n: ");
        int n = s.nextInt();

        System.out.print("m: ");
        int m = s.nextInt();

        System.out.print("d: ");
        int d = s.nextInt();

        List<Integer> ddigits = decompose(d);
        int p = (int) Math.pow(10, m - 1);
        int count = 0;
        while (count < n) {
            List<Integer> pdigits = decompose(p);
            if (check(pdigits, ddigits, m)) {
                System.out.println(p);
                count++;
            }
            p++;
        }

        s.close();
    }

    public static boolean check(List<Integer> ps, List<Integer> ds, int m) {
        int count = 0;
        for (int p : ps) {
            for (int d : ds) {
                if (d == p) {
                    count++;
                }
            }
        }
        return count >= m;
    }

    public static List<Integer> decompose(int n) {
        List<Integer> digits = new ArrayList<>();
        int d = n / 10;
        int r = n % 10;

        while (d != 0 || r != 0) {
            digits.add(r);
            r = d % 10;
            d = d / 10;
        }
        Collections.reverse(digits);
        return digits;
    }
}
