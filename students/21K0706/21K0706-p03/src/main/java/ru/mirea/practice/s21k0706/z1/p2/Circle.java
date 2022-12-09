package ru.mirea.practice.s21k0706.z1.p2;

public class Circle extends Point {
    double r;

    public Circle() {
        r = 0;
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + x + "\ty: " + y + "\tr: " + r;
    }

}
