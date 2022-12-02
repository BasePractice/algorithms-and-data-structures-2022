package ru.mirea.practice.subchapter.task1;

public class Square extends Rectangle {
    protected double side;

    public Square() {
        super();
        super.setShape("rectangle");
    }

    public Square(double a) {
        super();
        this.side = a;
    }

    public Square(double s, String color, boolean f) {
        super(0, 0, color, f);
        this.side = s;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double s) {
        this.side = s;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 2 * (side + side);
    }

    @Override
    public String toString() {
        return "Side: " + side + " Colour: " + this.getColor() + " filled? " + this.isFilled();
    }

}
