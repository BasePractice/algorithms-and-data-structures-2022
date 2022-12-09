package ru.mirea.practice.task3;

public class Circle {
    Point point;
    double r;

    public Circle(double x, double y, double r) {
        this.point = new Point(x, y);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(double x, double y) {
        this.point.setX(x);
        this.point.setY(y);
    }

    @Override
    public String toString() {
        return "Circle{"
                +
                "point = "
                +
                point
                +
                ", radius = "
                +
                r
                +
                '}';
    }
}
