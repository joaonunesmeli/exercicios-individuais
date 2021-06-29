package bootcamp.java.mod5.desafio.martegroup;

public class Guest {
    private String name;
    private GuestType type;

    public Guest(String name, GuestType type) {
        this.name = name;
        this.type = type;
    }

    public void eat() {
        System.out.printf(name + ": Que bolo superno!%s\n", type == GuestType.MELI ? " Viva la Chiqui !!" : "");
    }

    public String getName() {
        return name;
    }

    public GuestType getType() {
        return type;
    }
}
