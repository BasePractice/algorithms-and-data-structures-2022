package ru.mirea.practice.s21k0647.zad9;

public class Bed extends Furniture {

    Bed(double price, String material, double width, double length, double height, double weight) {
        super(price, material, width, length, height, weight);
    }

    @Override
    public String toString() {
        return "Кровать \nЦена: " + price + "\nМатериал: " + material + "\nДлина х ширина х высота: " + width + " x " + length + " x "
                + height + "\nВес: " + weight;
    }
}
