package ru.mirea.practice.task2;

abstract class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
            new TShirt(Size.XS,  1050, "Green"),
            new Pants(Size.M,  2000, "Gray"),
            new Skirt(Size.M,  5499,"white"),
            new Tie(Size.S,  899, "Red&Gold")
        };
        Atelier atelier = new Atelier(clothes);
        atelier.dressWomen();
        atelier.dressMan();
    }
}
