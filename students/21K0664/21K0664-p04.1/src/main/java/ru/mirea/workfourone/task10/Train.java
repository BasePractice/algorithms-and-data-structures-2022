package ru.mirea.workfourone.task10;

public class Train extends Vehicle {
    private double time;
    private double price;

    public double getPrice() {
        return price;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Train{" + "time=" + time + ", price=" + price + '}';
    }
}
