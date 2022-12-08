package ru.mirea.practice.Ex9;

public class Armchair extends Furniture {
    public Armchair(int cost) {
        this.cost = cost;
    }

    @Override
    public String getType() {
        return "Armchair";
    }
}
