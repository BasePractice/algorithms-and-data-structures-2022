package ru.mirea.practice.task1;

public abstract class Tester {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        System.out.println(circle + "\n");

        Shape rectangle = new Rectangle(5, 10);
        System.out.println(rectangle + "\n");

        Shape square = new Square(5);
        System.out.println(square);
    }
}
