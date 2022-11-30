package ru.mirea.practice.work2;

public class Clothes {
    protected EnumAtelier clothingSize;
    protected double cost;
    protected String colour;

    public Clothes(EnumAtelier clothingSize, double cost, String colour) {
        this.clothingSize = clothingSize;
        this.colour = colour;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Clothing{" + "clothing size=" + clothingSize + ", cost=" + cost + ", colour=" + colour + '}';
    }
}
