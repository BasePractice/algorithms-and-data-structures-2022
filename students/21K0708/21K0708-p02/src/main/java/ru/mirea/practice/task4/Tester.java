package ru.mirea.practice.task4;

import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);

            String manufacturer = sc.nextLine();
            String model = sc.nextLine();
            double price = sc.nextDouble();
            shop.addComputer(manufacturer, model, price);
            sc.nextLine();

            manufacturer = sc.nextLine();
            model = sc.nextLine();
            price = sc.nextDouble();
            shop.addComputer(manufacturer, model, price);
            sc.nextLine();
            System.out.println(shop);

            String manufacturerForSearch = sc.nextLine();
            String modelForSearch = sc.nextLine();
            System.out.println(shop.searchComputer(manufacturerForSearch, modelForSearch));

            shop.deleteComputer(1);
            System.out.println(shop);

            sc.close();
        } catch (IncompatibleClassChangeError e) {
            System.out.println("Error");
            sc.next();
        } finally {
            sc.close();
        }
    }
}
