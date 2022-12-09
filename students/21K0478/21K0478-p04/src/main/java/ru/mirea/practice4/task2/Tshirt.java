package ru.mirea.practice4.task2;

public class Tshirt extends Clothes implements ManClothing, WomanClothes {
    public Tshirt(Size size, int cost, String colour) {
        super(size, cost, colour);
    }

    @Override
    public void dressMan() {
        System.out.println("Рубашка мужская Рамер:" + getSize() + "Цвет:" + getColour() + "Стоимость:" + getCost());

    }

    @Override
    public void dressWoman() {
        System.out.println("Рубашка женская Рамер:" + getSize() + "Цвет:" + getColour() + "Стоимость:" + getCost());

    }
}
