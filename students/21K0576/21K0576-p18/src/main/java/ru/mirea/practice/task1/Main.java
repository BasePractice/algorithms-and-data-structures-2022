package ru.mirea.practice.task1;

abstract class Main {
    public static void main(String[] args) {
        exceptionDemo();
    }

    public static void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Division by 0");
        }
    }
}
