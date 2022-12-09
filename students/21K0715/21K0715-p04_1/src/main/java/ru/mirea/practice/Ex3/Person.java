package ru.mirea.practice.Ex3;

public class Person {
    String fullName;
    int age;

    Person() {
        this.fullName = "Some Full Name";
        this.age = 0;
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " is moving");
    }

    public void talk() {
        System.out.println(fullName + " is talking");
    }


}
