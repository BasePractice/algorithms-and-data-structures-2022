package ru.mirea.practice.ex9;

abstract public class Furniture {
    protected int cost;
    public int getCost() {
        return cost;
    }

    abstract public String getType();
}
