package ru.mirea.workfour.task2;

class Skirt extends Clothing {
    Skirt(ClothSize clothSizes, int price, String color) {
        super(clothSizes, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman is wearing Task2.Skirt");
    }
}
