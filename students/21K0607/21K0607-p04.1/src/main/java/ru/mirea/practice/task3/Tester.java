package ru.mirea.practice.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Person firstHuman = new Person();
        Person secondHuman = new Person(24, "Олег");
        firstHuman.move();
        firstHuman.talk();
        secondHuman.talk();
        secondHuman.move();
        System.out.println(secondHuman.getAge());
        System.out.println(secondHuman.getFullName());
    }
}
