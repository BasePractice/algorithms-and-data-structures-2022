package ru.mirea.practice.task4;

import java.util.Scanner;

abstract class Shop {
    public static void main(String[] main) {
        int amount = 0;
        try (Scanner sc = new Scanner(System.in)) {
            amount = sc.nextInt();
        }
        Computer[] computers = new Computer[amount];

    }
}
