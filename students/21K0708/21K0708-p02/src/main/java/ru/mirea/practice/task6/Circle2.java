package ru.mirea.practice.task6;

import static java.lang.Math.PI;

public class Circle2 {
    private double x;
    private double y;
    private double radius;

    public Circle2(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getSquare() {
        return radius * radius * PI;
    }

    public double getLength() {
        return 2 * radius * PI;
    }

    public boolean isEquals(Circle2 other) {
        return this.radius == other.radius;
    }
}
