package ru.mirea.practice.s21k0647.zad3;

public enum Catalog {
    CLOTHES,
    SHOES,
    ACCESSORYS,
    ELECTRONICS,
    TOYS,
    SPORT,
    AUTO;

    public String getInfo() {
        return name();
    }

    public static void catalogAll() {
        for (Catalog x: Catalog.values()) {
            System.out.println(x);
        }
    }



}
