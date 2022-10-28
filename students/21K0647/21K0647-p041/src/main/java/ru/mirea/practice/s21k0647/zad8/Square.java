package ru.mirea.practice.s21k0647.zad8;


public class Square extends Rectangle {

    protected double side;

    Square() {
        //pus
    }

    Square(double side) {
        this.side = side;
    }

    Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
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
        String s = "Полый";
        if (filled) {
            s = "Закрашенный";
        }
        return "Квадрат со сторонами " + side + "\nЦвет:" + color + " " + s + "\nПлощадь: " + this.getArea() + "\nПериметр:" + this.getPerimeter();
    }


}
