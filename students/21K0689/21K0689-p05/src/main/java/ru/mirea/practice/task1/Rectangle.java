package ru.mirea.practice.task1;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    String getType() {
        return "This is rectangle";
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return super.toString() + ".";
    }
}
