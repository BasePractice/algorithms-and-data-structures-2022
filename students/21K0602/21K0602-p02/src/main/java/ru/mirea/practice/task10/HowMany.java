package ru.mirea.practice.task10;

import java.util.Scanner;

public abstract class HowMany {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println(in.nextLine().split("\\s+").length);
        }
    }
}
