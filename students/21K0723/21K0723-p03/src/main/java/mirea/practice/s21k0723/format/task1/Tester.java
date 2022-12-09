package mirea.practice.s21k0723.format.task1;

import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) {
        System.out.println("Write the number you want to translate ");
        System.out.println("Converted from code land");
        System.out.println("In Language code");
        System.out.println("In Land code");
        System.out.println("Exchange rate from currency to currency");
        try (Scanner in = new Scanner(System.in)) {
            Conventer conventer = new Conventer(in.nextDouble(), in.next(), in.next(), in.next(), in.nextDouble());
            conventer.formated();
            System.out.print(conventer);
        }
    }
}