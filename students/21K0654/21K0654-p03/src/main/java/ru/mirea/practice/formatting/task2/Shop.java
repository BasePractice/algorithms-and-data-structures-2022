package ru.mirea.practice.formatting.task2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Locale.setDefault(Locale.CHINESE);
        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        Scanner sc = new Scanner(System.in);
        while (true){
        System.out.println("Введите сумму перевода");
        Double value= sc.nextDouble();
        System.out.println("Выберите в какой валюте произвести операцию: dollars, euros, yen, yuan");
        String cur=sc.next();
            switch (cur) {
                case "dollars": {
                    System.out.println(numberFormat1.format(value));
                    break;
                }
                case "euros": {
                    System.out.println(numberFormat2.format(value));
                    break;
                }
                case "yen": {
                    System.out.println(numberFormat3.format(value));
                    break;
                }
                case "yuan": {
                    System.out.println(numberFormat4.format(value));
                    break;
                }
                default: {
                    System.out.println("Ошибка ввода");
                }
            }
        }
    }
}