package ru.mirea.practice.work6;

public class CircleTest {
    public static void main(String[] args) {
        Point c = new Point(5, 8);
        Circle a = new Circle(c, 8);
        a.getArea();
        a.getLength();
        System.out.println(a.getCenter());
        Point d = new Point(1, 99);
        Circle b = new Circle(d, 2);
        a.getComparison(a, b);
        System.out.println(a);
        System.out.println(a.getR());
        System.out.println(c.getX());
        System.out.println(c.getY());
        c.setX(4);
        c.setY(7);
        c.setXY(2, 7);
        a.setR(23);
        a.setCenter(d);
        a.setXY(c, 23);
    }
}
