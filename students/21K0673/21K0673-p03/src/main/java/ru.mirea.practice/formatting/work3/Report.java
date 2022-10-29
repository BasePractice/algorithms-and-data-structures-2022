package ru.mirea.practice.formatting.work3;

class Report {

    public static void generateReport(Employee[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%24s %-1.2f %n", a[i].getfullname(), a[i].getsalary());
        }
    }
}
