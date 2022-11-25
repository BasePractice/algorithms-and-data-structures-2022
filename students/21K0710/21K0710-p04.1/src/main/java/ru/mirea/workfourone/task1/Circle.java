package ru.mirea.workfourone.task1;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "circle";
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "task1.Square{" + "radius=" + radius + ", type: " + getType() + ", perimeter: " + getPerimeter() + ", area: " + getArea() + '}';
    }
}
