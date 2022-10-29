package ru.mirea.practice.work2;

public class Ball {
    private double x;
    private double y;

    Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xdisp, double ydisp) {
        x += xdisp;
        y += ydisp;
    }

    public String toString() {
        return "{" + "X: " + x + ", Y: " + y + "}";
    }
}
