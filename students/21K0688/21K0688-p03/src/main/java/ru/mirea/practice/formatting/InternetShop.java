package ru.mirea.practice.formatting;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

abstract class InternetShop {
    public static void main(String[] args) {
        double socks;
        double toy;
        double milk;
        socks = 3.5;
        toy = 10.99;
        milk = 1.3;

        System.out.println("What currency do you want to pay with: ");
        System.out.println("1) Dollar 2) Euro 3) Yuan");
        try (Scanner scanner = new Scanner(System.in)) {
            int choiceOfCurrency = scanner.nextInt();

            switch (choiceOfCurrency) {
                case 1:
                    NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
                    System.out.println(numberFormat1.format(socks) + " are socks");
                    System.out.println(numberFormat1.format(toy) + " is toy");
                    System.out.println(numberFormat1.format(milk) + " is milk");
                    break;
                case 2:
                    socks = socks / 0.9957;
                    toy = toy / 0.9957;
                    milk = milk / 0.9957;
                    NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                    System.out.println(numberFormat2.format(socks) + " are socks");
                    System.out.println(numberFormat2.format(toy) + " is toy");
                    System.out.println(numberFormat2.format(milk) + " is milk");
                    break;
                case 3:
                    socks = socks * 7.37;
                    toy = toy * 7.37;
                    milk = milk * 7.37;
                    NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
                    System.out.println(numberFormat3.format(socks) + " are socks");
                    System.out.println(numberFormat3.format(toy) + " is toy");
                    System.out.println(numberFormat3.format(milk) + " is milk");
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
        }
    }
}
