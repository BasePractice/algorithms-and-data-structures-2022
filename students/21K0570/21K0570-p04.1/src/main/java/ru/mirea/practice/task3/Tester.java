package ru.mirea.practice.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Person first = new Person();
        System.out.println(first);
        first.move();
        first.talk();

        Person second = new Person("Din", 27);
        System.out.println(second);
        second.move();
        second.talk();
    }
}
