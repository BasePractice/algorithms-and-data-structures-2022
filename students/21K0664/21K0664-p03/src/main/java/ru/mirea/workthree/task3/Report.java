package ru.mirea.workthree.task3;

class Report {

    public void generateReport(Employee[] a) {
        for (Employee employee : a) {
            System.out.printf("%24s %-1.2f %n", employee.getfullname(), employee.getsalary());
        }
    }
}