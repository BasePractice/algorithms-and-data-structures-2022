package ru.mirea.workfour.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка, размер: " + getDescription() + " " + getSize() + ", евро - " + getEuro() + ", цвет: " + getColor()
                + ", цена: " + getPrice());
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка, размер: " + getDescription() + " " + getSize() + ", евро - " + getEuro() + ", цвет: " + getColor()
                + ", цена: " + getPrice());
    }
}
