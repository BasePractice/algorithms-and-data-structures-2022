package ru.mirea.practice.task2;

public class Atelier {

    public Clothes[] clothes;

    public Atelier(Clothes[] clothes) {
        this.clothes = clothes;

    }

    public void dressMan() {
        for (Clothes clothe : clothes) {
            if(clothe instanceof ManClothing manClothing) {
                manClothing.dressMen();
            }
        }
    }

    public void dressWomen() {
        for (Clothes clothe : clothes) {
            if(clothe instanceof WomenClothing womenClothing) {
                womenClothing.dressWomen();
            }
        }
    }
}
