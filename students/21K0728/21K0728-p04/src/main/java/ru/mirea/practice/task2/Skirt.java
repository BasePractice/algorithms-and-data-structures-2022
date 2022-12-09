package ru.mirea.practice.task2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size s, int p, String c) {
        super(s, p, c);
    }

    @Override
    public String toString() {
        return "Skirt: size is - " + getSize() + " color is - " + getColor() + " price is - " + getPrice();
    }
}
