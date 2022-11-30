package ru.mirea.worktwo.task10;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class HowMany {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            String words;
            words = in.nextLine();
            int n = 0;
            for (int i = 0; i < words.length(); i++) {
                char ch = words.charAt(i);
                if (ch == ' ' || ch == ',' || ch == '.') {
                    n++;
                }
            }
            System.out.print(n + 1);
        } catch (InputMismatchException e) {
            System.out.println("Error");
            in.next();
        } finally {
            in.close();
        }

    }
}
