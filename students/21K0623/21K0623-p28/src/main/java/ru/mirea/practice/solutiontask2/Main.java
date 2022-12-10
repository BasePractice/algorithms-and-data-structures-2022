package ru.mirea.practice.solutiontask2;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Maps<String, String> temp = new Maps<>();
        System.out.println(temp.createMap());
        System.out.println(temp.getSameFirstLastNameCount(true));
        System.out.println(temp.getSameFirstLastNameCount(false));
    }
}
