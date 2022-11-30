package ru.mirea.workfourone.task9;

public class Bed extends Furniture {


    Bed(double price) {
        super(price);
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bed{" + "price=" + price + '}';
    }
}
