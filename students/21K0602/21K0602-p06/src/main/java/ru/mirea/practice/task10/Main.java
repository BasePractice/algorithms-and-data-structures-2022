package ru.mirea.practice.task10;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Inputable shop = new Shop();

            while (true) {
                System.out.println("Введите одну из 5 команд\n 1. add\n 2. delete\n 3. find\n 4. get\n 5. catalog\n 6. exit");
                String userInput = in.next();

                switch (userInput) {
                    case "add":
                        System.out.println("Введите компанию производящую компьтер (HP, Acer, Apple) ");
                        shop.addComputer(new Computer(Computer.Company.valueOf(in.next())));
                        break;
                    case "delete":
                        System.out.println("Введите компанию производящую компьтер (HP, Acer, Apple) ");
                        shop.deleteComputer(new Computer(Computer.Company.valueOf(in.next())));
                        break;
                    case "find":
                        System.out.println("Введите компанию производящую компьтер (HP, Acer, Apple) ");
                        shop.findComputer(new Computer(Computer.Company.valueOf(in.next())));
                        break;
                    case "get":
                        System.out.println("Введите номер компьютера");
                        if (in.hasNextInt() && in.nextInt() >= 0) {
                            shop.getComputer(in.nextInt());
                        }
                        break;
                    case "catalog":
                        shop.getCatalog();
                        break;
                    case "exit":
                        return;
                    default:
                        System.out.println("Wrong command");
                        break;

                }
            }
        }
    }
}
