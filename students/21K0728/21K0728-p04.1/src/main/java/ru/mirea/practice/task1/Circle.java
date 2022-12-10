package ru.mirea.practice.task1;

public class Circle extends Shape {

    private double rad;

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * rad * rad;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * rad;
    }


    public Circle(double rad) {
        this.rad = rad;
    }
}