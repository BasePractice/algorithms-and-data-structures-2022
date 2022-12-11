package ru.mirea.practice.task4;

public abstract class ShopTester {
    public static void main(String[] args) {
        Shop sp = new Shop();
        sp.addPc();
        sp.deletePc();
        System.out.println(sp.findPc());
    }
}
