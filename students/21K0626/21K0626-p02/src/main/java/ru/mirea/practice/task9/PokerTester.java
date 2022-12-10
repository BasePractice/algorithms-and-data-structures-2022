package ru.mirea.practice.task9;

import java.util.Scanner;

public abstract class PokerTester {
    public static void main(String[] args) {
        int n;
        System.out.println("Введите количество игроков: ");
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            Poker p = new Poker(n);
            p.addKoloda();
            p.sortKoloda();
            p.razdacha();
        }
    }
}
