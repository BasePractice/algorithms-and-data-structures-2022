package ru.mirea.practice.work3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public enum Shop {
    Mihail("LOGIN"), _1234("PASSWORD");
    private final String a;

    Shop(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("SHOP\nВведите логин:");
        String login = in.next();
        Shop shop = Shop.valueOf(login);
        while (!Objects.equals(login, "Mihail")) {
            System.out.println("\nВведите логин:");
            login = in.next();
            shop = Shop.valueOf(login);
        }

        System.out.println("\nВведите пароль:");
        String password = in.next();
        shop = Shop.valueOf(password);
        while (!Objects.equals(password, "_1234")) {
            System.out.println("\nВведите пароль:");
            password = in.next();
            shop = Shop.valueOf(password);
        }

        double price = 0;
        Locale locFR = new Locale("en");
        Locale.setDefault(Locale.UK);

        System.out.println("\nChoose a catalog:\n1.Food\n2.Staff");
        String catalogBuff = in.next();
        if (Objects.equals(catalogBuff, "FOOD") | Objects.equals(catalogBuff, "STAFF")) {
            Catalog catalog = Catalog.valueOf(catalogBuff);
        } else {
            while (!Objects.equals(catalogBuff, Catalog.FOOD.toString()) | !Objects.equals(catalogBuff,
                    Catalog.STAFF.toString())) {
                System.out.println("\nChoose a catalog: ");
                catalogBuff = in.next();
                Catalog catalog = Catalog.valueOf(catalogBuff);
            }
        }

        switch (catalogBuff) {
            case ("FOOD"): {
                System.out.println("Choose a good:\n1.Honey\n2.Banana");
                String foodBuff = in.next();
                if (Objects.equals(foodBuff, "HONEY") | Objects.equals(foodBuff, "BANANA")) {
                    Food food = Food.valueOf(foodBuff);
                } else {
                    while (!Objects.equals(foodBuff, Food.HONEY.toString()) | !Objects.equals(foodBuff,
                            Food.BANANA.toString())) {
                        System.out.println("\nChoose a good: ");
                        foodBuff = in.next();
                        Food food = Food.valueOf(foodBuff);
                    }
                }

                switch (foodBuff) {
                    case ("HONEY"): {
                        price = 123.45;
                        break;
                    }
                    case ("BANANA"): {
                        price = 12.79;
                        break;
                    }
                    default: {
                        System.out.println(" ");
                        break;
                    }
                }
                break;
            }
            case ("STAFF"): {
                System.out.println("\nChoose a good:\n1.Umbrella");
                String staffBuff = in.next();
                if (Objects.equals(catalogBuff, "UMBRELLA")) {
                    Staff staff = Staff.valueOf(staffBuff);
                } else {
                    while (!Objects.equals(staffBuff, Staff.UMBRELLA.toString())) {
                        System.out.println("Choose a good: ");
                        staffBuff = in.next();
                        Staff staff = Staff.valueOf(staffBuff);
                    }
                }
                price = 571.09;
                break;
            }
            default: {
                System.out.println(" ");
                break;
            }
        }

        System.out.println("\nChoose a currency for payment:\n1.$\n2.€\n3.¥\n4.£");
        int c = in.nextInt();

        while (c < 1 | c > 4) {
            System.out.println("\nChoose a currency:");
            c = in.nextInt();
        }

        switch (c) {
            case 1: {
                NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
                price /= 1.12;
                System.out.println(numberFormat1.format(price));
                break;
            }
            case 2: {
                NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
                price /= 1.16;
                System.out.println(numberFormat2.format(price));
                break;
            }
            case 3: {
                NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
                price /= 7.48;
                System.out.println(numberFormat3.format(price));
                break;
            }
            case 4: {
                NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance();
                System.out.println(numberFormat4.format(price));
                break;
            }
            default: {
                System.out.println(" ");
                break;
            }
        }
    }
}
