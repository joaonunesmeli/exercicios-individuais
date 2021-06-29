package bootcamp.java.mod5.aula5.tm.exerc5.sort;

public class Celular implements Precedente<Celular> {
    private String number;
    private String holder;

    public Celular(String number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "number='" + number + '\'' +
                ", holder='" + holder + '\'' +
                '}';
    }

    @Override
    public boolean precedeA(Celular celular) {
        return number.compareTo(celular.number) < 0;
    }
}
