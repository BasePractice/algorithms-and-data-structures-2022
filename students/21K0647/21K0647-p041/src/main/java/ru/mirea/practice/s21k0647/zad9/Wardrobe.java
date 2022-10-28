package ru.mirea.practice.s21k0647.zad9;

public class Wardrobe extends Furniture {
    protected int numberOfShelves;
    protected String shelfSize;

    Wardrobe(double price, String material, double width, double length, double height, double weight, int numberOfShelves, String shelfSize) {
        super(price, material, width, length, height, weight);
        this.numberOfShelves = numberOfShelves;
        this.shelfSize = shelfSize;
    }

    @Override
    public String toString() {
        return "Кровать \nЦена: " + price + "\nМатериал: " + material + "\nДлина х ширина х высота: " +  width + " x " + length
                + " x " + height + "\nВес: " + weight + "\nКоличество полок: " + numberOfShelves + "\nРазмер полок: " + shelfSize;
    }
}
