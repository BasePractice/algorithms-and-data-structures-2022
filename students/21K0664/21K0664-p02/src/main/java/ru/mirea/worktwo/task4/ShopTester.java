package ru.mirea.worktwo.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class ShopTester {
    public static void main(String[] args) {
        Shop shop = new Shop(8);

        System.out.println(shop.toString());

        Scanner sc = new Scanner(System.in);
        try {


            int a = 0;
            System.out.print("Введите номер компьютера (1-10): ");
            a = sc.nextInt();

            System.out.println();
            shop.findComputer(a);
            shop.addComputer(4);
            shop.delComputer(5);
            shop.findComputer(10);
        } catch (InputMismatchException e) {
            System.out.println("Error");
            sc.nextInt();
        } finally {
            sc.close();
        }
    }
}