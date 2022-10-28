package ru.mirea.workfour.task2;

class Pants extends Clothing {
    public Pants(ClothSize clothSizes, int price, String color) {
        super(clothSizes, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Man is wearing Task2.Pants");
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman is wearing Task2.Pants");
    }
}
