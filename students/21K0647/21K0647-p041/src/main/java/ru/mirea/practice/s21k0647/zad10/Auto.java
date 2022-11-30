package ru.mirea.practice.s21k0647.zad10;

public class Auto extends Transport {

    Auto(double price, double speed, String cargo) {
        super(price, speed, cargo);
    }

    @Override
    public double cost(double distance) {
        return distance * price;
    }

    @Override
    public String time(double distance) {
        double v = distance / speed;
        int hh = (int) v;
        v = (v - hh) * 60;
        int mm = (int) (v);
        return hh + " часов " + mm + " минут";
    }

    @Override
    public String toString() {
        return "На машине " + cargo;
    }


}
