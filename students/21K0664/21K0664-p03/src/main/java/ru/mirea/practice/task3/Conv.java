package ru.mirea.practice.task3;

public class Conv {
    private double doll;
    private double euro;
    private double ruble;

    Conv(double doll, double euro, double ruble) {
        this.doll = doll;
        this.euro = euro;
        this.ruble = ruble;
    }

    public void setRuble(double ruble) {
        this.ruble = ruble;
    }

    public double getDoll() {
        return doll;
    }

    public double getEuro() {
        return euro;
    }

    public double getRuble() {
        return ruble;
    }

    public void setDoll(double doll) {
        this.doll = doll;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public String toString() {
        return "dollars= ";
    }
}
