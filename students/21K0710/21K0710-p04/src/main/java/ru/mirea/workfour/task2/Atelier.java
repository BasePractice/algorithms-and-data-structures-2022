package ru.mirea.workfour.task2;

public class Atelier {
    public void dressWomen(Clothes[] arr) {
        for (Clothes cloth: arr) {
            cloth.dressWomen();
        }
    }

    public void dressMan(Clothes[] arr) {
        for (Clothes cloth:  arr) {
            cloth.dressMan();
        }
    }
}
