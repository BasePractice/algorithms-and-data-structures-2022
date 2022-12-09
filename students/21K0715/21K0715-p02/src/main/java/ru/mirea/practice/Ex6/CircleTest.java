package ru.mirea.practice.Ex6;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(12,4,56.3);

        System.out.println("x: " + circle.getX());
        System.out.println("y: " + circle.getY());
        System.out.println("radius: " + circle.getRadius());
        System.out.println("square: " + circle.square());
        System.out.println("length: " + circle.length());

        circle.setX(2);
        System.out.println("After circle.setX(2) x: " + circle.getX());
        circle.setY(8);
        System.out.println("After circle.setY(8) x: " + circle.getY());
        circle.setXY(4,9);
        System.out.println("After circle.setXY(4,9) x: " + circle.getX() + " y: " + circle.getY());
        circle.setRadius(23.54);
        System.out.println("After circle.setRadius(23.54) radius: " + circle.getRadius());

        Circle circle1 = new Circle();
        System.out.println("circle == circle1: " + circle.equals(circle1));
        circle1.setRadius(circle.getRadius());
        System.out.println("circle == circle1: " + circle.equals(circle1));
    }
}
