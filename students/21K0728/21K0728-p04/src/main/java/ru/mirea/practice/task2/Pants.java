package ru.mirea.practice.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size s, int p, String c) {
        super(s, p, c);
    }

    @Override
    public String toString() {
        return "Pants: size is - " + getSize() + " color is - " + getColor() + " price is - " + getPrice();
    }
}
