package ru.mirea.workfour.task3;

public class Product {
    private double price;
    private Categories category;
    private String name;

    public Product(double price, Categories category, String name) {
        this.price = price;
        this.category = category;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Categories getCategory() {
        return category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" + "price=" + price + ", category=" + category + ", name='" + name + '\'' + '}';
    }
}
