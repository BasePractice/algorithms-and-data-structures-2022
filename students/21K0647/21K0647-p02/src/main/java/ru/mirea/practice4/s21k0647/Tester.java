package ru.mirea.practice4.s21k0647;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Shop amarket = new Shop();
        Scanner source = new Scanner(System.in);
        String i = "add";
        while (i.length() != 0) {
            if (i.equals("add")) {
                System.out.println("Enter the data: ");
                Computer c1 = new Computer(source.next(), source.next(), source.next(), source.next());
                amarket.addComputer(c1);
                System.out.println("Do you want to add a computer?");
                System.out.println("Enter a request:");
                i = source.next();
            }
            if (i.equals("delete")) {
                System.out.println("Enter the model of the computer you want to delete");
                amarket.deleteComputer(source.next());
                System.out.println("Enter a request:");
                i = source.next();
            }
            if (i.equals("search")) {
                System.out.println("Find a computer");
                System.out.println(amarket.searchComputer(source.next()));
                System.out.println("Enter a request:");
                i = source.next();
            }
            if (i.equals("output")) {
                for (Computer x : amarket.cC) {
                    System.out.println("Name: " + x.model + "\tProcessor: " + x.processor + "\tmemory: " + x.memory + "\tBattery: " + x.battery);
                }
                System.out.println("Enter a request:");
                i = source.next();
            }
            if (i.equals("end")) {
                i = "";
            }
        }
    }
}
