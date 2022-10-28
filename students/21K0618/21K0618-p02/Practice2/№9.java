package Practice2;

import java.util.Scanner;
import java.util.Random;

class Poker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String[][][] Deck = { {{"Червы"}, {"Туз ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 ", "Валет ", "Дама ", "Король "}},
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
        String[][] KAPTbI = new String[selecter][5];
        int type; int mastb;
        for (selecter = 0; selecter < KAPTbI.length; selecter++) {
            for (int k = 0; k < 5; k++) {
                type = rand.nextInt(0, 13);
                mastb = rand.nextInt(0, 4);
                while (Deck[mastb][0][0] == "")
                {
                    mastb = rand.nextInt(0, 4);
                }
                while (Deck[mastb][1][type] == "")
                {
                    type = rand.nextInt(0, 13);
                }
                KAPTbI[selecter][k] = Deck[mastb][1][type] + Deck[mastb][0][0];
                Deck[mastb][1][type] = "";
                if (Deck[mastb][1][0] == "" && Deck[mastb][1][1] == "" && Deck[mastb][1][2] == "" && Deck[mastb][1][3] == "" &&
                        Deck[mastb][1][4] == "" && Deck[mastb][1][5] == "" &&  Deck[mastb][1][6] == "" && Deck[mastb][1][7] == "" &&
                        Deck[mastb][1][8] == "" &&  Deck[mastb][1][9] == "" &&  Deck[mastb][1][10] == "" &&  Deck[mastb][1][11] == "" &&
                        Deck[mastb][1][12] == "")
                {
                    Deck[mastb][0][0] = "";
                }
            }
            System.out.println("\nИгрок №" + (selecter+1) + " получил карты:");
            for (int k = 0; k < 5; k++) System.out.println(KAPTbI[selecter][k]);
        }
    }
}