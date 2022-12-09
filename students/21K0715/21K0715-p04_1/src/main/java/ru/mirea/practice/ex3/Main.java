package ru.mirea.practice.ex3;

public final class Main {
    private Main() {

    }

    public static void main(final String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Alex Harsh", 28);
        System.out.println(p1);
        System.out.println(p2);

    }
}
