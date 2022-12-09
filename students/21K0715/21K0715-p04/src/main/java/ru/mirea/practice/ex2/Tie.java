package ru.mirea.practice.ex2;

public class Tie extends Clothes implements MenClothing {
    Tie() {
        size = Sizes.L;
        cost = 500;
        color = Colors.VIOLET;
    }
    @Override
    public void dressMan() {
        System.out.println("size: " + size + " cost: " + cost + " color: " + color);
    }
}
