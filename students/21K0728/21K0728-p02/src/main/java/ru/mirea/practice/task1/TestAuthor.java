package ru.mirea.practice.task1;

import java.util.Scanner;

abstract class TestAuthor {

    public static void main(String[] args) {
        Author ath = new Author("Mary Jane","DoMJ_everyHour@gmail.com",'F');
        System.out.println(ath);
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter new email:");
            ath.setEmail(scan.next());
            System.out.println(ath.getEmail());
        }
    }
}
