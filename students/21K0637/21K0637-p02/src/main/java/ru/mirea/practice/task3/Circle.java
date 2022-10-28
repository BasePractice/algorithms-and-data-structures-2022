package ru.mirea.practice.task3;

public class Circle {
    private Point center;
    private final int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Center:" + center + "; radius: " + radius;
    }
}
