package ru.mirea.practice.work10;

import java.util.Arrays;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String[] tokens = scanner.nextLine().split("\\s");
            System.out.println(Arrays.toString(tokens) + "\n" + tokens.length + " words");
        }

        scanner.close();
    }
}
