package ru.mirea.practice.task2;

public class Circle {
    private final Point center;
    private final double rad;

    public Circle(Point center, double radius) {
        this.center = center;
        this.rad = radius;
    }

    public double getRad() {
        return rad;
    }

    @Override
    public String toString() {
        return "Center: " + center + ", radius: " + rad;
    }
}
