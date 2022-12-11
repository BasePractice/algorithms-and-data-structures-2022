package ru.mirea.practice.task4;

public class Product implements Priceable {
    private String nameOfProduct;
    private double price;

    public Product(String nameOfProduct, double price) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" + "nameOfProduct='" + nameOfProduct + '\'' + ", price=" + price + '}';
    }
}
