package ru.mirea.practice.s21k0647.zad3;

import java.util.Hashtable;

import java.util.Random;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        Hashtable<Double, Object> a = new Hashtable<>();
        Random r = new Random();
        Object k = "a";
        for (int i = 0; i < 10; i++) {
            a.put(r.nextDouble(), k);
            k += "ba";
        }
        for (Double it: a.keySet()) {
            System.out.println(it + ": " + a.get(it));
        }

    }
}
