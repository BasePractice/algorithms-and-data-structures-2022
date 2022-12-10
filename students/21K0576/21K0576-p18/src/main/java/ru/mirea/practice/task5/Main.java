package ru.mirea.practice.task5;

abstract class Main {
    public static void main(String[] args) {
        ThrowsDemo t = new ThrowsDemo();
        try {
            t.getDetails(null);
        } catch (NullPointerException e) {
            System.out.println("Caught an exception.");
        }
    }
}
