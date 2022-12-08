package ru.mirea.practice.n1to3;

import java.util.Random;

abstract class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Hashtab<String, Integer> hashtab = new Hashtab<>();
        hashtab.hashtabAdd("Good", rand.nextInt(10));
        hashtab.hashtabAdd("Game", rand.nextInt(10));
        hashtab.hashtabAdd("Well", rand.nextInt(10));
        hashtab.hashtabAdd("Played", rand.nextInt(10));
        hashtab.hashtabAdd("ZXC", rand.nextInt(10));
        hashtab.hashtabAdd("Ghoul", 7);
        hashtab.hashtabAdd("1000-7", rand.nextInt(10));
        hashtab.hashtabAdd("Shadow", rand.nextInt(10));
        hashtab.hashtabAdd("Fiend", rand.nextInt(10));
        hashtab.print();
        hashtab.hashtabDelete("Ghoul");
        hashtab.print();
        System.out.println(hashtab.hashtabLookup("ZXC"));
        hashtab.clear();
    }
}
