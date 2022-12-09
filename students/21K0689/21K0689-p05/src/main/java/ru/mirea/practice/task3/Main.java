package ru.mirea.practice.task3;

public abstract class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Fill Colinz", 50);
        Person person2 = new Person();
        System.out.println(person1.move(person1));
        System.out.println(person1.talk(person1));
        System.out.println(person2);
    }
}
