package ru.mirea.practice.s21k0647.zad10;

public abstract class Transport {
    protected double price;
    protected double speed;
    protected String cargo;

    Transport(double price, double speed, String cargo) {
        this.price = price;
        this.speed = speed;
        this.cargo = cargo;
    }

    public double cost(double distance) {
        return 0;
    }

    public String time(double distance) {
        return "";
    }

    @Override
    public String toString() {
        return "Вид транспорта не определен";
    }
}
