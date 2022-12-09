package ru.mirea.practice.task1;

import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) throws InnExc {
        MarketInn marketInn = new MarketInn();
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter INN: ");
            String inn = scan.nextLine();
            if (!marketInn.checkInn(inn)) {
                throw new InnExc("Wrong INN " + inn);
            } else {
                System.out.println("Successfully!");
            }
        } catch (InnExc exc) {
            System.out.println(exc);
            throw new InnExc("The required INN format is 12 digits", exc);
        }
    }
}
