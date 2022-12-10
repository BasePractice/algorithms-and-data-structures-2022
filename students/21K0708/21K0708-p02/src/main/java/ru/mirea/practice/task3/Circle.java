package ru.mirea.practice.task3;

import java.text.DecimalFormat;

public class Circle {
    private Point center = new Point(0.0, 0.0);
    private double x = 0.0;
    private double y = 0.0;
    private double radius = 0.0;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
        x = center.getX();
        y = center.getY();
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        center.setX(x);
        center.setY(y);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        DecimalFormat dF = new DecimalFormat("#.###");
        return "\n" + center.toString() + " radius = " + dF.format(radius);
    }
}
