package ru.mirea.workfourone.task9;

public final class FurnitureShop {
    private FurnitureShop() {
    }

    public static void main(String[] args) {
        Furniture[] furnitures = new Furniture[5];
        furnitures[0] = new Chair();
        furnitures[1] = new Sofa(300, 50);
        furnitures[2] = new Table("wood", 400, 120);
        furnitures[3] = new Chair(70, true);
        furnitures[4] = new Sofa();
        for (Furniture furniture : furnitures) {
            System.out.println(furniture);
        }
    }
}
