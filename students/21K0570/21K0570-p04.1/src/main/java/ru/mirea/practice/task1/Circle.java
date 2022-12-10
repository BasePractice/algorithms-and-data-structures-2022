package ru.mirea.practice.task1;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String getType() {
        return "Circle.";
    }

    @Override
    public String toString() {
        return "Radius = " + radius + ", area = " + (3.14 * radius * radius) +
        ", perimeter = " + (2 * 3.14 * radius) + ".";
    }

}
