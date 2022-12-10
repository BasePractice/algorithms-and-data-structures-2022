package ru.mirea.practice.work1;

abstract class Exception1 {
    public static void exceptionDemo() {
        try {
            System.out.println(2.0 / 0.0);
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        try {
            exceptionDemo();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
