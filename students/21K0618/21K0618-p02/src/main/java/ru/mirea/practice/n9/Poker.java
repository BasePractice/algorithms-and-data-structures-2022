package ru.mirea.practice.n9;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

abstract class Poker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            Random rand = new Random();
            String[][][] deck = new String[4][2][13];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 2; j++) {
                    if (j == 0) {
                        if (i == 0) {
                            deck[i][j][0] = "Червы";
                        } else if (i == 1) {
                            deck[i][j][0] = "Пики";
                        } else if (i == 2) {
                            deck[i][j][0] = "Крести";
                        } else if (i == 3) {
                            deck[i][j][0] = "Буби";
                        }
                    } else {
                        for (int k = 0; k < 14; k++) {
                            if (k == 0) {
                                deck[i][j][k] = "Туз ";
                            } else if (k == 1) {
                                deck[i][j][k] = "Валет ";
                            } else if (k == 2) {
                                deck[i][j][k] = "2 ";
                            } else if (k == 3) {
                                deck[i][j][k] = "3 ";
                            } else if (k == 4) {
                                deck[i][j][k] = "4 ";
                            } else if (k == 5) {
                                deck[i][j][k] = "5 ";
                            } else if (k == 6) {
                                deck[i][j][k] = "6 ";
                            } else if (k == 7) {
                                deck[i][j][k] = "7 ";
                            } else if (k == 8) {
                                deck[i][j][k] = "8 ";
                            } else if (k == 9) {
                                deck[i][j][k] = "9 ";
                            } else if (k == 10) {
                                deck[i][j][k] = "10 ";
                            } else if (k == 11) {
                                deck[i][j][k] = "Дама ";
                            } else if (k == 12) {
                                deck[i][j][k] = "Король ";
                            }
                        }
                    }
                }

            }
            System.out.println("Введите количество игроков. Играть может от 2 до 10 человек!");
            int selecter = scan.nextInt();
            while (selecter < 2 && selecter > 10) {
                System.out.println("Введено неверное количество. В покер играет от 2 до 10 человек!!!"
                        + "\nВведите число игроков ещё раз");
                selecter = scan.nextInt();
            }
            String[][] kaptbI = new String[selecter][5];
            int type;
            int mastb;
            for (selecter = 0; selecter < kaptbI.length; selecter++) {
                for (int k = 0; k < 5; k++) {
                    type = Math.abs(rand.nextInt() % 13);
                    mastb = Math.abs(rand.nextInt() % 4);
                    while (Objects.equals(deck[mastb][0][0], "")) {
                        mastb = Math.abs(rand.nextInt() % 4);
                    }
                    while (Objects.equals(deck[mastb][1][type], "")) {
                        type = Math.abs(rand.nextInt() % 13);
                    }
                    kaptbI[selecter][k] = deck[mastb][1][type] + deck[mastb][0][0];
                    deck[mastb][1][type] = "";
                    if (Objects.equals(deck[mastb][1][0], "") && Objects.equals(deck[mastb][1][1], "")
                            && Objects.equals(deck[mastb][1][2], "") && Objects.equals(deck[mastb][1][3], "")
                            && Objects.equals(deck[mastb][1][4], "") && Objects.equals(deck[mastb][1][5], "")
                            && Objects.equals(deck[mastb][1][6], "") && Objects.equals(deck[mastb][1][7], "")
                            && Objects.equals(deck[mastb][1][8], "") && Objects.equals(deck[mastb][1][9], "")
                            && Objects.equals(deck[mastb][1][10], "") && Objects.equals(deck[mastb][1][11], "")
                            && Objects.equals(deck[mastb][1][12], "")) {
                        deck[mastb][0][0] = "";
                    }
                }
                System.out.println("\nИгрок №" + (selecter + 1) + " получил карты:");
                for (int k = 0; k < 5; k++) {
                    System.out.println(kaptbI[selecter][k]);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scan.nextInt();
        } finally {
            scan.close();
        }
    }
}