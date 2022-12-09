package ru.mirea.practice.ex9;

public class Shelf extends Furniture {
    public Shelf(int cost) {
        this.cost = cost;
    }

    @Override
    public String getType() {
        return "Shelf";
    }
}
