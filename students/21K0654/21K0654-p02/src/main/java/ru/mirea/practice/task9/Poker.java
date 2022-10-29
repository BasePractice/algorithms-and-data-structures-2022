package ru.mirea.practice.task9;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        int cardsPerPlayer = 5;
        int players;
        String[] suits = {"Пик", "Бубен", "Черв", "Крест"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз"};
        int n = suits.length * rank.length;
        String[] deck = new String[n];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String s = deck[r];
            deck[r] = deck[i];
            deck[i] = s;
        }
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество игроков: ");
            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsPerPlayer * players <= n) {
                    break;
                } else {
                    if (players == 0) {
                        break;
                    } else if (players < 0) {
                        System.out.println("Число игроков не может быть < 0");
                    } else {
                        System.out.println("Слишком много игроков");
                    }
                }
            } else {
                System.out.println("Это не число");
            }
        }
        for (int i = 0; i < players * cardsPerPlayer; i++) {
            System.out.println(deck[i]);
            if (i % cardsPerPlayer == cardsPerPlayer - 1) {
                System.out.println();
            }
        }
    }
}