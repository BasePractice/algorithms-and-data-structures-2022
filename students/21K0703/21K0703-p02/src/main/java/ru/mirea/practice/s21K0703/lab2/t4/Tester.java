package ru.mirea.practice.s21K0703.lab2.t4;

import java.util.Scanner;
public class Tester {
    public static void main(String[] args){

        Shop Market = new Shop();
        Scanner source = new Scanner(System.in);
        String i = "add";
        while(i.length() != 0) {
            if (i.equals("add")) {
                System.out.println("Enter the data: ");
                Computer c1 = new Computer(source.next(), source.next(), source.next(), source.next());
                Market.addComputer(c1);
                System.out.println("Do you want to add a computer?");
                System.out.println("Enter a request:");
                i = source.next();
            }
            if (i.equals("delete")) {
                System.out.println("Enter the model of the computer you want to delete");
                Market.deleteComputer(source.next());
                System.out.println("Enter a request:");
                i = source.next();
            }
            if (i.equals("search")) {
                System.out.println("Find a computer");
                System.out.println(Market.searchComputer(source.next()));
                System.out.println("Enter a request:");
                i = source.next();
            }
            if (i.equals("output")) {
                for (Computer x : Market.C) {
                    System.out.println("Name: " + x.model + "\tProcessor: " + x.processor + "\tMemory: " + x.memory + "\tBattery: " + x.battery);
                }
                System.out.println("Enter a request:");
                i = source.next();
            }
            if(i.equals("end")){
                i = "";
            }
        }
    }
}
