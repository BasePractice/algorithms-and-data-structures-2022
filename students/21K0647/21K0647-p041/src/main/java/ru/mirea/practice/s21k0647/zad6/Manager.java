package ru.mirea.practice.s21k0647.zad6;

public class Manager extends Employer {
    double averageSum;

    Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        return income + averageSum;
    }
}
