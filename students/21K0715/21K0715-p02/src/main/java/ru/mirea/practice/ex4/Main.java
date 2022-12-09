package ru.mirea.practice.ex4;

public final class Main {
    private Main() {

    }

    public static void main(final String[] args) {
        Shop shop = new Shop();
        System.out.println(shop);
        shop.remove(0);
        System.out.println(shop);
        System.out.println(shop.find("arr"));
    }
}
