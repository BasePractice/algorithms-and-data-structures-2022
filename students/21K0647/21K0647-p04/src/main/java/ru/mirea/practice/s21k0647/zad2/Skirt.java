package ru.mirea.practice.s21k0647.zad2;

public class Skirt extends Clothes {

    public Skirt(Size size, int price, String color) {
        this.s = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public void dressWomen() {
        System.out.println("Skirt Size: " + this.s + ", Summa " + this.price + ", Color " + this.color);
    }

}
