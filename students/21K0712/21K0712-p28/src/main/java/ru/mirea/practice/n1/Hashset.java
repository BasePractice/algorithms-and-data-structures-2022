package ru.mirea.practice.n1;

import java.util.HashSet;
import java.util.TreeSet;

abstract class Hashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("ZXC");
        set.add("1000-7");
        set.add("Dead");
        set.add("Inside");
        System.out.println(set);
        TreeSet<String> treeset = new TreeSet<>(set);
        System.out.println(treeset);
    }
}
