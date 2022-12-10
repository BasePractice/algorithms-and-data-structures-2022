package ru.mirea.practice.task1;

public class Exep {
    public void exceptionDemo() {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        }
    }

    public static void main(String[] args) {
        Exep exception = new Exep();
        exception.exceptionDemo();
    }
}
