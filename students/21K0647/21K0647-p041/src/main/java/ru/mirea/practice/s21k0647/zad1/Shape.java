package ru.mirea.practice.s21k0647.zad1;

public class Shape {
    String type;

    Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return "Type figure";
    }

    public String getAria() {
        return " ";
    }

    public String getPerimeter() {
        return " ";
    }

    @Override
    public String toString() {
        return getType() + getAria() + getPerimeter();
    }
}
