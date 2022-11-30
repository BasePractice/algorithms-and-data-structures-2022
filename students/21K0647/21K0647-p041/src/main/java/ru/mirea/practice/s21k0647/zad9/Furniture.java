package ru.mirea.practice.s21k0647.zad9;

public abstract class Furniture {
    protected double price;
    protected String material;
    protected double width;
    protected double length;
    protected double height;
    protected double weight;


    Furniture() {
        //pus
    }

    Furniture(double price, String material, double width, double length, double height, double weight) {
        this.price = price;
        this.material = material;
        this.width = width;
        this.length = length;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Мебель не определена \nЦена: " + price + "\nМатериал: " + material + "Длина х ширина х высота: " + width + " x "
                + length + " x " + height + "\nВес" + weight;
    }



}
