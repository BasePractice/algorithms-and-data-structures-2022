package ru.mirea.practice.task2;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Man is used " + getColor() + " tie " + getSize() + " size, which costs" + getCost());
    }
}
