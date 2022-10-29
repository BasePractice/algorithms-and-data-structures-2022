package ru.mirea.practice.formatting.report;

public class Employee {
    private final String fullname;
    private final double salary;

    public Employee(String fullname, int salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "{" + '\'' + fullname + '\'' + ", зарплата - " + salary + '}';
    }
}
