package ru.mirea.practice.MathRandom.Ex2;

public class Circle {
    Point centerPoint;
    double radius;

    public Circle(double x, double y, double radius) {
        this.centerPoint = new Point(x,y);
        this.radius = radius;
    }

    public Circle() {
        this.centerPoint = new Point(0,0);
        this.radius = Math.random() * 20;
    }

    public double getX() {
        return centerPoint.getX();
    }

    public void setX(double x) {
        centerPoint.setX(x);
    }

    public double getY() {
        return centerPoint.getY();
    }

    public void setY(double y) {
        centerPoint.setY(y);
    }

    public void setXY(double x, double y) {
        centerPoint.setXY(x,y);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + centerPoint.getX() +
                ", y=" + centerPoint.getY() +
                ", radius=" + radius +
                '}';
    }

    public double square() {
        return Math.PI * radius * radius;
    }

    public double length() {
        return Math.PI * radius * 2d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }
}
