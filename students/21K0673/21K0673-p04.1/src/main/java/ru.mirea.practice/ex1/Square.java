package ru.mirea.practice.ex1;

public class Square extends Rectangle {
    private double side;

    Square(double side, String color, boolean filled) {
        super(color, filled, side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        setWidth(width);
    }

    @Override
    public void setLength(double length) {
        setLength(length);
    }

    @Override
    public String toString() {
        return "Rectangle:{Side = " + side + ", Area = " + (side * side) + ", Perimeter = " + (side * 4) + "}";
    }
}
