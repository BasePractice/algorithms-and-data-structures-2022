package ru.mirea.practice.task2;

abstract class Clothes {
    private Size size;
    private double cost;
    private String color;

    public Clothes(Size size, String color) {
        this.size = size;
        this.color = color;
    }

    public Clothes(Size size, String color, double cost) {
        this(size, color);
        this.cost = cost;
    }

    public Size getSize() {
        return size;
    }

    public double getCost() { return cost; }

    public String getColor() { return color; }

    public void dressWomen() {
        System.out.print("");
    }

    public void dressMan() {
        System.out.print("");
    }
}
