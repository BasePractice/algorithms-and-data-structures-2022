package ru.mirea.practice.task1;

public class Rectangle extends Shape {

    private double aSide;
    private double bSide;

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return aSide * bSide;
    }

    @Override
    public double getPerimeter() {
        return (aSide + bSide) * 2;
    }

    public Rectangle(double aSide, double bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }
}
