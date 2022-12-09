package ru.mirea.practice.task1;

public class Student implements Comparable<Student>{

    private String name;
    private int idNumber;

    public Student(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public int compareTo(Student o) {
        return idNumber - o.idNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ",  idNumber=" + idNumber + '}';
    }
}
