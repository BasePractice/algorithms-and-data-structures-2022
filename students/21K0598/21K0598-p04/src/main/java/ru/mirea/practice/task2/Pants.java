package ru.mirea.practice.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Pants are dressed on man with size " + getSize() + " color " + getColor() + " cost " + getCost());
    }

    @Override
    public void dressWoman() {
        System.out.println("Pants are dressed on woman with size " + getSize() + " color " + getColor() + " cost " + getCost());
    }
}
