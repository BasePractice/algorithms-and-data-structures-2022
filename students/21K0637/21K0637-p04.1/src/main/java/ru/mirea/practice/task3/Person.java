package ru.mirea.practice.task3;

public class Person {
    private final String fullname;
    private final int age;

    public Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public Person() {
        fullname = "";
        age = 0;
    }


    public String getFullname() {
        return fullname;
    }

    public int getAge() {
        return age;
    }

    public void move() {
        System.out.println(fullname + " идёт..");
    }

    public void talk() {
        System.out.println(fullname + " говорит..");
    }

}
