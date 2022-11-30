package ru.mirea.practice.task3;

import java.util.ArrayList;
import java.util.Scanner;

public enum Catalogue {
    MSI(1), ASUS(2), HP(3);
    private int n;
    Scanner sc = new Scanner(System.in);

    Catalogue(int n) {
        this.n = n;
    }

    public void toShow_c(Catalogue m, ArrayList b) {
        switch (m) {
            case MSI: {
                System.out.println("MSI computers: ");
                for (MSI c : ru.mirea.practice.task3.MSI.values()) {
                    System.out.println(c);
                }
                while (true) {
                    System.out.println("Add something(y/n)?");
                    if (sc.nextLine().equals("y")) {
                        ru.mirea.practice.task3.MSI first = ru.mirea.practice.task3.MSI.valueOf(sc.nextLine());
                        b.add(first.toString());
                    } else break;
                }
                break;
            }

            case ASUS: {
                System.out.println("ASUS computers: ");
                for (ASUS c : ru.mirea.practice.task3.ASUS.values()) {
                    System.out.println(c);
                }
                while (true) {
                    System.out.println("Add something(y/n)?");
                    if (sc.nextLine().equals("y")) {
                        ru.mirea.practice.task3.ASUS first = ru.mirea.practice.task3.ASUS.valueOf(sc.nextLine());
                        b.add(first.toString());
                    } else break;
                }
                break;
            }
            case HP: {
                System.out.println("HP computers: ");
                for (HP c : ru.mirea.practice.task3.HP.values()) {
                    System.out.println(c);
                }
                while (true) {
                    System.out.println("Add something(y/n)?");
                    if (sc.nextLine().equals("y")) {
                        ru.mirea.practice.task3.HP first = ru.mirea.practice.task3.HP.valueOf(sc.nextLine());
                        b.add(first.toString());
                    } else break;
                }
                break;
            }
        }
    }
}
