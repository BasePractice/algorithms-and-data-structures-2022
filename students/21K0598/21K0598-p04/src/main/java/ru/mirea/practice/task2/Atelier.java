package ru.mirea.practice.task2;

public class Atelier {
    public Clothes[] cloths;

    public Atelier(Clothes[] clothes) {
        this.cloths = clothes;
    }

    public void dressMan() {
        for (Clothes clothe : cloths) {
            try {
                MenClothing clothing = (MenClothing) clothe;
                clothing.dressMan();
            } catch (ClassCastException e) {
                System.out.println(clothe.getClass() + " is not for man");
            }
        }
    }

    public void dressWomen() {
        for (Clothes clothe : cloths) {
            try {
                WomenClothing clothing = (WomenClothing) clothe;
                clothing.dressWoman();
            } catch (ClassCastException e) {
                System.out.println(clothe.getClass() + " is not for woman");
            }
        }
    }
}
