package ru.mirea.practice.task10;

import java.util.Scanner;

abstract class HowMany {
    public static void main(String[] args) {
        int count = 0;
        String a = new String();
        try (Scanner line = new Scanner(System.in)) {
            System.out.println("Line: ");
            a = line.nextLine();
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == ' ') {
                    count++;
                }
            }
            count++;
            System.out.print(count);
        }
    }

}
