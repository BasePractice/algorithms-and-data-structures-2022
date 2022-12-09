package ru.mirea.practice.ex2;

public class Ball {
    private double x;
    private double y;

    public Ball(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public Ball() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getX() {
        return x;
    }

    public void setX(final double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(final double y) {
        this.y = y;
    }

    public void setXY(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public void move(final double xDisp, final double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "x=" + x
                + ", y=" + y
                + '}';
    }
}
