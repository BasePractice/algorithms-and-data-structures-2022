package ru.mirea.worktwo.task3;

public class Circle {
    private Point point;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.point = new Point(x, y);
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
