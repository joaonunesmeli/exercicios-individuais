package bootcamp.java.mod5.aula4.tm.exerc2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
    private Calendar calendar;
    private int day;
    private int month;
    private int year;

    public Date() {
        this.calendar = new GregorianCalendar();
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.month = calendar.get(Calendar.MONTH);
        this.year = calendar.get(Calendar.YEAR);
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.year = year;
        this.month = month - 1;
        this.calendar = new GregorianCalendar(year, month - 1, day);
    }

    public boolean isValid() {
        int d = calendar.get(Calendar.DAY_OF_MONTH);
        int m = calendar.get(Calendar.MONTH);
        int y = calendar.get(Calendar.YEAR);
        return d == this.day && m == this.month && y == this.year;
    }

    public void addOneDay() {
        boolean valid = isValid();

        calendar.add(Calendar.DAY_OF_MONTH, 1);
        if (valid) {
            this.day = calendar.get(Calendar.DAY_OF_MONTH);
            this.month = calendar.get(Calendar.MONTH);
            this.year = calendar.get(Calendar.YEAR);
        }
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", getDay(), getMonth(), getYear());
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month + 1;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        try {
            Date d = new Date(30,2,2021);
            System.out.printf("%s é uma data %s\n", d, d.isValid() ? "válida" : "inválida");
            d.addOneDay();
            System.out.printf("[+1] %s é uma data %s\n", d, d.isValid() ? "válida" : "inválida");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
