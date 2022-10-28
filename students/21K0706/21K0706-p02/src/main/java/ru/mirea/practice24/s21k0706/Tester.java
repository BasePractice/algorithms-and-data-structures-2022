package ru.mirea.practice24.s21k0706;

import java.util.Scanner;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        Shop device = new Shop();
        try (Scanner in = new Scanner(System.in)) {
            String answer = "add";
            while (answer.length() != 0) {
                if ("add".equals(answer)) {
                    System.out.println("Enter the computer data: ");
                    Computer b = new Computer(in.next(), in.next(), in.next(), in.next());
                    device.addComputer(b);
                    System.out.println("What do you want to do? (add/search/delete/exit): ");
                    answer = in.next();
                }
                if ("search".equals(answer)) {
                    System.out.println("Enter the computer data you want to find: ");
                    device.searchComputer(in.next(), in.next(), in.next(), in.next());
                    System.out.println("What do you want to do? (add/search/delete/exit): ");
                    answer = in.next();
                }
                if ("delete".equals(answer)) {
                    System.out.println("Enter the computer data you want to delete: ");
                    device.deleteComputer(in.next(), in.next(), in.next(), in.next());
                    System.out.println("What do1 you want to do? (add/search/delete/exit): ");
                    answer = in.next();
                }
                if ("exit".equals(answer)) {
                    System.out.println("Goodbye!");
                    answer = "";
                }
            }
        }
    }
}
