package ru.mirea.practice.task9;

import java.util.Scanner;

public class Poker {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int m = 5;
        int players;

        String[] suits = {"Пик", "Бубен", "Черв", "Крест"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"};

        int n = 54; // количество карт
        for (; ; ) {
            System.out.println("Введите количество игроков: ");
            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (m * players <= n && m * players > 0) {
                    break;
                } else {
                    if (players <= 0) {
                        System.out.println("Число игроков должно быть больше 0");
                    } else {
                        System.out.println("Слишком много игроков!");
                    }
                }
            } else {
                System.out.println("Это не число");

            }
        }

        String[] deck = new String[n];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }

        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        for (int i = 0; i < players * m; i++) {
            System.out.println(deck[i]);
            if (i % m == m - 1) {
                System.out.println();
            }
        }
    }
}
