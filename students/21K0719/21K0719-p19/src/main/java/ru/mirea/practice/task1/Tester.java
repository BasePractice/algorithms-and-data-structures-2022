package ru.mirea.practice.task1;

import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) throws WrongInnException {
        Shop shop = new Shop();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter INN :");
            String inn = sc.nextLine();
            if (shop.check(inn)) {
                System.out.println("INN is correct!");
            }
            else {
                throw new WrongInnException(inn + " This INN is incorrect!");
            }
        }
        catch (WrongInnException exception) {
            System.out.println(exception);
            throw new WrongInnException("INN must include 12 numbers!",exception);
        }

    }
}
