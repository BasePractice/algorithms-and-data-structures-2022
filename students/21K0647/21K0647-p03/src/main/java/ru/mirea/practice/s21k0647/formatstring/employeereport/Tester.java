package ru.mirea.practice.s21k0647.formatstring.employeereport;

public class Tester {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Bob Bild", 3000);
        employees[1] = new Employee("Jack Manch", 1500);
        employees[2] = new Employee("Mily Singer", 2599);

        for (int i = 0; i < 3; ++i) {
            Report s = new Report(employees[i]);
            String repeated = "_".repeat(35);
            System.out.println(repeated);
            System.out.println(s.generateReport());
        }

    }
}
