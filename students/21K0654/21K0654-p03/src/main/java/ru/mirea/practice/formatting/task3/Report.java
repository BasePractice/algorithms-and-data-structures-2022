package ru.mirea.practice.formatting.task3;

import java.util.Scanner;

public final class Report {
    private Report() {
    }

    public static Scanner sc = new Scanner(System.in);

    private static Employee[] Baza;

    public static void generateReport() {
        for (Employee employee : Baza) {
            employee.outSalary();
        }
    }

    public static void setBaza() {
        Employee[] arr = new Employee[3];
        double s;
        for (Employee employee : Baza) {
            s = sc.nextDouble();
            employee = new Employee(s);
            employee.out();
        }
        Baza = arr;
        for (Employee employee : Baza) {
            employee.out();
        }
    }

    public static void main(String[] args) {
        setBaza();
        Report.generateReport();
    }
}
