package ru.mirea.practice.task2;

public abstract class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {new Tshirt(Sizes.XXS, "Red", 1250), new Pants(Sizes.L, "black", 4000),
            new Skirt(Sizes.M, "white", 3499), new Tie(Sizes.M, "Red&Blue", 4499)};
        Atelier atelier = new Atelier(clothes);
        atelier.dressWomen();
        atelier.dressMan();
    }
}

