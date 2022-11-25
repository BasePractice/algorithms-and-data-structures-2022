package ru.mirea.practice.task3;

public class Dog implements Nameable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
