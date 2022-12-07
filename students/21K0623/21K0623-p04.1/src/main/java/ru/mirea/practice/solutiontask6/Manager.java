package ru.mirea.practice.solutiontask6;

public class Manager extends Employer {
    private final double averageSum;

    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        return income + averageSum;
    }
}
