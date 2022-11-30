package ru.mirea.practice4.s21k0647;

import java.util.Scanner;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {

        Shop amarket = new Shop();
        try (Scanner source = new Scanner(System.in)) {
            String i = "add";
            while (i.length() != 0) {
                if ("add".equals(i)) {
                    System.out.println("Enter the data: ");
                    Computer c1 = new Computer(source.next(), source.next(), source.next(), source.next());
                    amarket.addComputer(c1);
                    System.out.println("Do you want to add a computer?");
                    System.out.println("Enter a request:");
                    i = source.next();
                }
                if ("delete".equals(i)) {
                    System.out.println("Enter the model of the computer you want to delete");
                    amarket.deleteComputer(source.next());
                    System.out.println("Enter a request:");
                    i = source.next();
                }
                if ("search".equals(i)) {
                    System.out.println("Find a computer");
                    System.out.println(amarket.searchComputer(source.next()));
                    System.out.println("Enter a request:");
                    i = source.next();
                }
                if ("output".equals(i)) {
                    for (Computer x : amarket.cC) {
                        System.out.println("Name: " + x.model + "\tProcessor: " + x.processor + "\tmemory: " + x.memory + "\tBattery: " + x.battery);
                    }
                    System.out.println("Enter a request:");
                    i = source.next();
                }
                if ("end".equals(i)) {
                    i = "";
                }
            }
        }
    }
}
