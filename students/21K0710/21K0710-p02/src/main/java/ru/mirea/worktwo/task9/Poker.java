package ru.mirea.worktwo.task9;

import java.util.Scanner;

public final class Poker {
    private Poker() {
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Deck deck = new Deck();
            deck.deckCreate();
            deck.shuffle();
            int n = sc.nextInt();
            if (n <= 8) {
                deck.give(n);
            }
        }
    }
}
