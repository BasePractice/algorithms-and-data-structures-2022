package ru.mirea.practice.s21k0647.zad9;

public final class FurnitureShop {
    private FurnitureShop() {

    }

    public static void main(String[] args) {
        Furniture[] furnitures = new Furniture[3];
        furnitures[0] = new Bed(20000, "Дерево", 150, 220, 50, 55);
        furnitures[1] = new Chair(5000, "Металл", 50, 50, 120, 1, 22);
        furnitures[2] = new Wardrobe(32000, "Дерево", 80, 200, 250, 80, 8, "50x78x30");
        for (Furniture x: furnitures) {
            System.out.println(x);
        }
    }


}
