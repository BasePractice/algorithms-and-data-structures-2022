package ru.mirea.practice.task3;

public class Person {
    private final int age;
    private final String fullName;

    public Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    public Person() {
        age = 0;
        fullName = "Нет имени";
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public void move() {
        System.out.println(fullName + " Идёт ");
    }

    public void talk() {
        System.out.println(fullName + " Говорит ");
    }
}
