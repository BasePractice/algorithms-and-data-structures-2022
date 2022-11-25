package ru.mirea.workfour.task2;

class TShirt extends Clothing {
    public TShirt(ClothSize clothSizes, int price, String color) {
        super(clothSizes, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Man is wearing Task2.TShirt");
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman is wearing Task2.TShirt");
    }
}
