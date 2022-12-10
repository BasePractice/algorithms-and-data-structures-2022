package ru.mirea.practice.zad3;

public class Planet implements Nameable {

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
