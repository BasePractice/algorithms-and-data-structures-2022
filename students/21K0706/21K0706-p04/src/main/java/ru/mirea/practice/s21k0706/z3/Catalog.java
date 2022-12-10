package ru.mirea.practice.s21k0706.z3;

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
