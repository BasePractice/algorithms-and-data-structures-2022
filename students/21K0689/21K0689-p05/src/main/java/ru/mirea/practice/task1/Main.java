package ru.mirea.practice.task1;

public abstract class Main {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 5);
        System.out.println(rc);
        Circle circle = new Circle(10);
        System.out.println(circle);
        Square square = new Square(4);
        System.out.println(square);
    }
}
