package ru.mirea.practice.task3;

import java.util.Scanner;

abstract class Tester {
    public static void main(String[] args) {
        User user = new User("Misha", "1q2w3e4r5");
        if (user.authentication()) {
            Catalog[] values = Catalog.values();
            System.out.println("Каталог:");
            for (int i = 0; i < values.length; i++) {
                System.out.println(i + 1 + ") " + values[i].toString());
                values[i].getDescription();
            }
            try (Scanner in = new Scanner(System.in)) {

                Product[] basket = {new Product("", 0), new Product("", 0), new Product("", 0)};
                System.out.println("\nИз какого каталога хотите выбрать товар? Для выхода введите 0");
                int choose = 0;
                for (int i = 0; i < basket.length; i++) {
                    choose = in.nextInt();
                    switch (choose) {
                        case (1):
                            values[0].getDescription();
                            int choice1 = in.nextInt();
                            basket[i] = values[0].getCatalog()[choice1 - 1];
                        case (2):
                            values[1].getDescription();
                            int choice2 = in.nextInt();
                            basket[i] = values[1].getCatalog()[choice2 - 1];
                        case (3):
                            values[2].getDescription();
                            int choice3 = in.nextInt();
                            basket[i] = values[2].getCatalog()[choice3 - 1];
                        case (0):
                            break;
                        default:
                            System.out.println("Неправильный ввод");
                            i--;

                    }
                }
                int bill = 0;
                for (Product product : basket) {
                    bill += product.getPrice();
                }
                System.out.println(bill);
            }

        }
    }
}

