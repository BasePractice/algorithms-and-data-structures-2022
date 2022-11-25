package ru.mirea.practice.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Nameable dog = new Dog("Jack", 7);
        System.out.println(dog.getName());
    }
}
