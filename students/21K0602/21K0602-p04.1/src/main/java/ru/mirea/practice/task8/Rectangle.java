package ru.mirea.practice.task8;

public class Rectangle extends Shape {
    protected double width;
    protected double length;


    public Rectangle() {
        this.width = 0;
        this.length = 0;
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

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = Math.abs(width);
        }
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            this.length = Math.abs(length);
        }
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + ", color='" + color + '\'' + ", filled="
                + filled + '}';
    }
}
