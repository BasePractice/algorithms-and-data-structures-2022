package ru.mirea.practice.task10;

import java.util.Scanner;

public abstract class Tester {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Shop shop = new Shop();

            while (true) {
                String command = sc.nextLine();
                String[] line = command.split(" ");

                switch (line[0]) {
                    case "ADD":
                        shop.addComputer(new Computer(Computer.Brand.valueOf(line[1])));
                        break;
                    case "DELETE":
                        shop.deleteComputer(Integer.parseInt(line[1]));
                        break;
                    case "FIND":
                        shop.findComputer(new Computer(Computer.Brand.valueOf(line[1])));
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
        }
    }
}
