package ru.mirea.practice.task5;

import java.util.Arrays;

abstract class Args {
    public static void main(String[] args) {
        System.out.println("Arr: " + Arrays.toString(args));
        for (String el : args) {
            System.out.println(el);
        }
    }
}
