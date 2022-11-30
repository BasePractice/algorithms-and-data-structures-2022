package ru.mirea.workeleven.task3;

import java.util.Date;

public class Student {
    private String name;
    public int idnumber;
    public int gpa;
    private Date date;

    Student(String name, int idnumber, int gpa, Date date) {
        this.date = date;
        this.idnumber = idnumber;
        this.name = name;
        this.gpa = gpa;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdnumber() {
        return idnumber;
    }

    public String getName() {
        return name;
    }

    public void setIdnumber(int idnumber) {
        this.idnumber = idnumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public int getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", idnumber=" + idnumber + ", gpa=" + gpa + ", date=" + date + '}';
    }
}