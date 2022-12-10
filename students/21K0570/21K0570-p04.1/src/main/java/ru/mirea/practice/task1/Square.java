package ru.mirea.practice.task1;

public class Square extends Shape{
    private double a;

    public Square(double a, String color) {
        super(color);
        this.a = a;
    }
    @Override
    public double getArea() {
        return a*a;
    }

    @Override
    public double getPerimeter() {
        return a*4;
    }

    @Override
    public String getType() {
        return "Square.";
    }

    @Override
    public String toString() {
        return "Area:" + a*a + ", perimeter:" + a*4;
    }
}
