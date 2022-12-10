package ru.mirea.practice.task2;

public class Student implements Comparable<Student> {

    private String name;
    private int idNumber;
    private double gpa;

    public Student(String name, int idNumber, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(gpa, o.gpa);
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ",  idNumber=" + idNumber + ",  gpa=" + gpa + '}';
    }
}
