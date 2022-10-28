package ru.mirea.workthree.task2;

public class Circle {
    private final Point point;
    private double radius;
    private double length;

    public Circle(double x, double y, double radius) {
        this.point = new Point(x, y);
        this.radius = radius;
        this.length = 2 * Math.PI * this.radius;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setPoint(double x, double y) {
        this.point.setXY(x, y);
    }

    public double getPointX() {
        return point.getX();
    }

    public double getPointY() {
        return point.getY();
    }

    @Override
    public String toString() {
        return "Circle{" + "point=" + point + ", radius=" + radius + '}';
    }
}
