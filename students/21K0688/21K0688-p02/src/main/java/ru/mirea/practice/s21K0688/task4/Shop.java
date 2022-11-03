package ru.mirea.practice.s21K0688.task4;

import java.util.Scanner;

public class Shop {
    public static void addComputer(Computer[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Name: ");
            Computer comp = new Computer();
            comp.setName(sc.nextLine());
            arr[i] = comp;
        }
    }

    public static void deleteComputer(Computer[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String deleteName = new String();
        deleteName = sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals(deleteName)) {
                arr[i].setName(" ");
            }
        }
    }
}


