package ru.mirea.practice.Ex9;

import java.util.Collections;
import java.util.LinkedList;

public class Poker {
    public static void main(String[] args) {
        if (args.length > 0) {
            int n = Integer.parseInt(args[0]);
            if (n > 6) {
                System.out.println("to much players");
            } else {
                LinkedList<String> deck = new LinkedList<>();
                String[] suits = {"spades", "hearts", "clubs", "diamonds"};
                String[] ranks = {"ace", "jack", "queen", "king", "ten", "nine", "eight", "seven",
                        "six", "five", "four", "three", "two"};
                for (String suit: suits) {
                    for (String rank: ranks) {
                        deck.add(rank + " of " + suit);
                    }
                }
                Collections.shuffle(deck);

                for (int i=0;i<n*5;i++) {
                    System.out.println(deck.get(i));
                    if ((i + 1) % 5 == 0) {
                        System.out.println();
                    }
                }
            }
        } else {
            System.out.println("wrong argument value");
        }
    }
}
