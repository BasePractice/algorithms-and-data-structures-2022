package ru.mirea.workfourone.task1;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {
        Shape a = new Square(13.2);
        Shape b = new Rectangle(2.1, 6.3);
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
