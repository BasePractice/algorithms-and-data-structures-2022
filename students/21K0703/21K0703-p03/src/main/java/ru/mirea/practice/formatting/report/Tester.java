package ru.mirea.practice.formatting.report;

abstract class Tester {
    public static void main(String[] args) {
        Employee[] arr = new Employee[3];
        arr[0] = new Employee("Иванов Иван Иванович", 54345.54312);
        arr[1] = new Employee("Петров Петр Петрович", 23875.12345);
        arr[2] = new Employee("Пупкин Василий Игнатович", 54345.76556);

        Report.generateReport(arr);
    }
}
