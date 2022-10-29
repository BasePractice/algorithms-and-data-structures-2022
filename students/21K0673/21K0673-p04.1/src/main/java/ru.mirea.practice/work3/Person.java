package ru.mirea.practice.work3;

public class Person {
    private String fullName;
    private int age;

    Person() {
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " говорит");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }

    public static void main(String[] args) {
        Person a = new Person();
        Person b = new Person("Сергей Семёнович Шульц", 35);
    }
}
