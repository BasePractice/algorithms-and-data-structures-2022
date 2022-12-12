package ru.mirea.practice.n2;

public class Ball {

    private double x;
    private double y;

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
        x = 0;
        y = 0;
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

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double dispX, double dispY) {
        this.x = x + dispX;
        this.y = y + dispY;
    }

    @Override
    public String toString() {
        return "x = " + x
                + ", y = " + y;
    }
}
