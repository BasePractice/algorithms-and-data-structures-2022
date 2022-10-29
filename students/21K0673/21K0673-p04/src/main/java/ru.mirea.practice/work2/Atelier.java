package ru.mirea.practice.work2;

public class Atelier extends Clothes {
    public void dressWomen(Clothes[] clothes) {

    }

    public void dressMan(Clothes[] clothes) {

    }

    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new Pants(EnumAtelier.L, 2000, "orange");
        clothes[1] = new Skirt(EnumAtelier.XXS, 3000, "yellow");
        clothes[2] = new Tie(EnumAtelier.XS, 1000, "orange");
        clothes[3] = new TShirt(EnumAtelier.M, 500, "black");
    }
}