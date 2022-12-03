package ru.mirea.practice;

import java.util.Scanner;
import java.util.Random;

class Poker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String[][][] deck = { {{"Червы"}, {"Туз ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 ", "Валет ", "Дама ", "Король "}},
                {{"Пики"}, {"Туз ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 ", "Валет ", "Дама ", "Король "}},
                {{"Крести"}, {"Туз ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 ", "Валет ", "Дама ", "Король "}},
                {{"Буби"}, {"Туз ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 ", "Валет ", "Дама ", "Король "}}};
        System.out.println("Введите количество игроков. Играть может от 2 до 10 человек!");
        int selecter = scan.nextInt();
        while (selecter < 2 && selecter > 10) {
            System.out.println("Введено неверное количество. В покер играет от 2 до 10 человек!!!" +
                    "\nВведите число игроков ещё раз");
            selecter = scan.nextInt();
        }
        String[][] kaptbI = new String[selecter][5];
        int type; int mastb;
        for (selecter = 0; selecter < kaptbI.length; selecter++) {
            for (int k = 0; k < 5; k++) {
                type = Math.abs(rand.nextInt() % 13);
                mastb = Math.abs(rand.nextInt() % 4);
                while (deck[mastb][0][0] == "")
                {
                    mastb = Math.abs(rand.nextInt() % 4);
                }
                while (deck[mastb][1][type] == "")
                {
                    type = Math.abs(rand.nextInt() % 13);
                }
                kaptbI[selecter][k] = deck[mastb][1][type] + deck[mastb][0][0];
                deck[mastb][1][type] = "";
                if (deck[mastb][1][0] == "" && deck[mastb][1][1] == "" && deck[mastb][1][2] == "" && deck[mastb][1][3] == "" &&
                        deck[mastb][1][4] == "" && deck[mastb][1][5] == "" &&  deck[mastb][1][6] == "" && deck[mastb][1][7] == "" &&
                        deck[mastb][1][8] == "" &&  deck[mastb][1][9] == "" &&  deck[mastb][1][10] == "" &&  deck[mastb][1][11] == "" &&
                        deck[mastb][1][12] == "")
                {
                    deck[mastb][0][0] = "";
                }
            }
            System.out.println("\nИгрок №" + (selecter+1) + " получил карты:");
            for (int k = 0; k < 5; k++) System.out.println(kaptbI[selecter][k]);
        }
    }
}