package ru.mirea.practice.task3;

public class Student {
    public String name;
    public int idNumber;
    public int gpa;

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public int getGpa() {
        return gpa;
    }

    Student(String name, int idNumber, int gpa) {
        this.idNumber = idNumber;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "task1.Student{" + "name is " + name + ", iDNumber is " + idNumber + ", GPA is " + gpa + '}';
    }


}