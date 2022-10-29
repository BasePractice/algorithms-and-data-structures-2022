package ru.mirea.practice.task2;

public class Circle {
    private Point center;

    private double radius;

    public Circle(double x, double y) {
        this.center = new Point(x, y);
    }

    public Circle(double x, double y, double r) {
        this.center = new Point(x, y);
        this.radius = r;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle() {
        this.center = new Point();
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return String.valueOf(this.radius);
    }
}

