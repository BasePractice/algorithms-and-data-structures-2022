package ru.mirea.workfourone.task1;

public class Rectangle extends Shape {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getType() {
        return "rectangle";
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "task1.Rectangle{" + ", a=" + a + ", b=" + b + ", type: " + getType() + ", perimeter: " + getPerimeter()
                + ", area: " + getArea() + '}';
    }
}
