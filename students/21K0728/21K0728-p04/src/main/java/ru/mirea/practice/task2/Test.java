package ru.mirea.practice.task2;

abstract class Test {
    public static void main(String[] args) {
        Clothes[] arr = {new Pants(Size.M, 99, "Grey"),
                         new Skirt(Size.L, 59, "Purple"),
                         new Tie(Size.M, 39, "Dark Green"),
                         new TShirt(Size.S, 109, "Indigo")};

        Atelier atelier = new Atelier();
        atelier.dressMan(arr);
        System.out.print("\n");
        atelier.dressWoman(arr);
    }
}
