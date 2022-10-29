package ru.mirea.practice.work2;

public class TShirt extends Clothes {
    InterfaceMenClothing menClothing;
    InterfaceWomenClothing womenClothing;

    public TShirt(EnumAtelier clothingSize, double cost, String colour) {
        this.clothingSize = clothingSize;
        this.colour = colour;
        this.cost = cost;
    }
}
