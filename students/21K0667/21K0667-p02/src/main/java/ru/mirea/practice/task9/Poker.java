package ru.mirea.practice.task9;

import java.util.Scanner;

abstract class Poker {

    public static void main(String[] args) {


        int players;

        String[] suits = {
            "Пик", "Бубен", "Черв", "Треф"
        };

        String[] rank = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Валет", "Королева", "Король", "Туз"
        };
        int numberOfCards = suits.length * rank.length;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите кол-во игроков: ");
            players = sc.nextInt();
        }

        String[] deck = new String[numberOfCards];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }

        }
        for (int i = 0; i < numberOfCards; i++) {
            int r = (int) (Math.random() * numberOfCards);
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        int cards = 5;
        for (int i = 0; i < players * cards; i++) {
            System.out.println(deck[i]);
            if ((i % cards == cards - 1 || i == 0) && i < players * cards - 1) {
                System.out.println("\n" + ((i + 6) / 5) + " игрок: ");
            }


        }
    }

}

