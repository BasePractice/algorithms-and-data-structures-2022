package ru.mirea.practice.subchapter.task1;

import java.util.Scanner;

public final class Test {
    private Test() {
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Circle c = new Circle(10, "blue", true);
        Rectangle r = new Rectangle(3.5, 6.2, "green", false);
        Square s = new Square(5, "black", true);
        System.out.println(c.getArea() + " " + c.getPerimeter() + " " + c.toString());
        System.out.println(r.getArea() + " " + r.getPerimeter() + " " + r.toString());
        System.out.println(s.getArea() + " " + s.getPerimeter() + " " + s.toString());
        MovableCircle mp = new MovableCircle(6, 0, 0, 5, 8);
        mp.moveDown();
        System.out.println(mp.toString());
        mp.moveLeft();
        System.out.println(mp.toString());
    }
}
