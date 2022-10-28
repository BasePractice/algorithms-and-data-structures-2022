package ru.mirea.workfour.task2;

class Tie extends Clothing {
    public Tie(ClothSize clothSizes, int price, String color) {
        super(clothSizes, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Man is wearing Task2.Tie");
    }
}
