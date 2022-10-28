package ru.mirea.practice.s21k0647.zad2;

public abstract class Clothes implements MenClothing, WomenClothing {
    Size s;
    int price;
    String color;

    @Override
    public void dressMen() {
        System.out.print("");

    }

    @Override
    public void dressWomen() {
        System.out.print("");
    }

}
