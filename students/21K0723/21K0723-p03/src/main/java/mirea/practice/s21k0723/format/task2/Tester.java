package mirea.practice.s21k0723.format.task2;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) {
        ArrayList<Shop> shops = new ArrayList<>();
        Shop prod1 = new Shop("prod1", 123);
        shops.add(prod1);
        Shop prod2 = new Shop("prod2", 56);
        shops.add(prod2);
        Shop prod3 = new Shop("prod3", 1000);
        shops.add(prod3);
        Shop prod4 = new Shop("prod4", 532);
        shops.add(prod4);
        Shop prod5 = new Shop("prod5", 976);
        shops.add(prod5);

        for (Shop x: shops) {
            System.out.println(x.name + "\t" + x.price);
        }

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Add product to cart?");
            String s = scanner.nextLine();
            ArrayList<Shop> shopArrayList = new ArrayList<>();
            float sumBasket = 0;
            while ("yes".equals(s)) {
                String s1 = scanner.next();
                for (Shop x : shops) {
                    if (s1.equals(x.name)) {
                        shopArrayList.add(x);
                        sumBasket += x.price;
                    }
                }
                System.out.println("Add product to cart?");
                s = scanner.next();
            }

            Locale.setDefault(new Locale("ru", "RU"));
            NumberFormat format = NumberFormat.getCurrencyInstance();
            System.out.println("Amount in rubles: " + format.format(sumBasket));
            System.out.println("Convert to another currency?");
            String conv = scanner.next();
            if ("yes".equals(conv)) {
                System.out.print("Enter the currency language code: ");
                String codeLang = scanner.next();
                System.out.print("Enter the country code of the currency: ");
                String codeLand = scanner.next();
                System.out.print("Enter the course");
                double v = scanner.nextDouble();
                Converter converter = new Converter(codeLang, codeLand, v);
                System.out.println(converter.converter(codeLang, codeLand, v, sumBasket));
            }
        }
    }
}