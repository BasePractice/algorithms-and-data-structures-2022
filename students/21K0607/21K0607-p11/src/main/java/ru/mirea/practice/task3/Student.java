package ru.mirea.practice.task3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student {

    private final String name;
    private String studentGroup;
    private int studentCourse;
    private final Calendar bdate;


    public Student(String name, String group, int course, Calendar birthDate) {
        this.name = name;
        this.studentGroup = group;
        this.studentCourse = course;
        this.bdate = birthDate;
    }

    public String getFormatDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        return format.format(bdate);
    }

    public String getName() {
        return name;
    }

    public Calendar getBdate() {
        return bdate;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(String studentGroup) {
        this.studentGroup = studentGroup;
    }

    public int getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(int studentCourse) {
        this.studentCourse = studentCourse;
    }

    @Override
    public String toString() {
        return "Student" + "name='" + name
                + '\'' + ", studentGroup='" + studentGroup + '\'' + ", studentCourse=" + studentCourse + ", bdate=" + getFormatDate();
    }
}
