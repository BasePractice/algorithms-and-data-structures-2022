package ru.mirea.workfourone.task9;

public class Chair extends Furniture {
    protected double height;
    protected boolean chairback;

    public Chair() {
        // constructor
    }

    public Chair(double height, boolean chairback) {
        this.height = height;
        this.chairback = chairback;
    }

    public Chair(String material, double price, double height, boolean chairback) {
        super(material, price);
        this.height = height;
        this.chairback = chairback;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isChairback() {
        return chairback;
    }

    public void setChairback(boolean chairback) {
        this.chairback = chairback;
    }

    @Override
    public String toString() {
        return "Chair{" + "height=" + height + ", chairback=" + chairback + ", material='" + material + '\'' + ", price=" + price + '}';
    }
}
