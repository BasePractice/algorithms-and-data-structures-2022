package ru.mirea.practice.work2;

public class Functionalchair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void getMaterial() {
        System.out.println("Steel");
    }
}
