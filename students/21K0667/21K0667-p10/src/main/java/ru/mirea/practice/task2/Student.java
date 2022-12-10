package ru.mirea.practice.task2;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String name;
    private String spec;
    private int year;
    private String group;
    private double gpa;

    public Student(double gpa) {
        this.gpa = gpa;
    }

    public Student(String name, String spec, int year, String group, double gpa) {
        this.name = name;
        this.spec = spec;
        this.year = year;
        this.group = group;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public int compare(Student one, Student two) {
        if (one.getGpa() == two.getGpa()) {
            return 0;
        }
        if (one.getGpa() > two.getGpa()) {
            return 1;
        }
        return -1;
    }

    public static void print(Student[] arr) {
        for (Student student : arr) {
            System.out.print(student + "\n");
        }
    }
}
