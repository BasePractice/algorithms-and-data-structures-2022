package ru.mirea.practice4.task2;

public class Skirt extends Clothes implements WomanClothes {
    public Skirt(Size size, int cost, String colour) {
        super(size, cost, colour);
    }

    @Override
    public void dressWoman() {
        System.out.println("Юбка женская Рамер:" + getSize() + "Цвет:" + getColour() + "Стоимость:" + getCost());

    }
}
