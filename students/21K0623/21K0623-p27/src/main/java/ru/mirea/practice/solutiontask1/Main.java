package ru.mirea.practice.solutiontask1;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Hashtab<String, Integer> hashtab = new Hashtab<>();
        hashtab.hashAdd("Aaaaa", 1);
        hashtab.hashAdd("BBBBB", 2);
        hashtab.hashAdd("GGGGG", 3);
        hashtab.hashAdd("DDDDD", 4);
        hashtab.hashAdd("EEEEE", 5);
        hashtab.hashAdd("JJJJJ", 6);
        hashtab.hashAdd("ZZZZZ", 7);
        hashtab.hashAdd("IIIII", 8);
        hashtab.hashAdd("OOOOO", 9);
        hashtab.hashAdd("TTTTT", 10);

        System.out.println(hashtab.hashLookup("Aaaaa"));
        hashtab.hashDelete("Aaaaa");
        System.out.println(hashtab.hashLookup("Aaaaa"));

        System.out.println(hashtab.hashLookup("JJJJJ"));
        hashtab.hashAdd("JJJJJ", 8);
        System.out.println(hashtab.hashLookup("JJJJJ"));
    }
}
