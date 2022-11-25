package ru.mirea.practice.work3;

public class Person {
    private String fullName;
    private int age;

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void move() {
        System.out.println(fullName + " говорит");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }
}
