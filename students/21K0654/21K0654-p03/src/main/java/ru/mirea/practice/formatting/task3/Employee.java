package ru.mirea.practice.formatting.task3;

import java.text.DecimalFormat;

public class Employee {
    private String fullname;
    private double salary;

    public Employee(double salary, String fullname) {
        this.salary = salary;
        this.fullname = fullname;
    }

    public Employee(double salary) {
        this.salary = salary;
    }


    DecimalFormat format = new DecimalFormat("1500.05");

    public void out(Employee e) {
        System.out.println("Fullname: " + fullname + " Salary: " + salary);
    }

    public void outSalary(Employee e) {
        System.out.println(" Salary: " + format.format(salary));
    }

}
