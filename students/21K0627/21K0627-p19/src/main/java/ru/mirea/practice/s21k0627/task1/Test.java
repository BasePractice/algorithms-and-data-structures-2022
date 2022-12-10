package ru.mirea.practice.s21k0627.task1;

import java.util.Scanner;

public abstract class Test {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter name and INN: ");
            Customer customer = new Customer(sc.next(), sc.nextInt());
            System.out.println(customer);
        } catch (InnException e) {
            System.out.println(e.getMessage());
        }
    }

}
