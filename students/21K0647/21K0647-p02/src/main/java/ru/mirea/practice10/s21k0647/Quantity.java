package ru.mirea.practice10.s21k0647;

import java.util.Scanner;

public final class Quantity {
    private Quantity() {

    }

    public static void main(String[] args) {
        try (Scanner source = new Scanner(System.in)) {
            String s = source.nextLine();
            System.out.println(s);
            String[] sl = s.split(" ");
            System.out.println(sl.length);
        }
    }
}
