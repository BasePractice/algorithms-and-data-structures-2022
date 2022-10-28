package ru.mirea.practice.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", 19);
        Person person2 = new Person();

        person2.talk();
        person1.talk();

        person1.move();
        System.out.println(person1);
    }
}
