package ru.mirea.practice.subchapter.task1;

public class Shape {
    private String shape;
    private String color;
    private boolean isFilled;
    public Shape(){};

    public String getColor() {
        return color;
    }

    public Shape(String color, boolean f){
        this.color = color;
        this.isFilled = f;
    };

    public boolean isFilled() {
        return isFilled;
    }

    public String getType() {
        return this.shape;
    }
}
