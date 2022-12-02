package ru.mirea.practice.task6;

import java.lang.Math;

public class Circle {
    double rad = 0.0;

    public Circle(double rad) {
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public double diam() {
        return this.rad * 2;
    }

    public double perimeter() {
        return 2 * Math.PI * this.rad;
    }

    public double circleSquare() {
        return Math.PI * this.rad * this.rad;
    }

    @Override
    public String toString() {
        return "Circle{"
                + "rad=" + rad
                + '}';
    }
}
