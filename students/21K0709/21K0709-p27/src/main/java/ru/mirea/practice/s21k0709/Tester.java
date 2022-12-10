package ru.mirea.practice.s21k0709;

public abstract class Tester {
    public static void main(String[] args) {
        HashTab<String, Integer> hashTab = new HashTab<>();
        hashTab.hashAdd("one", 1);
        hashTab.hashAdd("three", 3);
        hashTab.hashAdd("five", 5);
        hashTab.hashAdd("seven", 7);
        hashTab.hashAdd("nine", 9);
        hashTab.hashAdd("eleven", 11);
        hashTab.hashAdd("thirteen", 13);
        hashTab.hashAdd("fifteen", 15);
        hashTab.hashAdd("seventeen", 17);
        hashTab.hashAdd("nineteen", 19);
        hashTab.hashValues();
        System.out.println(hashTab.hashtableHash("three"));
        hashTab.hashDelete("one");
        hashTab.hashValues();

    }
}