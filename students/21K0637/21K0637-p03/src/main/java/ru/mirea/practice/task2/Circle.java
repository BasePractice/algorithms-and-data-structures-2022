package ru.mirea.practice.task2;

public class Circle {
    private final Point center;
    private final int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(double x, double y, int radius) {
        this.radius = radius;
        this.center = new Point(x, y);
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Center:" + center + "; radius: " + radius;
    }
}
