package ru.mirea.workfourone.task6;

public class Employer {
    private String firstName;
    private String lastName;
    private double income;

    public double getIncome() {
        return this.income;
    }

    Employer() {
    }

    Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Employer{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", income=" + income + '}';
    }
}
