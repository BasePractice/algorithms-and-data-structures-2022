package ru.mirea.practice.task1;

public abstract class Tester {
    public static void main(String[] args) {
        Shape circle = new Circle(357);
        System.out.println(circle + "\n");

        Shape rectangle = new Rectangle(2, 28);
        System.out.println(rectangle + "\n");

        Shape square = new Square(148);
        System.out.println(square);
    }
}