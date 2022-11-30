package ru.mirea.practice.task9;

public abstract class FurnitureShop {
    public static void main(String[] args) {
        Furniture[] furnitures = {new Doublebed(10000, 2, 1.5),
            new Armchair(5000, 0.5, 0.7),
            new Wardrobe(8000, 0.6, 1.3, 2.1, 0.55)};

        System.out.println(furnitures[2].getPrice());
        System.out.println(furnitures[0].getSize());

        for (Furniture furniture : furnitures) {
            System.out.println(furniture);
        }
    }
}
