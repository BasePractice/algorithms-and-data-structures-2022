package ru.mirea.practice.Ex2;

public class Pants  extends Clothes implements MenClothing, WomenClothing {
    Pants() {
        size = Sizes.M;
        cost = 1000;
        color = Colors.BLUE;
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
