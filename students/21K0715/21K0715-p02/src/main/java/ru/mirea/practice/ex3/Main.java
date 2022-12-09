package ru.mirea.practice.ex3;

public final class Main {
    private Main() {

    }

    public static void main(final String[] args) {
        Tester tester = new Tester(5);
        tester.insert(3, new Circle());
        System.out.println(tester);
    }
}
