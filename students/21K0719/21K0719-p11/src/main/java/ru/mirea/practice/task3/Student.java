package ru.mirea.practice.task3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String group;
    private int course;
    private String specialization;
    private double gpa;
    private Date birth;

    private SimpleDateFormat format;

    public Student(String name, String group, int course, String specialization, double gpa, Date birth) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.specialization = specialization;
        this.gpa = gpa;
        this.birth = birth;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setFormat(SimpleDateFormat format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='" + name + '\''
                + ", group='" + group + '\''
                + ", level=" + course
                + ", specialization='" + specialization + '\''
                + ", gpa=" + gpa
                + ", birth= " + format.format(birth)
                + '}';
    }
}
