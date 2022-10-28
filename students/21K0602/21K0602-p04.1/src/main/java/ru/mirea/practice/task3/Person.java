package ru.mirea.practice.task3;

public class Person {
    private final String fullName;
    private final int age;

    public Person() {
        fullName = "Имя не задано";
        age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void move() {
        System.out.println(fullName + " ходит");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }

}
