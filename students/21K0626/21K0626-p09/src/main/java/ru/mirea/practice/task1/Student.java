package ru.mirea.practice.task1;

public class Student {
    public int age;
    public String name;
    public String surname;

    public Student(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
