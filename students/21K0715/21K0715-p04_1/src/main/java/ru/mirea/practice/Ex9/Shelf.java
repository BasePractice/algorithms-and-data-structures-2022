package ru.mirea.practice.Ex9;

public class Shelf extends Furniture {
    public Shelf(int cost) {
        this.cost = cost;
    }

    @Override
    public String getType() {
        return "Shelf";
    }
}
