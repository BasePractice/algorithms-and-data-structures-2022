package ru.mirea.practice.ex9;

public abstract class Furniture {
    protected int cost;

    public int getCost() {
        return cost;
    }

    public abstract String getType();
}
