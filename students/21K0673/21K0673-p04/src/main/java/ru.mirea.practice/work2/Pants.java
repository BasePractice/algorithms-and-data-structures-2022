package ru.mirea.practice.work2;

public class Pants extends Clothes {
    InterfaceMenClothing menClothing;
    InterfaceWomenClothing womenClothing;

    public Pants(EnumAtelier clothingSize, double cost, String colour) {
        super(clothingSize, cost, colour);
    }
}
