package ru.mirea.practice.s21k0647.zad1;

public class Exception1 {

    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException var2) {
            System.out.println("Attempted division by zero");
        }

    }
}
