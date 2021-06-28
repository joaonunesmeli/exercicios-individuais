package bootcamp.java.mod5.aula4.tm.exerc2;

import java.awt.event.AdjustmentEvent;

public class Fraction {
    private int signal;
    private int numerator;
    private int denominator;

    public Fraction() {
        this.signal = 1;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        if (numerator == 0 || denominator == 0) {
            this.signal = 1;
            this.numerator = 0;
            this.denominator = 0;
        } else {
            this.numerator = Math.abs(numerator);
            this.denominator = Math.abs(denominator);
            this.signal = numerator * denominator >= 0 ? 1 : -1;
        }
    }

    private Fraction(Fraction f) {
        this.signal = f.signal;
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    private Fraction(int signal, int numerator, int denominator) {
        if (numerator == 0 || denominator == 0) {
            this.denominator = 0;
            this.numerator = 0;
            this.signal = 0;
        } else {
            this.denominator = denominator;
            this.numerator = numerator;
            this.signal = signal;
        }
    }

    public Fraction plus(Fraction b) {
        return new Fraction(
                this.signal * this.numerator * b.denominator + b.signal * b.numerator * this.denominator,
                this.numerator * b.numerator
        );
    }

    public Fraction plus(int b) {
        return plus(new Fraction(b, 1));
    }

    public Fraction less(Fraction b) {
        return plus(b.negate());
    }

    public Fraction less(int b) {
        return less(new Fraction(b, 1));
    }

    public Fraction times(Fraction b) {
        return new Fraction(
                this.signal * b.signal * this.numerator * b.numerator,
                this.denominator * b.denominator
        );
    }

    public Fraction times(int b) {
        int x = Math.abs(b);
        int s = b != 0 ? b / x : 1;
        return new Fraction(
                s * this.signal,
                x * this.numerator,
                this.denominator
        );
    }

    public Fraction divide(Fraction b) {
        return times(new Fraction(b.signal, b.denominator, b.numerator));
    }

    public Fraction divide(int b) {
        int x = Math.abs(b);
        int s = b / x;
        return times(new Fraction(s, 1, x));
    }

    public Fraction negate() {
        Fraction f = new Fraction(this);
        f.signal *= -1;
        return f;
    }

    public double getValue() {
        if (numerator == 0 || denominator == 0) {
            return 0.0;
        }
        return ((double) signal * numerator) / denominator;
    }

    @Override
    public String toString() {
        if (numerator == 0 || denominator == 0) {
            return "0";
        }
        return String.format("%s%d/%d", this.signal < 0 ? "-" : "", this.numerator, this.denominator);
    }

    public static void main(String[] args) {
        fractions();
        timesN();
        timesF();
    }

    private static void fractions() {
        int[] ns = {
                1, 2,
                -1, 2,
                1, 4,
                1, -4,
                1, 3,
                2, 3,
                -2, -3,
                7, 8
        };

        System.out.println("Frações");
        for (int i = 0; i < ns.length; i += 2) {
            Fraction f = new Fraction(ns[i], ns[i + 1]);
            System.out.printf("\t%s = %.4f\n", f, f.getValue());
        }
    }

    private static void timesN() {
        int[] ns = {
                2, 1, 2,
                -10, -1, 2,
                5, 1, 4,
                -2, 1, -4,
                6, 1, 3,
                -3, 2, 3,
                0, -2, -3,
                -1, 7, 8
        };

        System.out.println("Multiplicação por n");
        for (int i = 0; i < ns.length; i += 3) {
            Fraction f = new Fraction(ns[i + 1], ns[i + 2]);
            Fraction g = f.times(ns[i]);
            System.out.printf("\t%d * %s = %s = %.4f\n", ns[i], f, g, g.getValue());
        }
    }

    private static void timesF() {
        int[] ns = {
                2, 1, 2,
                -10, -1, 2,
                5, 1, 4,
                -2, 1, -4,
                6, 1, 3,
                -3, 2, 3,
                0, -2, -3,
                -1, 7, 8
        };

        System.out.println("Multiplicação por fração");
        for (int i = 0; i < ns.length; i += 3) {
            Fraction f = new Fraction(ns[i + 1], ns[i + 2]);
            Fraction g = f.times(ns[i]);
            System.out.printf("\t%d * %s = %s = %.4f\n", ns[i], f, g, g.getValue());
        }
    }
}
