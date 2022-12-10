package ru.mirea.practice.solutiontask1;

import java.util.HashSet;
import java.util.TreeSet;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();
        hash.add("geeks");
        hash.add("practice");
        hash.add("contribute");
        hash.add("ide");
        System.out.println("Original HashSet: " + hash + " " + hash.getClass().getName());
        TreeSet<String> tree = new TreeSet<>(hash);
        System.out.println("HashSet to TreeSet: " + tree + " " + tree.getClass().getName());
    }
}
