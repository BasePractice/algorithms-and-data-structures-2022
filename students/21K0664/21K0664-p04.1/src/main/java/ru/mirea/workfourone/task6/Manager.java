package ru.mirea.workfourone.task6;

public class Manager extends Employer {
    private String firstName;
    private String lastName;
    private double income;
    private double averageSum;

    Manager() {
    }

    Manager(String firstName, String lastName, double income, double averageSum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
        this.averageSum = averageSum;
    }

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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAverageSum(double averageSum) {
        this.averageSum = averageSum;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
