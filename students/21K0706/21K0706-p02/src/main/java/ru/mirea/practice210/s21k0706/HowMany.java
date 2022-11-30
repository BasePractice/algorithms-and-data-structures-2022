package ru.mirea.practice210.s21k0706;

import java.util.Scanner;

public final class HowMany {
    private HowMany() {

    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a few words separated by a space: ");
            String sentence = in.nextLine();
            int n = 0;
            if (sentence.length() != 0) {
                n++;
                for (int i = 0; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == ' ') {
                        n++;
                    }
                }
            }
            System.out.println("You have entered " + n + " words");
        }
    }
}
