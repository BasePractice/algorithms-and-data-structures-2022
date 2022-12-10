package ru.mirea.practice.task1;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            StringHandler stringHandler = new StringHandler();
            stringHandler.parsing(in.nextLine());
        }
    }
}
