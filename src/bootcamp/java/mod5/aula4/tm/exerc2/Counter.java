package bootcamp.java.mod5.aula4.tm.exerc2;

public class Counter {
    private int counter;

    public Counter() {
        this.counter = 0;
    }

    public Counter(int counter) {
        this.counter = counter;
    }

    public Counter(Counter c) {
        this.counter = c.counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void increment() {
        this.counter++;
    }

    public void decrement() {
        this.counter--;
    }
}
