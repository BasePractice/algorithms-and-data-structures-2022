package ru.mirea.practice.task9;

public class Armchair extends Furniture {
    private final double width;
    private final double length;

    public Armchair(double price, double width, double length) {
        super(price);
        this.width = width;
        this.length = length;
    }

    @Override
    public String getSize() {
        return length + "x" + width;
    }

    @Override
    public String toString() {
        return "Armchair with size { "
            + "length: " + length
            + ", width: " + width
            + " }; price: " + this.getPrice();
    }
}
