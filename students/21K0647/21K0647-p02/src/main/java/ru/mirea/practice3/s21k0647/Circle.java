package ru.mirea.practice3.s21k0647;

public class Circle extends Point {

    Point tT;
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

}
