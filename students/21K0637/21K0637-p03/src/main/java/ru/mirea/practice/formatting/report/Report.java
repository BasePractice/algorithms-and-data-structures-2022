package ru.mirea.practice.formatting.report;

import java.util.Date;

public abstract class Report {
    public static void generateReport(Employee[] array) {
        System.out.printf("Отчет на %tF %n", new Date());
        for (Employee employee : array) {
            System.out.printf("%24s %-1.2f %n", employee.getFullname(), employee.getSalary());
        }
    }
}
