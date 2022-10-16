package ru.mirea.practice.Work_2;

public class Atelier {
    public void dressWomen(Clothes[]clothes){

    }
    public void dressMan(Clothes[]clothes){

    }

    public static void main(String[] args) {
        Clothes []clothes= {
                new Pants(EnumAtelier.L,2000, "orange"),
                new Skirt(EnumAtelier.XXS, 3000, "yellow"),
                new Tie(EnumAtelier.XS, 1000, "orange"),
                new TShirt(EnumAtelier.M, 500, "black")};
    }
}