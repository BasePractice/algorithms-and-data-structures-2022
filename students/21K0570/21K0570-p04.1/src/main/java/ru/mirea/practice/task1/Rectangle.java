package ru.mirea.practice.task1;

public class Rectangle extends Shape {
    private double a;
    private double b;
    private double c;
    double p = (a+b+c)/2;

    public Rectangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String getType() {
        return "Rectangle.";
    }

    @Override
    public String toString() {
        return "Area:" + Math.sqrt(p*(p-a)*(p-b)*(p-c)) + ", perimeter:" + p*2;
    }
}
