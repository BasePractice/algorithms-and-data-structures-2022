package ru.mirea.practice.task8;

public class Square extends Rectangle {

    private double side;

    public Square(double side) {
        super();
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super();
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "{Side=" + side
            + "; Area=" + getArea()
            + "; Perimeter="
            + getPerimeter()
            + '}';
    }
}
