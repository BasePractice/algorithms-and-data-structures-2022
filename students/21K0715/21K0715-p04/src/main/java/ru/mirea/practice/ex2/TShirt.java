package ru.mirea.practice.ex2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    TShirt() {
        size = Sizes.XXS;
        cost = 1500;
        color = Colors.ORANGE;
    }

    @Override
    public void dressMan() {
        System.out.println("size: " + size + " cost: " + cost + " color: " + color);
    }

    @Override
    public void dressWomen() {
        System.out.println("size: " + size + " cost: " + cost + " color: " + color);
    }
}
