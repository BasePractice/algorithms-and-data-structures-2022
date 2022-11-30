package ru.mirea.practice.s21k0647.zad1;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        Shape shape1 = new Circle("Circle", 13);
        Shape shape2 = new Rectangle("Rectangle", 10, 5);
        System.out.println(shape1);
        System.out.println(shape2);
    }

}
