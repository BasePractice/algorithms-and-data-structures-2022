package ru.mirea.practice4.task2;

abstract class Atelier implements ManClothing, WomanClothes {
    public static void dressMan(Clothes[] cl) {
        System.out.println("Мужчинам:");
        for (Clothes clth : cl) {
            if (clth instanceof ManClothing) {
                System.out.println(clth);
            }
        }
    }

    public static void dressWoman(Clothes[] cl) {
        System.out.println("Женщинам:");
        for (Clothes clth : cl) {
            if (clth instanceof WomanClothes) {
                System.out.println(clth);
            }
        }
    }

    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new Tshirt(Size.XS, 140, "темно-серый");
        clothes[0] = new Tie(Size.XS, 140, "темно-серый");
        clothes[0] = new Pants(Size.XS, 140, "темно-серый");
        clothes[0] = new Skirt(Size.XS, 140, "темно-серый");


        dressMan(clothes);
        dressWoman(clothes);

    }
}
