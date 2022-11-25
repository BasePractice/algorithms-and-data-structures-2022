package ru.mirea.practice.ex1;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, boolean filled, double side) {
        super(color, filled);
        this.length = side;
        this.width = side;
    }

    Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean isFilled() {
        return this.filled;
    }

    @Override
    public void setFilled(boolean filled) {
        this.filled = filled;
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
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public String toString() {
        return "Rectangle:{Side length = " + length + "Side b = " + width + ", Area = " + (length * width)
                + ", Perimeter = " + (2 * length + 2 * width) + "}";
    }
}
