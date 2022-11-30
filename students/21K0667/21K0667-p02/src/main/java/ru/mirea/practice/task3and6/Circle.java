package ru.mirea.practice.task3and6;

public class Circle extends Point {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle() {
        radius = 0;
        center = new Point(0, 0);
    }

    public double square() {
        return Math.pow(3.14, 2) * radius;
    }

    public double lenght() {
        return 2 * 3.14 * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCenter(double x, double y) {
        center.setX(x);
        center.setY(y);
    }

}
