package ru.mirea.practice.task3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String nm;
    private String grp;
    private int crs;
    private String spec;
    private double gpa;
    private Date birthday;

    public Student(String nm, String grp, int crs, String spec, double gpa, Date birthday) {
        this.nm = nm;
        this.grp = grp;
        this.crs = crs;
        this.spec = spec;
        this.gpa = gpa;
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return nm;
    }

    public void setName(String nm) {
        this.nm = nm;
    }

    public String getGroup() {
        return grp;
    }

    public void setGroup(String grp) {
        this.grp = grp;
    }

    public int getCourse() {
        return crs;
    }

    public void setCourse(int crs) {
        this.crs = crs;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        SimpleDateFormat smd = new SimpleDateFormat("mm-dd-yyyy");
        return "Student{"
                + "name is " + nm + ", group is " + grp + ", course is " + crs + ", specialization is " + spec + ", GPA is " + gpa + ", birthday is " + smd.format(birthday) + '}';
    }
}
