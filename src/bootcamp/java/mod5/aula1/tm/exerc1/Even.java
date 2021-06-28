package bootcamp.java.mod5.aula1.tm.exerc1;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print(">: ");
        int n = s.nextInt();
        int m = 2;

        while (m <= n) {
            System.out.println(m);
            m += 2;
        }

        s.close();
    }
}
