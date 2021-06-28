package bootcamp.java.mod5.aula1.tm.exerc2;

public class EmpresaXY {
    public static void main(String[] args) {
        int year = 2021;
        double xValue = 1.13;
        double yValue = 18.4;
        double xRate = 1.48;
        double yRate = 0.32;

        while (xValue <= yValue) {
            System.out.printf("Empresa X - 01/01/%d - Valor da empresa: %.2f\n", year, xValue);
            System.out.printf("Empresa Y - 01/01/%d - Valor da empresa: %.2f\n\n", year, yValue);
            xValue *= 1 + xRate;
            yValue *= 1 + yRate;
            year++;
        }
        System.out.printf("Empresa X - 01/01/%d - Valor da empresa: %.2f\n", year, xValue);
        System.out.printf("Empresa Y - 01/01/%d - Valor da empresa: %.2f\n\n", year, yValue);
    }
}
