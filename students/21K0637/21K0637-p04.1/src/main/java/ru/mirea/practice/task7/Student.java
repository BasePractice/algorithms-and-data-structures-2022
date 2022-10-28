package ru.mirea.practice.task7;

public class Student extends Pupil {
    int course;

    public Student(String firstName, String lastName, int age, int cource) {
        super(firstName, lastName, age);
        this.course = cource;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return super.getAllName()
            + ", age: " + super.getAge()
            + ", course: " + course + ";";
    }
}
