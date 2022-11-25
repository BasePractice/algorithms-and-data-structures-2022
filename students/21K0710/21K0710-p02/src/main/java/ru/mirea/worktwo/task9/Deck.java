package ru.mirea.worktwo.task9;

import java.util.Random;

public class Deck {
    Card[] deck = new Card[52];
    String[] suits = new String[]{"Diamonds", "Hearts", "Clubs", "Spades"};
    String[] ranks = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    public void deckCreate() {
        int h = 0;
        for (int i = 0; i < 4; i++) {
            for (int g = 0; g < 13; g++) {
                Card temp = new Card(suits[i], ranks[g]);
                deck[h] = temp;
                h++;
            }
        }
    }

    public void shuffle() {
        int index;
        Card temp;
        Random random = new Random();
        for (int i = deck.length - 1; i >= 0; i--) {
            index = random.nextInt(i + 1);
            temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }

    public void give(int n) {
        int h = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("[");
            for (int g = 0; g < 5; g++) {
                System.out.print(deck[h]);
                h++;
            }
            System.out.println("]");
        }
    }
}
