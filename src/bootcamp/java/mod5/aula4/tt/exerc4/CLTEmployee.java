package bootcamp.java.mod5.aula4.tt.exerc4;

public class CLTEmployee implements Employee {
    private CLTEmployeeLevel level;
    private double bonus;
    private double wage;
    private int paidRestHours;
    private int workHours;
    private double profitSharing;

    CLTEmployee(CLTEmployeeLevel level, double bonus, double wage, int paidRestHours, int workHours, double profitSharing) {
        this.level = level;
        this.wage = wage;
        this.bonus = bonus;
        this.paidRestHours = paidRestHours;
        this.workHours = workHours;
        this.profitSharing = profitSharing;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getPaidRestHours() {
        return paidRestHours;
    }

    public void setPaidRestHours(int paidRestHours) {
        this.paidRestHours = paidRestHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getProfitSharing() {
        return profitSharing;
    }

    public void setProfitSharing(double profitSharing) {
        this.profitSharing = profitSharing;
    }

    @Override
    public double pay(WageConfig cfg) {
        double wagePerHour = workHours > 0 ? wage / workHours : 0.0;
        double w = wage * (1 + bonus * cfg.getNumOfAchievements());
        double v = w + wagePerHour * paidRestHours + cfg.getProfit() * profitSharing;

        int iv = (int)(100 * v);
        return ((double) iv) / 100;
    }

    @Override
    public String toString() {
        return "CLTEmployee{" +
                "level=" + level +
                ", bonus=" + bonus +
                ", wage=" + wage +
                ", paidRestHours=" + paidRestHours +
                ", workHours=" + workHours +
                ", profitSharing=" + profitSharing +
                '}';
    }
}
