package ru.mirea.practice29.s21k0706;

import java.util.Scanner;

public final class Poker {
    private Poker() {

    }

    public static void main(String[] args) {
        int col = 5;
        int players;
        String[] a = {"Peak", "Tambourine", "Hearts", "Clubs"};
        String[] b = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int n = a.length * b.length;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter number of players: ");
            players = in.nextInt();
            if (col * players > n || players == 0 || players < 0) {
                System.out.println("Error!");
                System.exit(0);
            }
            String[] deck = new String[n];
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    deck[a.length * i + j] = b[i] + " " + a[j];
                }
            }
            for (int i = 0; i < n; i++) {
                int k = i + (int) (Math.random() * (n - i));
                String l = deck[k];
                deck[k] = deck[i];
                deck[i] = l;
            }
            for (int i = 0; i < players * col; i++) {
                System.out.println(deck[i]);
                if (i % col == col - 1) {
                    System.out.println();
                }
            }
        }
    }
}
