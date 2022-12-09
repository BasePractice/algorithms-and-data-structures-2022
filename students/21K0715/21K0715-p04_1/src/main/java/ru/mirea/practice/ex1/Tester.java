package ru.mirea.practice.ex1;

public final class Tester {
    private Tester() {

    }

    public static void main(final String[] args) {
        Shape circle = new Circle(3);
        Shape rect = new Rectangle(1,2);
        Shape square = new Square(2);
        System.out.println(circle);
        System.out.println(circle.getArea() + " " + circle.getPerimeter());
        System.out.println(rect);
        System.out.println(rect.getArea() + " " + rect.getPerimeter());
        System.out.println(square);
        System.out.println(square.getArea() + " " + square.getPerimeter());
    }
}
