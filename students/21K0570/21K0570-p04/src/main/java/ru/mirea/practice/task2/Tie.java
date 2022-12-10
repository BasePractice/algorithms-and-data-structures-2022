package ru.mirea.practice.task2;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, String color, double cost) {
        super(size, color, cost);
    }

    public void dressMen() {
        System.out.println("Размер: " + this.getSize() + ", цвет: " + this.getColor() + ". Цена: " + this.getCost());
    }
}
