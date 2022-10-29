package ru.mirea.practice.s21k0647.zadmathrandom.punkt2;

public class Circle extends Point {
    Point tT;
    double r;

    public Circle() {
        r = 0;
    }

    public Circle(double r) {
        this.r = r;
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

    public String toString() {
        return "x: " + x + "\ty: " + y + "\tr: " + r;
    }
}
