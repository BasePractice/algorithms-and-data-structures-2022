package ru.mirea.practice.work3;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

abstract class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("SHOP\nВведите логин:");
            String login = scanner.next();
            Shop shop = Shop.valueOf(login);
            System.out.println(shop);
            while (!Objects.equals(login, "Mihail")) {
                System.out.println("\nВведите логин:");
                login = scanner.next();
                shop = Shop.valueOf(login);
                System.out.println(shop);
            }

            System.out.println("\nВведите пароль:");
            String password = scanner.next();
            shop = Shop.valueOf(password);
            System.out.println(shop);
            while (!Objects.equals(password, "_1234")) {
                System.out.println("\nВведите пароль:");
                password = scanner.next();
                shop = Shop.valueOf(password);
                System.out.println(shop);
            }

            double price = 0;
            Locale.setDefault(Locale.UK);

            System.out.println("\nChoose a catalog:\n1.Food\n2.Staff");
            String catalogBuff = scanner.next();
            if (Objects.equals(catalogBuff, "FOOD") | Objects.equals(catalogBuff, "STAFF")) {
                Catalog catalog = Catalog.valueOf(catalogBuff);
                System.out.println(catalog);
            } else {
                while (!Objects.equals(catalogBuff, Catalog.FOOD.toString()) | !Objects.equals(catalogBuff,
                        Catalog.STAFF.toString())) {
                    System.out.println("\nChoose a catalog: ");
                    catalogBuff = scanner.next();
                    Catalog catalog = Catalog.valueOf(catalogBuff);
                    System.out.println(catalog);
                }
            }

            switch (catalogBuff) {
                case "FOOD": {
                    System.out.println("Choose a good:\n1.Honey\n2.Banana");
                    String foodBuff = scanner.next();
                    if (Objects.equals(foodBuff, "HONEY") | Objects.equals(foodBuff, "BANANA")) {
                        Food food = Food.valueOf(foodBuff);
                        System.out.println(food);
                    } else {
                        while (!Objects.equals(foodBuff, Food.HONEY.toString()) | !Objects.equals(foodBuff,
                                Food.BANANA.toString())) {
                            System.out.println("\nChoose a good: ");
                            foodBuff = scanner.next();
                            Food food = Food.valueOf(foodBuff);
                            System.out.println(food);
                        }
                    }

                    switch (foodBuff) {
                        case "HONEY": {
                            price = 123.45;
                            break;
                        }
                        case "BANANA": {
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
                case "STAFF": {
                    System.out.println("\nChoose a good:\n1.Umbrella");
                    String staffBuff = scanner.next();
                    if (Objects.equals(catalogBuff, "UMBRELLA")) {
                        Staff staff = Staff.valueOf(staffBuff);
                        System.out.println(staff);
                    } else {
                        while (!Objects.equals(staffBuff, Staff.UMBRELLA.toString())) {
                            System.out.println("Choose a good: ");
                            staffBuff = scanner.next();
                            Staff staff = Staff.valueOf(staffBuff);
                            System.out.println(staff);
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
            int c = scanner.nextInt();

            while (c < 1 | c > 4) {
                System.out.println("\nChoose a currency:");
                c = scanner.nextInt();
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
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scanner.nextInt();
        } finally {
            scanner.close();
        }
    }
}
