package ru.mirea.practice.task3;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class EShop {
    public static Scanner sc = new Scanner(System.in);
    private String login = "log";
    private String password = "pass";


    public void autentification() {
        System.out.println("Enter login and password:" + '\n' + "Login-");
        String l;
        String p;
        while (true) {
            l = sc.nextLine();
            System.out.println("Password-");
            p = sc.nextLine();
            if (l.equals(login) && p.equals(password)) {
                break;
            } else {
                System.out.println("Login-");
                sc = new Scanner(System.in);
            }
        }
    }

    public static void main(String[] args) {
        EShop a = new EShop();
        a.autentification();
        List<String> l = new LinkedList<>();
        while (true) {
            System.out.println("Select action:" + '\'' + "1-Show Catalogues" + '\'' + "2-Show exact catalogue " + "3-Show basket");
            int i = sc.nextInt();
            switch (i) {
                case 1: {
                    for (Catalogue c : Catalogue.values()) {
                        System.out.println(c);
                    }
                    break;
                }
                case 2: {
                    sc = new Scanner(System.in);
                    Catalogue c = Catalogue.valueOf(sc.nextLine());
                    c.toShowC(c, l);
                    break;
                }
                case 3: {
                    for (String s : l) {
                        System.out.println(s);
                    }
                    break;
                }
                default:
                    break;
            }
        }

    }
}
