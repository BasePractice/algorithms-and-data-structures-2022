package ru.mirea.practice.task10;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Shop shop = new Shop();

            while (true) {
                String command = sc.nextLine();
                String[] line = command.split(" ");

                switch (line[0]) {
                    case "ADD":
                        shop.addComputer(new Computer(Computer.Developer.valueOf(line[1])));
                        break;
                    case "DELETE":
                        shop.deleteComputer(Integer.parseInt(line[1]));
                        break;
                    case "FIND":
                        shop.findComputer(new Computer(Computer.Developer.valueOf(line[1])));
                        break;
                    case "CATALOG":
                        System.out.println(shop);
                        break;
                    case "EXIT":
                        return;
                    default:
                        return;
                }
            }
        } finally {
            sc.close();
        }
    }
}
