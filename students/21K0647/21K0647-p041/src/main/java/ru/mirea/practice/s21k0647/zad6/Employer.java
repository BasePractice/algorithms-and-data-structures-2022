package ru.mirea.practice.s21k0647.zad6;

public class Employer {
    String firstName;
    String lastName;
    double income;

    Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

}
