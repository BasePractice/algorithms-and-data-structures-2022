package ru.mirea.practice.Ex4;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        System.out.println(shop);
        shop.remove(0);
        System.out.println(shop);
        System.out.println(shop.find("arr"));
    }
}
