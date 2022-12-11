package ru.mirea.practice.task2;

public abstract class Clothes {
    Sizes size = Sizes.M;
    int cost = 1000;
    String colour = "white";

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "size: " + size + ", cost: " + cost + ", colour: " + colour;
    }
}
