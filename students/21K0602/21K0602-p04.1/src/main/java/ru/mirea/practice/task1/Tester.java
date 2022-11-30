package ru.mirea.practice.task1;

public abstract class Tester {
    public static void main(String[] args) {
        Shape shape1 = new Circle(20);
        System.out.println("execute methods by using parent reference");
        System.out.println("Type = " + shape1.getType());
        System.out.println("Area = " + shape1.getArea());
        System.out.println("Perimeter = " + shape1.getPerimeter());
        System.out.println(shape1.toString());
        Shape shape2 = new Rectangle(15, 20);
        System.out.println("Type = " + shape2.getType());
        System.out.println("Area = " + shape2.getArea());
        System.out.println("Perimeter = " + shape2.getPerimeter());
        System.out.println(shape1.toString());
        Shape shape3 = new Square(15);
        System.out.println("Type = " + shape3.getType());
        System.out.println("Area = " + shape3.getArea());
        System.out.println("Perimeter = " + shape3.getPerimeter());
        System.out.println(shape3.toString());

    }
}
