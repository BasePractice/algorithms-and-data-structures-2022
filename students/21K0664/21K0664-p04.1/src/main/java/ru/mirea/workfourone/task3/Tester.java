package ru.mirea.workfourone.task3;

abstract class Tester {
    public static void main(String[] args) {
        Person a = new Person("Ivan", 25);
        a.move();
        a.talk();
        System.out.println(a);
    }
}
