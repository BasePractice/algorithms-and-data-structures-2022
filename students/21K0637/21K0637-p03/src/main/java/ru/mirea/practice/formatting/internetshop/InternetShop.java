package ru.mirea.practice.formatting.internetshop;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public abstract class InternetShop {
    static Product[] catalog = {new Product("Молоко", 89),
        new Product("Печенье", 58),
        new Product("Шоколад", 99),
        new Product("Мюсли", 143)};

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("Доступные товары(Цена в US): ");
        for (int i = 0; i < catalog.length; i++) {
            System.out.println(i + 1 + " " + catalog[i]);
        }

        System.out.println("Выберете товар: ");
        int value;
        int c;
        try (Scanner sc = new Scanner(System.in)) {
            value = sc.nextInt() + 1;

            System.out.println("Выберете валюту: \n1.$\n2.€\n3.¥\n4.£");
            c = sc.nextInt();
        }

        switch (c) {
            case 1:
                System.out.print("С вас " + NumberFormat.getCurrencyInstance().format(catalog[value - 1].getPrice()));
                break;
            case 2:
                System.out.print("С вас " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(catalog[value - 1].getPrice() * 1.01));
                break;
            case 3:
                System.out.print("С вас " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(catalog[value - 1].getPrice() * 7.25));
                break;
            case 4:
                System.out.print("С вас " + NumberFormat.getCurrencyInstance(Locale.UK).format(catalog[value - 1].getPrice() * 0.88456));
                break;
            default:
                System.out.println("Введена неправильная валюта");
                break;
        }
    }
}
