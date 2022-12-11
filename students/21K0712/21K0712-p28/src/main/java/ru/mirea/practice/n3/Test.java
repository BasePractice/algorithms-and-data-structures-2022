package ru.mirea.practice.n3;

import java.util.Hashtable;

abstract class Test {
    public static void main(String[] args) {
        Hashtable<Double, Double> table = new Hashtable<>();
        table.put(2.28, 1.337);
        System.out.println(table);
    }
}
