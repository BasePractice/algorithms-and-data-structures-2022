package ru.mirea.practice.task2;

import java.util.List;

public class Atelier {
    public void dressMan(List<Clothes> cl) {
        for (Clothes i : cl) {
            if (i instanceof MenClothing) {
                System.out.println(cl);
            }
        }
    }

    public void dressWomen(List<Clothes> cl) {
        for (Clothes i : cl) {
            if (i instanceof WomenClothing) {
                System.out.println(cl);
            }
        }
    }

}
