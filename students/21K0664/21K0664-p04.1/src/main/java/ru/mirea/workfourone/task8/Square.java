package ru.mirea.workfourone.task8;


public class Square extends Shape {
    private double side;


    Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public String toString() {
        return "Rectangle:{Side = " + side + ", Area = " + (side * side) + ", Perimeter = " + (side * 4) + "}";
    }
}