package ru.mirea.practice.task9;

public abstract class Furniture {
    private double price;

    public Furniture(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getSize();

    @Override
    public abstract String toString();
}
