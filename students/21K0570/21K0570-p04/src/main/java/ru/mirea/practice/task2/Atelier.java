package ru.mirea.practice.task2;

public class Atelier {

    public void dressWomen(Clothes[] allTypes) {
        for (Clothes clothe: allTypes) {
            clothe.dressWomen();
        }
    }

    public void dressMan(Clothes[] allTypes) {
        for (Clothes clothe: allTypes) {
            clothe.dressMan();
        }
    }
}
