package ru.mirea.practice.task4;

public class Student implements Comparable {
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

    @Override
    public int compareTo(double one) {
        if (one == this.getGpa()) {
            return 0;
        }
        if (one > this.getGpa()) {
            return 1;
        }
        return -1;
    }
}
