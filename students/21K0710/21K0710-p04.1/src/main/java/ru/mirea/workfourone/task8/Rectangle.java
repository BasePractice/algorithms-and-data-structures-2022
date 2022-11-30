package ru.mirea.workfourone.task8;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        // constructor
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "Прямоугольник: цвет - " + this.getColor()
                + ", закрашен - " + this.isFilled()
                + ", ширина - " + this.width
                + ", длина - " + this.length;
    }
}
