package ru.mirea.practice.task4;

public abstract class Tester {
    public static void main(String[] args) {
        Priceable computer = new Computer("intel", "ssd", "HP", 128000);
        computer.getPrice();
    }

}
