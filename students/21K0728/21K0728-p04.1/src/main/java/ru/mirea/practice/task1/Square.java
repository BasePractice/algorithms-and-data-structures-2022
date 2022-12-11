package ru.mirea.practice.task1;

public class Square extends Shape {
    private double side;

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    public Square(double side) {
        this.side = side;
    }
}
