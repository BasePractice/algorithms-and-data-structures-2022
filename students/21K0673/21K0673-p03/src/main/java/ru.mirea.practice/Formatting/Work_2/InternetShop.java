package ru.mirea.practice.Formatting.Work_2;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class InternetShop {
    public static void main(String[] args) {
        double price = 0;
        Locale locFR = new Locale("en");
        Locale.setDefault(Locale.UK);

        Scanner in = new Scanner(System.in);
        System.out.println("SHOP\nChoose a good:\n1.Honey\n2.Umbrella\n3.Banana");
        int n = in.nextInt();
        while (n < 1 | n > 3) {
            System.out.println("Choose a good: ");
            n = in.nextInt();
        }
        System.out.println("Choose a currency for payment:\n1.$\n2.€\n3.¥\n4.£");
        int c = in.nextInt();
        while (c < 1 | c > 4) {
            System.out.println("Choose a currency:");
            c = in.nextInt();
        }
        switch (n) {
            case 1 -> price = 123.45;
            case 2 -> price = 571.09;
            case 3 -> price = 12.79;
        }
        switch (c) {
            case 1 -> {
                NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
                price /= 1.12;
                System.out.println(numberFormat1.format(price));
            }
            case 2 -> {
                NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                price /= 1.16;
                System.out.println(numberFormat2.format(price));
            }
            case 3 -> {
                NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
                price /= 7.48;
                System.out.println(numberFormat3.format(price));
            }
            case 4 -> {
                NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance();
                System.out.println(numberFormat4.format(price));
            }
        }
    }
}
