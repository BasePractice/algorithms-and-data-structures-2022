package ru.mirea.practice.task1;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String nm;
    private String grp;
    private int crs;
    private String spec;
    private double gpa;

    public Student(String nm, String grp, int crs, String spec, double gpa) {
        this.nm = nm;
        this.grp = grp;
        this.crs = crs;
        this.spec = spec;
        this.gpa = gpa;
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
        return "Student{"
                + "name is " + nm + '\''
                + ", group is " + grp + '\''
                + ", course is " + crs
                + ", specialization is " + spec + '\''
                + ", gpa is " + gpa
                + '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGpa() == o2.getGpa()) {
            return 0;
        }
        if (o1.getGpa() > o2.getGpa()) {
            return 1;
        }
        return -1;
    }
}
