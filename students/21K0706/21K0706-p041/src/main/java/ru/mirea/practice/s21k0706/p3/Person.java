package ru.mirea.practice.s21k0706.p3;

public class Person {
    String fullName;
    int age;

    Person() {
        //n
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(this.fullName + " говорит");

    }

    public void talk() {
        System.out.println(this.fullName + " говорит");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.move();
        Person person2 = new Person("Ivan Petrov", 20);
        person2.move();

    }
}
