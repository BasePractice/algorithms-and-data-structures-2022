package ru.mirea.practice.task4;

public abstract class Tester {
    public static void main(String[] args) {
        MathCalculable mathCalculable = new MathFunc();
        System.out.println(mathCalculable.abs(-23) + "\n"
                + mathCalculable.pow(2, 3) + "\n"
                + mathCalculable.circlePerimeter(23));
    }
}
