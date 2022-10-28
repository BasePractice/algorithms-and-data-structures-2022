package ru.mirea.workfourone.task9;

public class Chair extends Furniture {
    private double price;

    Chair() {
    }

    Chair(double price) {
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
        return "Chair{" + "price=" + price + '}';
    }


}
