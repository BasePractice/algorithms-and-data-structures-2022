package ru.mirea.practice.task6;

public class Manager extends Employer {
    private double averageSum;


    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    public Manager() {
        System.out.println("This is manager");
    }

    @Override
    public double getIncome() {
        return super.getIncome() + averageSum;
    }
}
