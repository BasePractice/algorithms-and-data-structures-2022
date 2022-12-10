package ru.mirea.practice.task4;

public abstract class Tester {
    public static void main(String[] args) {
        MathFunc mathF = new MathFunc();

        System.out.println(mathF.pow(10, 10));
        System.out.println(mathF.abs(10, 5));
        System.out.println(mathF.circumferenceLength(5));
    }
}
