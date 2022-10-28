package ru.mirea.workthree.task8;

public final class Report {
    private Report() {
    }

    public static void generateReport(Employee[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Имя, выплаты: %s %30.2f", arr[i].getFullname(), arr[i].getSalary());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[1] = new Employee("John", 1000);
        arr[2] = new Employee("Mary", 500.154325);
        arr[3] = new Employee("Sarah", 32.167);
        arr[0] = new Employee("Paul", 0.16576923);
        arr[4] = new Employee("James", 235);
        generateReport(arr, 5);
    }
}
