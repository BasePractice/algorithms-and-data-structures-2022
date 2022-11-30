package ru.mirea.practice.task2;

public abstract class Clothes implements WomenClothing, MenClothing {
    protected Size size;
    protected int cost;
    protected String colour;

    Clothes(Size size, int cost, String colour) {
        this.size = size;
        this.colour = colour;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return size + " " + cost + " " + colour + " " + size.getDescription();
    }

    public Size getSize() {
        return size;
    }
}
