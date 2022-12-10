package ru.mirea.practice.task2;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size s, int p, String c) {
        super(s, p, c);
    }

    @Override
    public String toString() {
        return "Tie: size is - " + getSize() + " color is - " + getColor() + " price is - " + getPrice();
    }
}
