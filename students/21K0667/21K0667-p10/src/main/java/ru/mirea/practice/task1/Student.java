package ru.mirea.practice.task1;

public class Student {
    private String name;
    private String surname;
    private String spec;
    private int year;
    private String group;


    public Student(String name, String surname, String spec, int year, String group) {
        this.name = name;
        this.surname = surname;
        this.spec = spec;
        this.year = year;
        this.group = group;
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
}
