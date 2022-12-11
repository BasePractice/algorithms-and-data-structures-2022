package ru.mirea.practice.task3;

public class Circle {
    private class To4ka {
        public double x;
        public double y;

        public To4ka() {
            x = 0.0;
            y = 0.0;
        }

        public To4ka(double x, double y) {
            this.x = x;
            this.y = y;
        }

    }

    private double rad;

    private To4ka point;

    public Circle(double x, double y, double rad) {
        point = new To4ka(x, y);
        this.rad = rad;
    }

    public void setRad(double rad) {
        this.rad = Math.abs(rad);
        point = new To4ka();
    }

    public double getRad() {
        return rad;
    }

    public double getX() {
        return point.x;
    }

    public double getY() {
        return point.x;
    }

    public void setX(double x) {
        point.x = x;
    }

    public void setY(double y) {
        point.y = y;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + rad + ", x =" + point.x + " y = " + point.y + '}';
    }
}
