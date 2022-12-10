package ru.mirea.practice.s21k0627.task1;

public class Student {
    private int id;

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int compare(Student student) {
        if (id - student.getId() < 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student ID " + id;
    }
}
