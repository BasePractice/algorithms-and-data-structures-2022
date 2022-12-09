package ru.mirea.practice.s21k0709.task2;


public class MagicChair implements Chair {
    @Override
    public boolean isStrength() {
        return false;
    }

    @Override
    public boolean isComfortable() {
        return true;
    }

    @Override
    public boolean isSiting() {
        return false;
    }
}
