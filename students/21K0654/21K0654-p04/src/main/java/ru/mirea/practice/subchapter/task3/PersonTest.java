package ru.mirea.practice.subchapter.task3;

public final class PersonTest {
    private PersonTest() {
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Денис", 10);
        p1.move();
        p1.talk();
        p2.move();
        p2.talk();
    }
}
