package ru.mirea.practice.task4;

import java.util.Scanner;

public abstract class Tester {
    static Scanner sc = new Scanner(System.in);
    static Shop shop = new Shop();

    public static void main(String[] args) {
        while (true) {
            String command = sc.nextLine();
            String[] line = command.split(" ");

            switch (line[0]) {
                case "ADD":
                    shop.addComputer(new Computer(line[1], line[2]));
                    break;
                case "DELETE":
                    shop.deleteComputer(new Computer(line[1], line[2]));
                    break;
                case "SEARCH":
                    shop.searchComputer(new Computer(line[1], line[2]));
                    break;
                case "CATALOG":
                    System.out.println(shop);
                    break;
                case "EXIT":
                    break;
                default:
                    return;
            }
        }
    }

}
