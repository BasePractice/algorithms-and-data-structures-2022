package ru.mirea.practice.Ex_1;

public class Square extends Rectangle {
    private double side;

    Square(){}
    Square(double side){
        this.side=side;
    }
    Square(double side, String color, boolean filled){
        this.side=side;
        this.color=color;
        this.filled=filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
    @Override
    public void setLength(double length) {
        super.setLength(length);
    }
    public String toString() {
        return "Rectangle:{Side = "+side+", Area = "+(side*side)+", Perimeter = "+(side*4)+"}";
    }
}
