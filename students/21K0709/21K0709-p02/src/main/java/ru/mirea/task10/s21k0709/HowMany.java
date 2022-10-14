package ru.mirea.task10.s21k0709;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку слов: ");
        int col = 1;
        String name;
        name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                col++;
            }
        }
        System.out.print("Кол-во слов: " + col);
    }
}
