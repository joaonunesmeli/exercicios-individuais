package bootcamp.java.mod5.aula4.tt.exerc4;

public class PJEmployee implements Employee {
    private double wage;
    private double workedHours;

    public PJEmployee(double wage) {
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double pay(WageConfig cfg) {
        return wage * workedHours;
    }
}
