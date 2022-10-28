package ru.mirea.workfourone.task3;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        Person a = new Person();
        Person b = new Person("Alex", 34);
        a.move();
        b.talk();
    }
}
