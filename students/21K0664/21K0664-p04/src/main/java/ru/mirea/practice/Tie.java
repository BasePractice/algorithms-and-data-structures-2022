package ru.mirea.practice;

class Tie extends Clothing {
    public Tie(ClothSize clothSizes, int price, String color) {
        this.clothSizes = clothSizes;
        this.price = price;
        this.color = color;
    }

    public void dressMan() {
        System.out.println("Man is wearing Task2.Tie");
    }
}
