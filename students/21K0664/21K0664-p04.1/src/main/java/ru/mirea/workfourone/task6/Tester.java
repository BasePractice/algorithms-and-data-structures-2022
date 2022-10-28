package ru.mirea.workfourone.task6;

public class Tester {
    public static void main(String[] args) {
        Employer employer = new Manager();
        Employer[] a = new Employer[3];
        a[0] = new Employer("Иван", "Иванов", 8327);
        a[1] = new Manager("Не Иван", "Не Иванов", 2383, 1099);
        a[2] = new Manager("Максим", "Иванов", 1234, 12345);

        a[0].getIncome();
        a[1].getIncome();
        a[2].getIncome();

    }
}
