package ru.mirea.practice.ex2;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothesTypes = {new TShirt(), new Pants(), new Skirt(), new Tie()};
        Atelier atelier = new Atelier();
        atelier.dressWomen(clothesTypes);
        atelier.dressMan(clothesTypes);

    }
}
