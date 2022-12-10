package ru.mirea.practice.task2;

public abstract class Tester {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.XS, "чёрный", 550),
                new TShirt(Size.L, "черный", 500),
                new Pants(Size.M, "серый", 2000),
                new Pants(Size.XXS, "тёмно-синий", 1700),
                new Tie(Size.L, "серый", 1300),
                new Tie(Size.L, "чёрный", 1750),
                new Skirt(Size.S, "чёрный", 2500),
                new Skirt(Size.M, "бордовый", 1000),
        };
        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        atelier.dressWomen(clothes);
    }
}
