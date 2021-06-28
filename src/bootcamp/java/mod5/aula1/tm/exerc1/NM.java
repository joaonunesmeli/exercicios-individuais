package bootcamp.java.mod5.aula1.tm.exerc1;

import java.util.Scanner;

public class NM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0;
        int m = 0;

        System.out.print("n: ");
        n = s.nextInt();

        System.out.print("m: ");
        m = s.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i * m);
        }

        s.close();
    }
}
