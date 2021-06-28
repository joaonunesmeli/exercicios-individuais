package bootcamp.java.mod5.aula1.tm.exerc2.supermarket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX = 3;
        double total = 0.0;
        Product list[] = new Product[MAX];
        Scanner s = new Scanner(System.in);

        s.useDelimiter(System.lineSeparator());
        for (int i = 0; i < MAX; i++) {
            boolean ok = false;

            while (!ok) {
                System.out.print("produto: ");
                String name = s.next();

                Product p = Products.byName(name);
                if (p == null) {
                    System.out.println("Produto não encontrado.");
                    continue;
                }

                System.out.print("quantidade: ");
                int amount = s.nextInt();

                total += p.getPrice() * amount;
                p.setAmount(amount);
                list[i] = p;
                ok = true;
            }
        }

        System.out.println("\n");
        for (Product p : list) {
            System.out.printf("Produto %d\n", p.getId());
            System.out.println(p.getName());
            System.out.printf("R$%.2f\n", p.getPrice());
            System.out.printf("Quantidade: %d\n\n", p.getAmount());
        }
        System.out.printf("Valor Total: R$%.2f", total);
    }
}
