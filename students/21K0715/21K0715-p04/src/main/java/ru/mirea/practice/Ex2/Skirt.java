package ru.mirea.practice.Ex2;

public class Skirt  extends Clothes implements WomenClothing {
    Skirt() {
        size = Sizes.XS;
        cost = 750;
        color = Colors.RED;
    }
    @Override
    public void dressWomen() {
        System.out.println("size: " + size + " cost: " + cost + " color: " + color);
    }
}
