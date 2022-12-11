package ru.mirea.practice.task2;

public class Student {

    private String name;
    private String surname;
    private String speciality;
    private int group;
    private int course;
    private int idNumber;
    private double gpa;

    public Student(String name, String surname, String speciality, int group, int course, int idNumber, double gpa) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.group = group;
        this.course = course;
        this.idNumber = idNumber;
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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='" + name + '\''
                + ",  surname='" + surname + '\''
                + ",  speciality='" + speciality + '\''
                + ",  group=" + group
                + ",  course=" + course
                + ",  idNumber=" + idNumber
                + '}';
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
