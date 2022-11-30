package ru.mirea.practice.s21k0647.zad9;

public class Chair extends Furniture {
    protected double armrestHeight;

    Chair(double price, String material, double width, double length, double height, double weight, double armrestHeight) {
        super(price, material, width, length, height, weight);
        this.armrestHeight = armrestHeight;
    }

    @Override
    public String toString() {
        return "Cтул \nЦена: " + price + "\nМатериал: " + material + "\nДлина х ширина х высота: " + width
                + " x " + length + " x " + height + "\nВес: " + weight + "\nВысота подлокотников: " + armrestHeight;
    }


}
