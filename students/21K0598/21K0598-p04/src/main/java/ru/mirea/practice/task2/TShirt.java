package ru.mirea.practice.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Tshirt on man dressed with size " + getSize()
                            + " Color " + getColor()
                            + " Cost " + getCost());
    }

    @Override
    public void dressWoman() {
        System.out.println("Tshirt on woman dressed with size " + getSize()
                            + " Color " + getColor()
                            + " Cost " + getCost());
    }
}
