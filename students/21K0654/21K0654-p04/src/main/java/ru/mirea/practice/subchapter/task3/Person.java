package ru.mirea.practice.subchapter.task3;

public class Person {
    private String fullName;
    private int age;

    Person() {
        this.fullName = "Неизвестный";
        this.age = 0;
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println("Такой-то " + this.fullName + " пошел");
    }

    public void talk() {
        System.out.println("Этот " + this.fullName + " говорит");
    }
}
