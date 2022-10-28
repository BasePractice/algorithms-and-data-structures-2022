package ru.mirea.workfourone.task6;

public class Employer {
    private String firstName;
    private String lastName;
    private double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome(int i) {
        return this.income * i;
    }

    @Override
    public String toString() {
        return "Employer{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", income=" + income + '}';
    }
}
