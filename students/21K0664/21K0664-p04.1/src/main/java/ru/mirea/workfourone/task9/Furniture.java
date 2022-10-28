package ru.mirea.workfourone.task9;

public abstract class Furniture {

    private double price;

    Furniture() {
    }

    Furniture(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Furniture{" + "price=" + price + '}';
    }
}
