package ru.mirea.workten.task2;

public class Student {
    private String name;
    private String surname;
    private String specialization;
    private int course;
    private int group;

    private int gpa;

    Student() {}

    Student(String name, String surname, String specialization, int course, int group, int gpa) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getSurname() {
        return surname;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", surname='" + surname;
    }
}