package ru.mirea.practice.task1;

public class Student {
    private String name;
    public int idNumber;


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

    Student(String name, int idNumber) {
        this.idNumber = idNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "task1.Student{" + "name is '" + name + '\'' + ", iDNumber is " + idNumber + '}';
    }
}