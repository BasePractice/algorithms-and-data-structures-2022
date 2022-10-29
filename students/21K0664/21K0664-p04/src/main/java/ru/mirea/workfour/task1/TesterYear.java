package ru.mirea.workfour.task1;

import java.util.Scanner;

public class TesterYear {
    public static void main(String[] args) {
        System.out.println("\nЗадание 4.1\n");
        Year years = Year.SUMMER;
        Scanner in = new Scanner(System.in);
        System.out.println(years + " is best season. You dont study and work. Its hot and cool");
        switch (years) {
            case WINTER:
                System.out.println("I like WINTER");
                break;
            case AUTUMN:
                System.out.println("I like AUTUMN");
                break;
            case SUMMER:
                System.out.println("I like SUMMER");
                break;
            case SPRING:
                System.out.println("I like SPRING");
                break;
            default:
                System.out.println("Error");
                break;
        }
        System.out.println(years.getDescription());

    }
}
