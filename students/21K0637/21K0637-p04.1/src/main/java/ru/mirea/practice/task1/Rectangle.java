package ru.mirea.practice.task1;

public class Rectangle extends Shape {
    private final double sideOne;
    private final double sideTwo;

    public Rectangle(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return sideOne * sideTwo;
    }

    @Override
    public double getPerimeter() {
        return 2 * (sideOne + sideTwo);
    }

    @Override
    public String toString() {
        return "{Type=" + getType() + "; sides={" + sideOne + "; " + sideTwo + "}; Area=" + getArea() + "; Perimeter=" + getPerimeter() + '}';
    }
}
