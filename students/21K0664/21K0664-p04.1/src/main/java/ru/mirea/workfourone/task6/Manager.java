package ru.mirea.workfourone.task6;

public class Manager extends Employer {
    private String firstName;
    private String lastName;
    private double income;
    private double averageSum;


    Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;

    }


    @Override
    public double getIncome() {
        return this.income + this.averageSum;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", income=" + income + ", averageSum=" + averageSum + '}';
    }

    public double getAverageSum() {
        return averageSum;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public void setAverageSum(double averageSum) {
        this.averageSum = averageSum;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
