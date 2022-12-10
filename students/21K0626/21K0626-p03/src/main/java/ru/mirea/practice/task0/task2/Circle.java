package ru.mirea.practice.task0.task2;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {
    Point center = new Point();
    double len;
    double r;

    public Circle(Point center, double len, double r) {
        this.center = center;
        this.len = len;
        this.r = r;
    }

    public Circle() {
        //
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double pl(double r) {
        return pow(r, 2) * PI;

    }


    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", len=" + len +
                ", r=" + r +
                '}';
    }
}
