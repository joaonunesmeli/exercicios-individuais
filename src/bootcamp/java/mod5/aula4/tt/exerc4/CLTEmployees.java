package bootcamp.java.mod5.aula4.tt.exerc4;

import java.util.HashMap;
import java.util.Map;

public final class CLTEmployees {
    private static Map<CLTEmployeeLevel, Double> bonusPerLevel = new HashMap<>();
    private static Map<CLTEmployeeLevel, Double> wagePerLevel = new HashMap<>();
    private static Map<CLTEmployeeLevel, Integer> paidRestHoursPerLevel = new HashMap<>();
    private static Map<CLTEmployeeLevel, Integer> workHoursPerLevel = new HashMap<>();
    private static Map<CLTEmployeeLevel, Double> profitSharingPerLevel = new HashMap<>();

    private CLTEmployees() {}

    static {
        bonusPerLevel.put(CLTEmployeeLevel.TECHNICIAN, 0.05);
        bonusPerLevel.put(CLTEmployeeLevel.ANALYST, 0.08);
        bonusPerLevel.put(CLTEmployeeLevel.MANAGER, 0.125);

        wagePerLevel.put(CLTEmployeeLevel.TECHNICIAN, 3200.0);
        wagePerLevel.put(CLTEmployeeLevel.ANALYST, 4000.0);
        wagePerLevel.put(CLTEmployeeLevel.MANAGER, 6000.0);
        wagePerLevel.put(CLTEmployeeLevel.DIRECTOR, 15000.0);

        paidRestHoursPerLevel.put(CLTEmployeeLevel.ANALYST, 4);
        paidRestHoursPerLevel.put(CLTEmployeeLevel.MANAGER, 4);

        workHoursPerLevel.put(CLTEmployeeLevel.TECHNICIAN, 40);
        workHoursPerLevel.put(CLTEmployeeLevel.ANALYST, 40);
        workHoursPerLevel.put(CLTEmployeeLevel.MANAGER, 36);

        profitSharingPerLevel.put(CLTEmployeeLevel.DIRECTOR, 0.03);
    }

    private static <T> T get(Map<CLTEmployeeLevel, T> m, CLTEmployeeLevel key, T defaultValue) {
        T v = m.get(key);
        if (v == null) {
            return defaultValue;
        }
        return v;
    }

    public static CLTEmployee newEmployee(CLTEmployeeLevel level) {
        double wage = get(wagePerLevel, level, 0.0);
        double bonus = get(bonusPerLevel, level, 0.0);
        int workHours = get(workHoursPerLevel, level, 0);
        int paidRestHours = get(paidRestHoursPerLevel, level, 0);
        double profitSharing = get(profitSharingPerLevel, level, 0.0);

        return new CLTEmployee(level, bonus, wage, paidRestHours, workHours, profitSharing);
    }
}
