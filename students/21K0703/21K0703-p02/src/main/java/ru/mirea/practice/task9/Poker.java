package ru.mirea.practice.task9;

import java.util.Scanner;

abstract class Poker {
    public static void main(String[] args) {
        String[] cards = new String[]{"2ч", "3ч", "4ч", "5ч", "6ч", "7ч", "8ч", "9ч", "10ч", "Вч", "Дч", "Кч", "Тч",
            "2б", "3б", "4б", "5б", "6б", "7б", "8б", "9б", "10б", "Вб", "Дб", "Кб", "Тб",
            "2п", "3п", "4п", "5п", "6п", "7п", "8п", "9п", "10п", "Вп", "Дп", "Кп", "Тп",
            "2к", "3к", "4к", "5к", "6к", "7к", "8к", "9к", "10к", "Вк", "Дк", "Кк", "Тк"};
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            System.out.print("Введите кол-во игроков: ");
            n = sc.nextInt();
            if (n > 10) {
                System.out.println("Error! Слишком много игроков!");
            }
            int max = 51;

            int i;
            int count = 0;
            for (int j = 0; j < n; ) {
                for (int k = 0; k < 5 * n; ) {
                    i = rnd(max);
                    if (!" ".equals(cards[i])) {
                        System.out.print(cards[i] + " ");
                        cards[i] = " ";
                        j++;
                        k++;
                        count++;
                        if (count == 5) {
                            System.out.print("\n");
                            count = 0;
                        }
                    }
                }
            }
        }
    }

    public static int rnd(int max) {
        return (int) (Math.random() * ++max);
    }
}
