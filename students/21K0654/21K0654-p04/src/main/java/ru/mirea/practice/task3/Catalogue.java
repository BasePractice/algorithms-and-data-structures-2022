package ru.mirea.practice.task3;

import java.util.List;
import java.util.Scanner;

public enum Catalogue {
    MSI(1), ASUS(2), HP(3);
    public static Scanner sc = new Scanner(System.in);

    Catalogue(int n) {
        System.out.println("  ");
    }

    public void toShowC(Catalogue m, List<String> b) {
        switch (m) {
            case MSI: {
                System.out.println("MSI computers: ");
                for (Msic c : Msic.values()) {
                    System.out.println(c);
                }
                while (true) {
                    System.out.println("Add something(y/n)?");
                    if ("y".equals(sc.nextLine())) {
                        Msic first = Msic.valueOf(sc.nextLine());
                        b.add(first.toString());
                    } else {
                        break;
                    }
                }
                break;
            }

            case ASUS: {
                System.out.println("ASUS computers: ");
                for (Asusc c : Asusc.values()) {
                    System.out.println(c);
                }
                while (true) {
                    System.out.println("Add something(y/n)?");
                    if ("y".equals(sc.nextLine())) {
                        Asusc first = Asusc.valueOf(sc.nextLine());
                        b.add(first.toString());
                    } else {
                        break;
                    }
                }
                break;
            }
            case HP: {
                System.out.println("HP computers: ");
                for (HPc c : HPc.values()) {
                    System.out.println(c);
                }
                while (true) {
                    System.out.println("Add something(y/n)?");
                    if ("y".equals(sc.nextLine())) {
                        HPc first = HPc.valueOf(sc.nextLine());
                        b.add(first.toString());
                    } else {
                        break;
                    }
                }
                break;
            }
            default:
                break;
        }
    }
}
