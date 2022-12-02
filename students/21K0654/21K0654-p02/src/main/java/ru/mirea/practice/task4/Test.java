package ru.mirea.practice.task4;

import java.util.Scanner;

public final class Test {
    private Test() {
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Shop shop = new Shop();
            shop.input(sc);
            sc.close();
            Computer computer = new Computer("new");
            shop.addComputer(computer);
            shop.addComputer(computer);
            System.out.println(shop.toString());
            shop.deleteComputer(3);
            System.out.println(shop.toString());
            shop.deleteComputer(2);
            System.out.println(shop.toString());
            shop.searchComputer("new");
            shop.searchComputer("...");
        }
    }
}
