package ru.mirea.practice.solutiontask3;

import java.util.Hashtable;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Hashtable<Double, Double> table = new Hashtable<>();
        table.put(1.0, 1.0);
        System.out.println(table);
    }
}
