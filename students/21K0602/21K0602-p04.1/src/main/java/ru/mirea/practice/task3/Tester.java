package ru.mirea.practice.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        Person secondPerson = new Person("Денис Давыдов", 19);
        firstPerson.move();
        firstPerson.talk();
        secondPerson.move();
        secondPerson.talk();
        secondPerson.getAge();
        secondPerson.getFullName();
    }
}
