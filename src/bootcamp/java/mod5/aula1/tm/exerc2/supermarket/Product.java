package bootcamp.java.mod5.aula1.tm.exerc2.supermarket;

public class Product {

    private long id;
    private String name;
    private double price;
    private int amount;

    public Product(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(Product p) {
        this.id = p.id;
        this.name = p.name;
        this.price = p.price;
        this.amount = p.amount;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
