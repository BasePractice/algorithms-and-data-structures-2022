package ru.mirea.practice.task2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman is dressed up in " + getColor() + " skirt with size equals " + getSize() + " which costed " + getCost());
    }
}
