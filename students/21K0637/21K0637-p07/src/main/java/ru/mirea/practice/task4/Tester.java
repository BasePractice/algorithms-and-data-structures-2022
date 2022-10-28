package ru.mirea.practice.task4;

public abstract class Tester {
    public static void main(String[] args) {
        MathCalculable mathCalculable = new MathFunc(1,10);

        mathCalculable.pow(2);

        System.out.println(mathCalculable);
    }
}
