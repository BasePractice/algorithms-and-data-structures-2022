package ru.mirea.practice.task4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        shop.input(sc);
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
