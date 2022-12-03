package ru.mirea.practice;

class Employee {

    private String fullname;
    private Converter salary;

    public Employee(String fullname, Converter salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Converter getSalary() {
        return salary;
    }

    public void setSalary(Converter salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " +  fullname + ", salary is " + salary;
    }
}
