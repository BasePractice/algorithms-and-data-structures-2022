package ru.mirea.practice.odin;

public class Skirt extends Clothes implements IFemaleClothes {
    public Skirt(Sizes size, String color) {
        super(size, color);
    }

    public Skirt(Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Юбка{"
                + "размер = " + getSize()
                + ", цена = " + getCost() + " руб"
                + ", цвет = " + getColor()
                + "}";
    }
}
