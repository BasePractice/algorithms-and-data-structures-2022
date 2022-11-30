package ru.mirea.practice.task9;

public class Doublebed extends Furniture {
    private final double length;
    private final double width;

    public Doublebed(double price, double length, double width) {
        super(price);
        this.length = length;
        this.width = width;
    }

    @Override
    public String getSize() {
        return length + "x" + width;
    }

    @Override
    public String toString() {
        return "DoubleBed with size { "
            + "length: " + length
            + ", width: " + width
            + " }; price: " + this.getPrice();
    }
}
