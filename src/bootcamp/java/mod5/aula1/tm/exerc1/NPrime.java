package bootcamp.java.mod5.aula1.tm.exerc1;

import java.util.Scanner;

public class NPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print(">: ");
        int n = s.nextInt();

        int count = 0;
        final int MAX = 10000;
        int xs[] = new int[MAX];
        for (int i = 2; i < MAX && count != n; i++) {
            if (xs[i] == -1) {
                continue;
            }

            count++;
            System.out.println(i);
            for (int j = 2 * i; j < MAX; j += i) {
                xs[j] = -1;
            }
        }

        s.close();
    }
}
