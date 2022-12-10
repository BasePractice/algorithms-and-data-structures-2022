package ru.mirea.practice.task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Poker {
    int cardsPlay = 5;
    int players;
    String[] mast = {"Пики", "Трефы", "Бубны", "Черви"};
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
    int valueCards = mast.length * rank.length;
    String[] kolod = new String[valueCards];

    public Poker(int players) {
        this.players = players;
    }
    public String[] addKoloda() {
        int k = 0;
        for (int i = 0; i < this.rank.length; i++) {
            for (int j = 0; j < this.mast.length; j++) {
                this.kolod[k] = rank[i] + " " + mast[j];
                k++;
            }
        }
        return kolod;
    }

    public String[] sortKoloda() {
        List<Integer> iterat = new ArrayList<Integer>();
        for (int i = 0; i < this.valueCards; i++) {
            int r = (int) (Math.random() * 52);
            if (i == r & iterat.contains(r)) {
                i--;
            } else {
                String temp = kolod[i];
                kolod[i] = kolod[r];
                kolod[r] = temp;
            }
            iterat.add(r);

        }
        System.out.println(Arrays.toString(kolod));
        return kolod;


    }

    public void razdacha() {
        int k = 0;
        int j = 5;
        int t = 0;
        int l = 2;
        System.out.println("Игрок 1");
        for (int i = 0; t < j; i++) {
            System.out.print(kolod[i] + "; ");
            k++;
            if (k == 5) {
                t++;
                if (t == players) {
                    break;
                }
                System.out.println('\n');
                System.out.println("Игрок " + l);
                k = 0;
                l++;


            }
        }

    }
}
