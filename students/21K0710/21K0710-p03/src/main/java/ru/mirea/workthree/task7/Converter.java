package ru.mirea.workthree.task7;

public class Converter {
    double rub;

    public Converter(double rub) {
        this.rub = rub;
    }

    public double getRub() {
        return rub;
    }

    public void setRub(double rub) {
        this.rub = rub;
    }

    public double eur() {
        return this.rub / 62.6;
    }

    public double usd() {
        return this.rub / 63.5;
    }

    public double cny() {
        return this.rub / 8.7;
    }
}
