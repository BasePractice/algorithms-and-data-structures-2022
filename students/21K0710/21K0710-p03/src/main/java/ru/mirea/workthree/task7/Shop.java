package ru.mirea.workthree.task7;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Shop {
    String name;
    double price;

    public Shop(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Shop item1 = new Shop("note", 200.7);
            Shop item2 = new Shop("puzzle", 1200.20);
            Shop item3 = new Shop("pen", 21);

            System.out.println("Ассортимент товаров: ");
            System.out.println(item1);
            System.out.println(item2);
            System.out.println(item3);
            System.out.println("Введите номер товара от 1 до 3:");
            Shop cur = new Shop("none", 0);
            int c = sc.nextInt();
            switch (c) {
                case 1: cur = item1;
                    break;
                case 2: cur = item2;
                    break;
                case 3: cur = item3;
                    break;
                default:
                    break;
            }
            NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.GERMANY);
            NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
            System.out.println("Выберите валюту для оплаты(1 - RUB, 2- Euro, 3 - USD, 4 - CNY)");
            c = sc.nextInt();
            Converter con = new Converter(cur.getPrice());
            switch (c) {
                case 1: System.out.println("Сумма к оплате: " + cur.getPrice());
                    break;
                case 2: System.out.println("Сумма к оплате: " + numberFormat1.format(con.eur()));
                    break;
                case 3: System.out.println("Сумма к оплате: " + numberFormat2.format(con.usd()));
                    break;
                case 4: System.out.println("Сумма к оплате: " + numberFormat3.format(con.cny()));
                    break;
                default:
                    break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" + "name='" + name + '\'' + ", price=" + price + '}';
    }
}
