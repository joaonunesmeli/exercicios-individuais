package bootcamp.java.mod5.aula1.tm.exerc2.supermarket;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1L, "Arroz", 10.99));
        products.add(new Product(2L, "Feijão", 14.49));
        products.add(new Product(3L, "Tomate", 9.99));
    }

    public static @Nullable
    Product byName(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                return new Product(p);
            }
        }
        return null;
    }
}
