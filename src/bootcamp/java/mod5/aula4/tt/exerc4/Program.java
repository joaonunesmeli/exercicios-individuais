package bootcamp.java.mod5.aula4.tt.exerc4;

public class Program {
    public static void main(String[] args) {
        CLTEmployee technician = CLTEmployees.newEmployee(CLTEmployeeLevel.TECHNICIAN);
        CLTEmployee director = CLTEmployees.newEmployee(CLTEmployeeLevel.DIRECTOR);
        CLTEmployee analyst = CLTEmployees.newEmployee(CLTEmployeeLevel.ANALYST);
        CLTEmployee manager = CLTEmployees.newEmployee(CLTEmployeeLevel.MANAGER);
        WageConfig cfg = new WageConfig(400000, 4);

        System.out.println("Config: " + cfg);
        System.out.println("- technician: " + technician.pay(cfg) + " | " + technician);
        System.out.println("- analyst: " + analyst.pay(cfg) + " | " + analyst);
        System.out.println("- manager: " + manager.pay(cfg) + " | " + manager);
        System.out.println("- director: " + director.pay(cfg) + " | " + director);
    }
}
