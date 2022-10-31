package ru.mirea.practice.task2;

public abstract class Clothes {
    private final Sizes Size;
    private final String Color;
    private final int Cost;

    public Clothes(Sizes size, String color, int cost) {
        Size = size;
        Color = color;
        Cost = cost;
    }

    public Sizes getSize() {
        return Size;
    }

    public String getColor() {
        return Color;
    }

    public int getCost() {
        return Cost;
    }
}
