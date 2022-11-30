package ru.mirea.workfourone.task9;

public class Table extends Furniture {
    protected double height;

    public Table() {
        // constructor
    }

    public Table(double height) {
        this.height = height;
    }

    public Table(String material, double price, double height) {
        super(material, price);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Table{" + "height=" + height + ", material='" + material + '\'' + ", price=" + price + '}';
    }
}
