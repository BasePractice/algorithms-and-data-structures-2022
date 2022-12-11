package ru.mirea.practice.task2;

public class Pants
        extends Clothes
        implements MenClothing, WomenClothing {
    @Override
    public void dressMan() {
        System.out.println("dress man");
    }

    @Override
    public void dressWomen() {
        System.out.println("dress women");
    }
}
