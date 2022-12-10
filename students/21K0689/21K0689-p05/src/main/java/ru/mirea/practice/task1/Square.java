package ru.mirea.practice.task1;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    String getType() {
        return "This is square";
    }

    @Override
    double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return super.toString() + ".";
    }
}
