package ru.mirea.practice.solutiontask10;

import java.util.Scanner;

public final class HowMany {
    private HowMany() {}

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите предложение: ");
            String words = sc.nextLine();
            int count = 0;
            if (words.length() == 1 && words.charAt(0) == ' ') {
                System.out.println("Слов нет");
            } else {
                for (int i = 1; i < words.length() - 1; i++) {
                    if (words.charAt(i) == ' ' && words.charAt(i - 1) != ' ' && words.charAt(i + 1) != ' ') {
                        count++;
                    }
                }
                System.out.println("Кол-во слов: " + (count + 1));
            }
        }
    }
}
