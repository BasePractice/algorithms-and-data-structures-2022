package ru.mirea.practice.s21k0647.formatstring.internetshop;


import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        List<Product> c = new ArrayList<>();
        Product a1 = new Product("Product1", 123);
        c.add(a1);
        Product a2 = new Product("Product2", 56);
        c.add(a2);
        Product a3 = new Product("Product3", 1000);
        c.add(a3);
        Product a4 = new Product("Product4", 532);
        c.add(a4);
        Product a5 = new Product("Product5", 976);
        c.add(a5);

        for (Product x: c) {
            System.out.println(x.name + "\t" + x.price);
        }

        try (Scanner source = new Scanner(System.in)) {
            System.out.println("Add product to cart?");
            String s = source.nextLine();
            List<Product> basket = new ArrayList<>();
            float sumBasket = 0;
            while ("yes".equals(s)) {
                String s1 = source.next();
                for (Product x : c) {
                    if (s1.equals(x.name)) {
                        basket.add(x);
                        sumBasket += x.price;
                    }
                }
                System.out.println("Add product to cart?");
                s = source.next();
            }

            Locale.setDefault(new Locale("ru", "RU"));
            NumberFormat format = NumberFormat.getCurrencyInstance();
            System.out.println("Amount in rubles: " + format.format(sumBasket));
            System.out.println("Convert to another currency?");
            String conv = source.next();
            if ("yes".equals(conv)) {
                System.out.print("Enter the currency language code: ");
                String kodlang = source.next();
                System.out.print("Enter the country code of the currency: ");
                String kodLand = source.next();
                System.out.print("Enter the course");
                double course = source.nextDouble();
                System.out.println(converter(kodlang, kodLand, course, sumBasket));
            }
        }
    }

    public static String converter(String kodLang, String kodLand, Double course, float sumBasket) {
        Locale sumFormat2 = new Locale(kodLang, kodLand);
        NumberFormat sumformat2 = NumberFormat.getCurrencyInstance(sumFormat2);
        return "Amount in " + sumFormat2.getISO3Country() + " " + sumformat2.format(course * sumBasket);

    }

}
