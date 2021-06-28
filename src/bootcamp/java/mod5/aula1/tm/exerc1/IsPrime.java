package bootcamp.java.mod5.aula1.tm.exerc1;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(">: ");
        int n = s.nextInt();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Não");
                s.close();
                return;
            }
        }
        System.out.println("Yes");
        s.close();
    }
}
