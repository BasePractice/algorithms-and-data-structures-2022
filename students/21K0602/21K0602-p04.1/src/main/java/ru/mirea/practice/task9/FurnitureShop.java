package ru.mirea.practice.task9;

import java.util.Scanner;

public abstract class FurnitureShop {

    public static void main(String[] args) {
        FurnitureFactory factory = null;
        System.out.println("Choose style of the Furniture(victorian or modern)");
        try (Scanner in = new Scanner(System.in)) {
            switch (in.next()) {
                case "victorian":
                    factory = new VictorianFurnitureFactory();
                    System.out.println("Your item will be in victorian style");
                    break;
                case "modern":
                    factory = new ModernFurnitureFactory();
                    System.out.println("Your item will be in modern style");
                    break;
                default:
                    System.out.println("we dont have this style in the shop");
                    break;
            }
            Furniture[] furnitures = {(Furniture) factory.createChair(1500, 200, "Black"),
                (Furniture) factory.createSofa(2500, 250, "white"), (Furniture)
                    factory.createCoffeeTable(10000, 234, "Yellow")};
            for (Furniture furniture : furnitures) {
                System.out.println(furniture.toString());

            }
        }


    }
}
