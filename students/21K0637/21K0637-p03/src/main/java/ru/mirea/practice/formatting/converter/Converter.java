package ru.mirea.practice.formatting.converter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите валюту:\n1-$\n2-€\n3-¥\n4-£");
        int inCurrency = sc.nextInt();
        System.out.println("Введите сумму");
        float amount = sc.nextInt();

        switch (inCurrency) {
            case 1:
                System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(amount) +  " = "
                        + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount * 1.01));

                System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(amount) +  " = "
                        + NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount * 7.25));

                System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(amount) +  " = "
                        + NumberFormat.getCurrencyInstance(Locale.UK).format(amount * 0.88456));
                break;
            case 2:
                System.out.println(NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount) +  " = "
                        + NumberFormat.getCurrencyInstance(Locale.US).format(amount * 0.9854));

                System.out.println(NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount) +  " = "
                        + NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount * 7.11));

                System.out.println(NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount) +  " = "
                        + NumberFormat.getCurrencyInstance(Locale.UK).format(amount * 0.85795));
                break;
            case 3:
                System.out.println(NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount) +  " = "
                        + NumberFormat.getCurrencyInstance(Locale.US).format(amount * 0.13792));

                System.out.println(NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount) +  " = "
                        + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount * 0.14059));

                System.out.println(NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount) +  " = "
                        + NumberFormat.getCurrencyInstance(Locale.UK).format(amount * 0.12062));
                break;
            case 4:
                System.out.println(NumberFormat.getCurrencyInstance(Locale.UK).format(amount) +  " = "
                        + NumberFormat.getCurrencyInstance(Locale.US).format(amount * 1.12));

                System.out.println(NumberFormat.getCurrencyInstance(Locale.UK).format(amount) +  " = "
                        + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount * 1.16));

                System.out.println(NumberFormat.getCurrencyInstance(Locale.UK).format(amount) +  " = "
                        + NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount * 8.24));
                break;
            default:
                break;
        }
    }
}
