package ru.mirea.practice.task4;

public class Computer {
    private double price;
    private String model;

    private String manufacturer;

    public Computer() {
        price = 0.0;
        model = "";
        manufacturer = "";
    }

    public Computer(double price, String manufacturer, String model) {
        this.price = price;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String toString() {
        return "Manufacturer:" + manufacturer + " Model:" + model + " Price:" + price + "\n";
    }
}
