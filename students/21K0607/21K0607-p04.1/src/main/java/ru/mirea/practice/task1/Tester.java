package ru.mirea.practice.task1;

public abstract class Tester {
    public static void main(String[] args) {
        Shape shape1 = new Square(5);
        System.out.println("Тип фигуры: " + shape1.getType());
        System.out.println("Площадь фигуры: " + shape1.getArea());
        System.out.println("Периметр фигуры: " + shape1.getPerimeter());
        Shape shape2 = new Circle(10);
        System.out.println("Тип фигуры: " + shape2.getType());
        System.out.println("Площадь фигуры: " + shape2.getArea());
        System.out.println("Периметр фигуры: " + shape2.getPerimeter());
        Shape shape3 = new Rectangle(10, 6);
        System.out.println("Тип фигуры: " + shape3.getType());
        System.out.println("Площадь фигуры: " + shape3.getArea());
        System.out.println("Периметр фигуры: " + shape3.getPerimeter());
    }
}
