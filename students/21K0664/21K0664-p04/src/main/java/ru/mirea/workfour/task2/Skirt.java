package ru.mirea.workfour.task2;

class Skirt extends Clothing {
    public Skirt(ClothSize clothSizes, int price, String color) {
        this.clothSizes = clothSizes;
        this.price = price;
        this.color = color;
    }

    public void dressWoman() {
        System.out.println("Woman is wearing Task2.Skirt");
    }
}
