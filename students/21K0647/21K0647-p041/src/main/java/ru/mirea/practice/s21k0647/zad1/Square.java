package ru.mirea.practice.s21k0647.zad1;

public class Square extends Shape {

    float a;

    Square(String type, float a) {
        super(type);
        this.a = a;
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public String getAria() {
        return String.valueOf(a * a);
    }

    @Override
    public String getPerimeter() {
        return String.valueOf(4 * a);
    }

    @Override
    public String toString() {
        return getType() + " a = " + this.a + " Aria: " + getAria() + " Perimeter: " + getPerimeter();
    }


}
