package ru.mirea.worknine.task4;

public class Student {
    private String name;
    public int idnumber;
    public int gpa;


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

    Student(String name, int idnumber, int gpa) {
        this.idnumber = idnumber;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "task1.Student{" + "name='" + name + '\'' + ", iDNumber=" + idnumber + ", GPA=" + gpa + '}';
    }

}