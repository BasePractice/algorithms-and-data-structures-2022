package ru.mirea.practice.formatting.report;

abstract class Report {
    public static void generateReport(Employee[] arr) {
        for (Employee employee : arr) {
            System.out.printf("%24s %-1.2f %n", employee.getFullName(), employee.getSalary());
        }

    }
}
