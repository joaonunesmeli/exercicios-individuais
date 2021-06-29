package bootcamp.java.mod5.aula4.tt.exerc4;

public class WageConfig {
    private double profit;
    private int numOfAchievements;

    public WageConfig(double profit, int numOfAchievements) {
        this.profit = profit;
        this.numOfAchievements = numOfAchievements;
    }

    public double getProfit() {
        return profit;
    }

    public int getNumOfAchievements() {
        return numOfAchievements;
    }

    @Override
    public String toString() {
        return "WageConfig{" +
                "profit=" + profit +
                '}';
    }
}
