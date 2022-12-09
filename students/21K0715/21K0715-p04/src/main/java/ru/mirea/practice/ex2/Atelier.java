package ru.mirea.practice.ex2;

public class Atelier {
    public void dressWomen(Clothes[] clothesTypes) {
        for (Clothes element: clothesTypes) {
            if (element instanceof WomenClothing) {
                ((WomenClothing) element).dressWomen();
            }
        }
    }

    public void dressMan(Clothes[] clothesTypes) {
        for (Clothes element: clothesTypes) {
            if (element instanceof MenClothing) {
                ((MenClothing) element).dressMan();
            }
        }
    }
}
