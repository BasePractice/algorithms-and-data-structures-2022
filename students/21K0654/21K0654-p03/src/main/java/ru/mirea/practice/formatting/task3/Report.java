package ru.mirea.practice.formatting.task3;

import java.util.Scanner;

public class Report {
    private static Employee[] Baza;

    public static void generateReport() {
        for (int i = 0; i < Baza.length; i++) {
            Baza[i].outSalary(Baza[i]);
        }
    }

    public static void setBaza() {
        Scanner sc = new Scanner(System.in);
        Employee[] arr = new Employee[3];
        double s;
        for (int i = 0; i < arr.length; i++) {
            s = sc.nextDouble();
            arr[i] = new Employee(s);
            arr[i].out(arr[i]);
        }
        Baza = arr;
        for (int i = 0; i < Baza.length; i++) {
            Baza[i].out(Baza[i]);
        }
    }

    public static void main(String[] args) {
        setBaza();
        Report.generateReport();
    }
}
