package ru.mirea.practice.formatting.report;

public class Main {
    public static void main(String[] args) {
        Employee[] array = {new Employee("Сергеев Г.С.", 64000),
            new Employee("Александров М.А.", 83000),
            new Employee("Иванов В.И", 92000)};
        Report.generateReport(array);
    }
}
