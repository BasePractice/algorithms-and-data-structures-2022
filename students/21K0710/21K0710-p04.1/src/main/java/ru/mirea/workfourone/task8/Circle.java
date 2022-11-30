package ru.mirea.workfourone.task8;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        // constructor
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "Круг: цвет - " + this.getColor()
                + ", закрашен - " + this.isFilled()
                + ", радиус - " + this.radius;
    }
}
