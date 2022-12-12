package ru.mirea.practice;

abstract class OnlineShop {
    public static void main(String[] args) {

        Employee e1 = new Employee("Mark Rosov", new Converter(250, 1));
        Employee e2 = new Employee("Rita Bosova", new Converter(45000, 3));
        Employee e3 = new Employee("George Robertson", new Converter(300, 5));
        Employee e4 = new Employee("U Kan Chi", new Converter(10000, 4));
        Employee[] employees = {e1, e2, e3, e4};
        Report report = new Report(employees);
        System.out.println(report);
        report.generateReport();

    }
}

