package ru.mirea.practice.s21k0709.task1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public abstract class Tester {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(324);
        integerSet.add(300);
        integerSet.add(400);
        integerSet.add(500);
        Set<Integer> treeSet = new TreeSet<>(integerSet);
        System.out.println("Hash set " + integerSet);
        System.out.println("Tree set " + treeSet);
    }
}
