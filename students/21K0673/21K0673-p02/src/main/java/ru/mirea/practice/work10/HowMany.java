package ru.mirea.practice.work10;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

abstract class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            while (scanner.hasNextLine()) {
                String[] tokens = scanner.nextLine().split("\\s");
                System.out.println(Arrays.toString(tokens) + "\n" + tokens.length + " words");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scanner.nextInt();
        } finally {
            scanner.close();
        }
    }
}
