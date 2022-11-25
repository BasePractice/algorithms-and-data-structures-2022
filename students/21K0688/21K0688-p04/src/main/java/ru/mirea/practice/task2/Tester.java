package ru.mirea.practice.task2;

abstract class Tester {
    public static void main(String[] args) {
        Clothes[] arr = {new Pants(Size.L, 1500, "черный"),
            new Skirt(Size.S, 2000, "белый"),
            new Tie(Size.M, 500, "синий"),
            new TShirt(Size.XXS, 700, "желтый")};

        Atelier atelier = new Atelier();
        atelier.dressMan(arr);
        System.out.print("\n");
        atelier.dressWoman(arr);
    }
}