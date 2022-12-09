package ru.mirea.practice4.task2;

public class Pants extends Clothes implements ManClothing, WomanClothes {
    Pants(Size size, int cost, String colour) {
        super(size, cost, colour);
    }

    @Override
    public void dressMan() {
        System.out.println("Штаны мужские Рамер:" + getSize() + "Цвет:" + getColour() + "Стоимость:" + getCost());
    }

    @Override
    public void dressWoman() {
        System.out.println("Штаны женские Рамер:" + getSize() + "Цвет:" + getColour() + "Стоимость:" + getCost());

    }
}


