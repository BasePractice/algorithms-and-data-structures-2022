package ru.mirea.workfourone.task9;

public class Sofa extends Furniture {
    protected double width;
    protected double height;

    public Sofa() {
        // constructor
    }

    public Sofa(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Sofa(String material, double price, double width, double height) {
        super(material, price);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Sofa{" + "width=" + width + ", height=" + height + ", material='" + material + '\'' + ", price=" + price + '}';
    }
}
