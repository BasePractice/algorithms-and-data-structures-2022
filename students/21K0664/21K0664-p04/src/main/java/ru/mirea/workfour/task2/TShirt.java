package ru.mirea.workfour.task2;

class TShirt extends Clothing {
    public TShirt(ClothSize clothSizes, int price, String color) {
        this.clothSizes = clothSizes;
        this.price = price;
        this.color = color;
    }

    public void dressMan() {
        System.out.println("Man is wearing Task2.TShirt");
    }

    public void dressWoman() {
        System.out.println("Woman is wearing Task2.TShirt");
    }
}
