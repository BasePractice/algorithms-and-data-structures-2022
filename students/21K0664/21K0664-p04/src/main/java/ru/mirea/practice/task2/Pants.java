package ru.mirea.practice.task2;

class Pants extends Clothing {
    public Pants(ClothSize clothSizes, int price, String color) {
        this.clothSizes = clothSizes;
        this.price = price;
        this.color = color;
    }

    public void dressMan() {
        System.out.println("Man is wearing Task2.Pants");
    }

    public void dressWoman() {
        System.out.println("Woman is wearing Task2.Pants");
    }
}
