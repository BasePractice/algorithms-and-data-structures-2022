package ru.mirea.practice.work2;

public class Tie extends Clothes {
    InterfaceMenClothing menClothing;

    public Tie(EnumAtelier clothingSize, double cost, String colour) {
        this.clothingSize = clothingSize;
        this.colour = colour;
        this.cost = cost;
    }
}
