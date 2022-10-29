package ru.mirea.practice.task6;

public class CircleTest {

    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle();
        circle2.setRadius(-10);
        System.out.println(circle1.equals(circle2));

        circle1.setRadius(5);
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.getLength());
        System.out.println(circle1.getS());
    }
}
