package ru.mirea.practice.task2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, String color, double cost) {
        super(size, color, cost);
    }

    public void dressWomen() {
        System.out.println("Размер: " + this.getSize() + ", цвет: " + this.getColor() + ". Цена: " + this.getCost());
    }
}