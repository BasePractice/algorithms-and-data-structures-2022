package ru.mirea.workfourone.task9;

public class Bed extends Furniture {

    private double price;

    Bed() {
    }

    Bed(double price) {
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
        return "Bed{" + "price=" + price + '}';
    }
}
