package ru.mirea.practice.task4;

public abstract class Tester {
    public static void main(String[] args) {
        Computer[] computers = new Computer[3];
        Shop shop = new Shop(computers);
        shop.add();
        shop.printComputers();
        shop.delete();
        shop.printComputers();
    }


}
