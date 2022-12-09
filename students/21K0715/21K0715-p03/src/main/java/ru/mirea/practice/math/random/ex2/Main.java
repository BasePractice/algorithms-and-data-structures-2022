package ru.mirea.practice.math.random.ex2;

public final class Main {
    private Main() {

    }

    public static void main(final String[] args) {
        Tester tester = new Tester(5);
        for (int i = 0; i < 5; i++) {
            tester.insert(i, new Circle());
        }
        System.out.println(tester);
        tester.sort();
        System.out.println(tester);
    }
}
