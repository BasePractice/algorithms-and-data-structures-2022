package ru.mirea.practice.task2;

public class Atelier implements MenClothing, WomenClothing {
    public void dressMan(Clothes[] arr) {
        System.out.println("For Men:");
        for (Clothes cloth : arr) {
            if (cloth instanceof MenClothing) {
                System.out.println(cloth);
            }
        }
    }

    public void dressWoman(Clothes[] arr) {
        System.out.println("For Women:");
        for (Clothes cloth : arr) {
            if (cloth instanceof WomenClothing) {
                System.out.println(cloth);
            }
        }
    }
}
