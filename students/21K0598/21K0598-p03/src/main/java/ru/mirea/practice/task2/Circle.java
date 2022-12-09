package ru.mirea.practice.task2;

public class Circle {
    private Point point = new Point(0.0, 0.0);
    private double rad;

    public Circle(Point point, double rad) {
        this.point = point;
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    @Override
    public String toString() {
        return "Circle{"
                + "point=" + point
                + ", rad=" + rad
                + '}';
    }
}
