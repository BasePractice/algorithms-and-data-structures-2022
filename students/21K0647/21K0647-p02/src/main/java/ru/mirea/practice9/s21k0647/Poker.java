package ru.mirea.practice9.s21k0647;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public final class Poker {
    private Poker() {

    }

    public static void main(String[] args) {
        ArrayList<Karta> koloda = new ArrayList<>();

        for (int i = 0; i < 52; i++) {
            Karta c = new Karta();
            if (i < 9) {
                c.weight = String.valueOf(i + 2);
                c.mast = "H";
            }
            if (i > 8 && i < 18) {
                c.weight = String.valueOf(i - 7);
                c.mast = "D";
            }
            if (i > 17 && i < 27) {
                c.weight = String.valueOf(i - 16);
                c.mast = "C";
            }
            if (i > 26 && i < 36) {
                c.weight = String.valueOf(i - 25);
                c.mast = "S";
            }
            if (i > 35 && i < 40) {
                c.mast = "S";
            }
            if (i > 39 && i < 44) {
                c.mast = "C";
            }
            if (i > 43 && i < 48) {
                c.mast = "D";
            }
            if (i > 47 && i < 52) {
                c.mast = "H";
            }
            if (i > 35) {
                int k = i % 4;
                if (k == 0) {
                    c.weight = "J";
                }
                if (k == 1) {
                    c.weight = "Q";
                }
                if (k == 2) {
                    c.weight = "K";
                }
                if (k == 3) {
                    c.weight = "A";
                }
            }
            koloda.add(c);
        }

        try (Scanner sourse = new Scanner(System.in)) {
            int n = sourse.nextInt();
            if (n > 10) {
                System.out.println("Sorry! There are too many of you. (");
            } else {
                String[] nman = new String[n];
                Random random = new Random();

                for (int j = 0; j < n; ++j) {
                    nman[j] = "";
                    for (int i = 0; i < 5; ++i) {
                        Karta x = koloda.get(random.nextInt(koloda.size()));
                        nman[j] += x.weight;
                        nman[j] += x.mast;
                        nman[j] += "\t";
                        koloda.remove(x);
                    }
                }
                int i = 1;
                for (String x : nman) {
                    System.out.println(i + " Player\n" + x + "\n");
                    i++;
                }
            }
        }
    }
}
