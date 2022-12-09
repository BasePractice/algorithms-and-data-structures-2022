package ru.mirea.practice.task2;

abstract class Clothes {
    private final Size size;
    private final int cost;
    private final String color;

    public Clothes(Size size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public int getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}
