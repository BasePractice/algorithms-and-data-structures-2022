package ru.mirea.practice.work2;

abstract class Atelier extends Clothes {
    public Atelier(EnumAtelier clothingSize, double cost, String colour) {
        super(clothingSize, cost, colour);
    }

    public void dressWomen(Clothes[] clothes) {
        System.out.println("a");
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("a");
    }

    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new Pants(EnumAtelier.L, 2000, "orange");
        clothes[1] = new Skirt(EnumAtelier.XXS, 3000, "yellow");
        clothes[2] = new Tie(EnumAtelier.XS, 1000, "orange");
        clothes[3] = new TShirt(EnumAtelier.M, 500, "black");
    }
}