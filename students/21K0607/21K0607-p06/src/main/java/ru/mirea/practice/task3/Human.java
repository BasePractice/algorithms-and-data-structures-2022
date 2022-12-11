package ru.mirea.practice.task3;

public class Human implements Nameable {
    private int age;
    private String name;

    public Human(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }
}
