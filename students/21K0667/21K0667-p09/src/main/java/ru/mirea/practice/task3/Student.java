package ru.mirea.practice.task3;

public class Student {
    private double gpa;

    public Student(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "gpa = " + gpa + '}';
    }

    public static void print(Student[] arr) {
        for (Student student : arr) {
            System.out.print(student + " ");
        }
    }
}
