package ru.mirea.practice.s21K0688.task3and6;

import java.lang.Math;

public class Circle {
    private Point centre = new Point();
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        centre.setX(x);
        centre.setY(y);
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * getRadius() * getRadius();
    }

    public double length() {
        return 2 * Math.PI * getRadius();
    }

    public static void comparison(Circle first, Circle second) {
        if (first.area() > second.area()) {
            System.out.print("First circle > Second circle");
        }
        if (first.area() < second.area()) {
            System.out.print("Second circle > First circle");
        }
    }
}
