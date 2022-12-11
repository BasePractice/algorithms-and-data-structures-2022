package ru.mirea.practice.task2;

import java.util.Scanner;

public abstract class NumberOfUnits {
    public static int recurs() {
        try (Scanner in = new Scanner(System.in)) {
            int valueFirst = in.nextInt();
            if (valueFirst == 1) {
                int valueSecond = in.nextInt();
                if (valueSecond == 1) {
                    return recurs() + valueFirst + valueSecond;
                } else {
                    int valueThird = in.nextInt();
                    if (valueThird == 1) {
                        return recurs() + valueFirst + valueSecond + valueThird;
                    } else {
                        return valueFirst + valueSecond + valueThird;
                    }
                }
            } else {
                int valueSecond = in.nextInt();
                if (valueSecond == 1) {
                    return recurs() + valueFirst + valueSecond;
                } else {
                    return valueFirst + valueSecond;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(recurs());
    }
}
