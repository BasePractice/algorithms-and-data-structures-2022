package ru.mirea.practice.task3;

public class Products {
    private String n;
    private int p;

    public Products(String n, int p) {
        this.n = n;
        this.p = p;
    }

    public String getName() {
        return n;
    }

    public void setName(String n) {
        this.n = n;
    }

    public int getPrice() {
        return p;
    }

    public void setPrice(int p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return n + ": price is - " + p + "\n";
    }
}
