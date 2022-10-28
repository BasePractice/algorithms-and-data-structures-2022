package ru.mirea.workfour.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны, размер: " + getDescription() + " " + getSize() + ", евро - " + getEuro() + ", цвет: " + getColor()
                + ", цена: " + getPrice());
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны, размер: " + getDescription() + " " + getSize() + ", евро - " + getEuro() + ", цвет: " + getColor()
                + ", цена: " + getPrice());
    }
}
