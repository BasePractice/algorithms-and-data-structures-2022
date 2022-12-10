package ru.mirea.practice.zad3;

public class Auto implements Nameable {

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
