package ru.mirea.practice.task2to3;

public class Student {
    private String name;
    private String surname;
    private String faculty;
    private String group;
    private int course;
    private int gpa;

    public Student(String name, String surname, String faculty, String group, int course, int gpa) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.group = group;
        this.course = course;
        this.gpa = gpa;
    }


    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", faculty='" + faculty + '\'' + ", group='" + group + '\''
                + ", course=" + course + ", gpa=" + gpa + '}';
    }
}
