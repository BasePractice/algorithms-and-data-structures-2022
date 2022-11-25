package ru.mirea.practice.solutiontask9;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Poker {
    int persons;
    private String[] finalcards;
    private final String[] allcards = new String[52];

    public Poker(int persons) {
        this.persons = persons;

        String[] suit = {"Червы", "Бубны", "Трефы", "Пики"};
        String[] seniority = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "В", "Д", "К", "Т"};
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < seniority.length; j++) {
                this.allcards[i * 13 + j] = seniority[j] + " " + suit[i];
            }
        }
    }

    public boolean checkIn(String finalcard) {
        for (int i = 0; i < (this.persons * 5); i++) {
            if (Objects.equals(this.finalcards[i], finalcard)) {
                return true;
            }
        }
        return false;
    }

    public void createRandomCards() {
        Random random = new Random();
        this.finalcards = new String[persons * 5];
        String finalcard = "";
        for (int i = 0; i < (this.persons * 5); i++) {
            finalcard = allcards[random.nextInt(this.allcards.length)];
            while (checkIn(finalcard)) {
                finalcard = allcards[random.nextInt(this.allcards.length)];
            }
            this.finalcards[i] = finalcard;
        }
    }

    @Override
    public String toString() {
        StringBuilder toreturn = new StringBuilder();
        for (int i = 0; i < (this.persons); i++) {
            toreturn.append("--- ").append(i + 1).append(" игрок --- \n");
            for (int j = 0; j < 5; j++) {
                toreturn.append(this.finalcards[i * 5 + j]).append("\n");
            }
            toreturn.append("\n");
        }
        return toreturn.toString();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите кол-во игроков: ");
            int count = sc.nextInt();
            while (count < 2 || count > 10) {
                System.out.println("Введите кол-во игроков: ");
                count = sc.nextInt();
            }
            Poker cards = new Poker(count);
            cards.createRandomCards();
            System.out.println(cards);
        }
    }
}
