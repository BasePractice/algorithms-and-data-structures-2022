package ru.mirea.practice.task4;

public abstract class Computer {
    public static void main(String[] args) {
        Product computer = new Product("Computer s1", 2555.20);
        System.out.println(computer.getPrice());
    }
}
