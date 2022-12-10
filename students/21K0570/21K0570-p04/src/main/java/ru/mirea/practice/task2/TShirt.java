package ru.mirea.practice.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, String color, double cost) {
        super(size, color, cost);
    }

    public void dressMen() {
        System.out.println("Размер: " + this.getSize() + ", цвет: " + this.getColor() + ". Цена: " + this.getCost());
    }
    public void dressWomen() {
        System.out.println("Размер: " + this.getSize() + ", цвет: " + this.getColor() + ". Цена: " + this.getCost());
    }
}
