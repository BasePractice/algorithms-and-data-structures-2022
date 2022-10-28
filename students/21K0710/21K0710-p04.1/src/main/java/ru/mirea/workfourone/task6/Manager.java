package ru.mirea.workfourone.task6;

public class Manager extends Employer {
    private double averageSum;

    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    public double getIncome(int i) {
        return super.getIncome(i) + this.averageSum * i;
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() + "averageSum=" + averageSum + '}';
    }
}
