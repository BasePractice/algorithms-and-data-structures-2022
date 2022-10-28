package ru.mirea.workfourone.task10;

public class Ship extends Vehicle {
    private double time;
    private double price;

    public double getPrice() {
        return price;
    }

    public double getTime() {
        return time;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Ship{" + "time=" + time + ", price=" + price + '}';
    }
}

