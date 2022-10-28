package ru.mirea.workfour.task2;

public class TesterCloth {
    public static void main(String[] args) {
        System.out.println("\nЗадание 4.2\n");
        ClothSize clothSizes = ClothSize.XS;
        ClothSize.allSize();
        Pants a = new Pants(ClothSize.L, 500, "Red");
        TShirt b = new TShirt(ClothSize.XXS, 1200, "Blue");
        Tie c = new Tie(ClothSize.XS, 2000, "Orange");
        Skirt d = new Skirt(ClothSize.M, 6000, "Green");
        Clothing[] clothes = {a, b, c, d};
    }
}
