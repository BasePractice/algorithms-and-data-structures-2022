package ru.mirea.practice.task3and6;

public class Point {
    private double x;
    private double y;

    public Point(double px, double py) {
        x = px;
        y = py;
    }

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point: " + "x= " + x + ", y= " + y;
    }

}
