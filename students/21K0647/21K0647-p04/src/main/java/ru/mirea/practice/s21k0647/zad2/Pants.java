package ru.mirea.practice.s21k0647.zad2;

public class Pants extends Clothes {

    public Pants(Size size, int price, String color) {
        this.s = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public void dressWomen() {
        System.out.println("Pants Size: " + this.s + ", Summa " + this.price + ", Color " + this.color);
    }

    @Override
    public void dressMen() {
        System.out.println("Pants Size: " + this.s + ", Summa " + this.price + ", Color " + this.color);
    }
}
