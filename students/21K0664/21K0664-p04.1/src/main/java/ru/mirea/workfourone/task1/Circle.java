package ru.mirea.workfourone.task1;

public class Circle extends Shape {
    private double r;

    Circle() {
    }

    Circle(double r) {
        this.r = r;
    }

    public String getType() {
        return "Circle";
    }

    public double getArea() {
        return 3.14 * r * r;
    }

    public double getPerimeter() {
        return 2 * 3.14 * r;
    }

    public String toString() {
        return "Circle:{Radius = " + r + ", Area = " + (3.14 * r * r) + ", Perimeter = " + (2 * 3.14 * r) + "}";
    }
}
