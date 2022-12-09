package ru.mirea.practice4.task2;

public class Clothes {
    private final Size size;
    private final int cost;
    private final String colour;

    public Clothes(Size size, int cost, String colour) {
        this.size = size;
        this.cost = cost;
        this.colour = colour;
    }

    public Size getSize() {
        return size;
    }

    public int getCost() {
        return cost;
    }

    public String getColour() {
        return colour;
    }
}
