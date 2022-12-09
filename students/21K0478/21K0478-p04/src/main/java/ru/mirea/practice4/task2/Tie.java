package ru.mirea.practice4.task2;

public class Tie extends Clothes implements ManClothing {
    public Tie(Size size, int cost, String colour) {
        super(size, cost, colour);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук мужской Рамер:" + getSize() + "Цвет:" + getColour() + "Стоимость:" + getCost());

    }
}
