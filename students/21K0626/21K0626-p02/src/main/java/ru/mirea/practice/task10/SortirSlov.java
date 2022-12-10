package ru.mirea.practice.task10;

import java.util.Scanner;

public abstract class SortirSlov {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String line = sc.nextLine();
            int k = 0;
            if (line.length() != 0) {
                k++;
            }
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == ' ') {
                    k++;
                }
            }
            System.out.println("Value: " + k);
            sc.close();
        }
    }
}
