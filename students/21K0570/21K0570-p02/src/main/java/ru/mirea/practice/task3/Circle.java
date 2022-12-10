package ru.mirea.practice.task3;

public class Circle {
    private Point center;
    private double rad;

    public Circle() {
        center = new Point();
        rad = 0;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    @Override
    public String toString() {
        return "Center: " + center + ", radius: " + rad;
    }
}
