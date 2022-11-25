package ru.mirea.practice.task1;

public class Student {
    private int studentNumber;

    public Student(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int compareTo(Student student) {
        return studentNumber - student.getStudentNumber();
    }

    @Override
    public String toString() {
        return "Student{" + studentNumber + '}';
    }
}
