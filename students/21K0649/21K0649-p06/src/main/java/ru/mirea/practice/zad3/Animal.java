package ru.mirea.practice.zad3;

public class Animal implements Nameable {

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
