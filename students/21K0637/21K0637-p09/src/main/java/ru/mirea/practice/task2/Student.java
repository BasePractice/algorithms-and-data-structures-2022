package ru.mirea.practice.task2;

public class Student implements Comparable<Student> {
    private int gpa;
    private int idNum;

    public Student(int gpa, int idNum) {
        this.gpa = gpa;
        this.idNum = idNum;
    }


    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    @Override
    public String toString() {
        return "Student{"
            + "GPA=" + gpa
            + ", idNum=" + idNum
            + '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getGpa() - o.getGpa();
    }
}
