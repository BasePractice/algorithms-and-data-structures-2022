package ru.mirea.practice.s21k0709.task2;

public abstract class Tester {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        System.out.println(chairFactory.createFunctionalChair().isComfortable());
        System.out.println(chairFactory.createVictorianChair(15).getAge());
        System.out.println(chairFactory.createFunctionalChair().isStrength());
    }
}
