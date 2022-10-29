package ru.mirea.practice.s21k0647.formatstring.converter;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number you want to translate ");
        System.out.println("converted from code land");
        System.out.println("In language code");
        System.out.println("In land code");
        System.out.println("Exchange rate from currency to currency");
        CurrencyConverter app = new CurrencyConverter(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine());
        app.formated();
        System.out.print(app.toString());
    }
}
