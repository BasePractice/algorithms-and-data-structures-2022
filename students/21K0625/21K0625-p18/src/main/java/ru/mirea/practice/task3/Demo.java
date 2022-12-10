package ru.mirea.practice.task3;

import java.util.Scanner;

public final class Demo {
    private Demo() {
    }

    public static void main(String[] args) {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);

            try {
                System.out.println(2 / i);
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}
    //При вводе тех же значений, при 0 ошибка обрабатывается, при 1.2 не обрабатывается, при 1 ошибок нет
