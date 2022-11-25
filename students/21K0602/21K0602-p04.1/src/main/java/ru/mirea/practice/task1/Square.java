package ru.mirea.practice.task1;

public class Square extends Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public String toString() {
        return "Square{" + "length=" + length + '}';
    }
}
