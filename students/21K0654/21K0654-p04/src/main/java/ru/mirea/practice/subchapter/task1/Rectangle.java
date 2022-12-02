package ru.mirea.practice.subchapter.task1;

public class Rectangle extends Shape {
    protected double a;
    protected double b;

    public Rectangle() {
        super();
        super.setShape("rectangle");
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a, double b, String color, boolean f) {
        super(color, f);
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return a * b;
    }

    public double getPerimeter() {
        return 2 * (a + b);
    }

    public String toString() {
        return "A: " + a + " B: " + b + super.toString();
    }
}
