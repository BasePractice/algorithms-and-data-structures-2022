package ru.mirea.practice.ex2;

public final class Main {
    private Main() {

    }

    public static void main(final String[] args) {
        Clothes[] clothesTypes = {new TShirt(), new Pants(), new Skirt(), new Tie()};
        Atelier atelier = new Atelier();
        atelier.dressWomen(clothesTypes);
        atelier.dressMan(clothesTypes);

    }
}
