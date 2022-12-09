package ru.mirea.practice.task1;

public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException exc) {
            System.out.println("Attempted division by zero");
        }
    }
}