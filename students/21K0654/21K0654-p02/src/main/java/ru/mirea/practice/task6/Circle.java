package ru.mirea.practice.task6;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double square() {
        return Math.PI * Math.pow(radius,2.0);
    }

    public double length() {
        return 2 * radius * Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int toCompare(Circle a) {
        return (int)(this.radius - a.getRadius());
    }

    public double getRadius() {
        return radius;
    }
}
