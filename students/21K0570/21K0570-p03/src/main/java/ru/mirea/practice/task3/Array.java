package ru.mirea.practice.task3;

import java.util.Random;

public final class Array {
    private Array() {}

    public static void main(String[] args) {
        int[] mass = new int[4];
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            mass[i] = rand.nextInt(89) + 10;
            System.out.print(mass[i] + ", ");
        }
        boolean f = false;
        for (int i = 1; i < 4; i++) {
            if (mass[i - 1] > mass[i]) {
                f = true;
                break;
            }
        }
        if (!f) {
            System.out.println('\n' + "Возрастающая последовательность");
        } else {
            System.out.println("Невозрастающая последовательность");
        }
    }
}
