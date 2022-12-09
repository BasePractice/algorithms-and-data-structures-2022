package ru.mirea.practice.ex9;

public class Armchair extends Furniture {
    public Armchair(int cost) {
        this.cost = cost;
    }

    @Override
    public String getType() {
        return "Armchair";
    }
}
