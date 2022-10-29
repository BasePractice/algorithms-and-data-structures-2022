package ru.mirea.practice.work2;

public class Skirt extends Clothes {
    InterfaceWomenClothing womenClothing;

    public Skirt(EnumAtelier clothingSize, double cost, String colour) {
        this.clothingSize = clothingSize;
        this.colour = colour;
        this.cost = cost;
    }
}
