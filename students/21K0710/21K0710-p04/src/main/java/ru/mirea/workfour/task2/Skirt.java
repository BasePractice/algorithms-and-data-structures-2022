package ru.mirea.workfour.task2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская юбка, размер: " + getDescription() + " " + getSize() + ", евро - " + getEuro() + ", цвет: " + getColor()
                + ", цена: " + getPrice());
    }

    @Override
    public void dressMan() {
        // Empty
    }
}
