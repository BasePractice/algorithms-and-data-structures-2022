package ru.mirea.practice.task9;

public class Wardrobe extends Furniture {
    private final double width;
    private final double height;
    private final double length;
    private final double depth;

    public Wardrobe(double price, double width, double length, double height, double depth) {
        super(price);
        this.width = width;
        this.height = height;
        this.length = length;
        this.depth = depth;
    }

    @Override
    public String getSize() {
        return length + "x" + width;
    }

    public double getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return "Wardrobe with size { "
            + "length: " + length
            + ", width: " + width
            + ", height: " + height
            + "depth: " + depth
            + " }; price: " + this.getPrice();
    }
}
