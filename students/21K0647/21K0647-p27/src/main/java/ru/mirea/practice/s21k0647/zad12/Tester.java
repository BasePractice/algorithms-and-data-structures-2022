package ru.mirea.practice.s21k0647.zad12;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        Diction dic = new Diction();
        dic.hashtabHash();
        dic.hashtabInit();
        dic.hashtabAdd("Deep Purple", "Smoke On The Water");
        dic.hashtabAdd("Queen ", "We Will Rock You");
        dic.hashtabAdd("AC/DC", "Highway to Hell");
        dic.hashtabAdd("Metallica ", "Nothing Else Matters");
        dic.hashtabAdd("U2", "Sunday Bloody Sunday");
        dic.hashtabAdd("Black Sabbath", "Paranoid");
        dic.hashtabAdd("Eagles", "Hotel California");
        dic.hashtabAdd("Guns N’Roses", "Welcome To the Jungle");
        dic.hashtabAdd("Scorpions", "Still Loving You");
        dic.hashtabAdd("The Doors", "Light My Fire");
        dic.hashtabAdd("Morgenstern", "gfgegfef");
        dic.print();
        System.out.println();
        System.out.println(dic.hashtabLookup("Eagles"));
        System.out.println();
        dic.hashtabDelete("Morgenstern");

    }
}
