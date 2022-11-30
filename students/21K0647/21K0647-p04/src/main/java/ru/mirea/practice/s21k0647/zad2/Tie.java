package ru.mirea.practice.s21k0647.zad2;

public class Tie extends Clothes {

    public Tie(Size size, int price, String color) {
        this.s = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public void dressMen() {
        System.out.println("Tie Size: " + this.s + ", Summa " + this.price + ", Color " + this.color);
    }
}
