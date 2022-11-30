package ru.mirea.practice.s21k0647.zad8;


public abstract class Shape {
    protected String color;
    protected boolean filled;

    Shape() {
        //pus
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setString(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        String s = "Полый";
        if (filled) {
            s = "Закрашенная";
        }
        return "Фигура не определена \nЦвет:" + color + " " + s;
    }



}
