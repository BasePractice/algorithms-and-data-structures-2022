package ru.mirea.practice.Ex9;

public class Sofa extends Furniture {
    public Sofa(int cost) {
        this.cost = cost;
    }

    @Override
    public String getType() {
        return "Sofa";
    }
}