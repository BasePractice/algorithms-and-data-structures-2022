package ru.mirea.practice.ex9;

public class FurnitureShop {
    private final Furniture[] furnArr;
    FurnitureShop() {
        furnArr = new Furniture[]{new Armchair(120), new Shelf(80), new Sofa(250)};
    }

    public void printFurns() {
        for (Furniture element: furnArr) {
            System.out.println(element.getType() + " " + element.getCost());
        }
    }
}
