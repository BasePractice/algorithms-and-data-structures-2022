package ru.mirea.practice.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size s, int p, String c) {
        super(s, p, c);
    }

    @Override
    public String toString() {
        return "TShirt: size is - " + getSize() + " color is - " + getColor() + " price is - " + getPrice();
    }

}