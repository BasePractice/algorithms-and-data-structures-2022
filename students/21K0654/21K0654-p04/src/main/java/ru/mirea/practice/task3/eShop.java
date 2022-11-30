package ru.mirea.practice.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class eShop {
    public static Scanner sc = new Scanner(System.in);
    private String Login = "log";
    private String Password = "pass";

    public void autentification() {
        System.out.println("Enter login and password:" + '\n' + "Login-");
        Scanner sc = new Scanner(System.in);
        String l, p;
        while (true) {
            l = sc.nextLine();
            System.out.println("Password-");
            p = sc.nextLine();
            if (l.equals(Login) && p.equals(Password)) {
                System.out.println("���� ��������");
                break;
            } else {
                System.out.println("������ �����");
                sc = new Scanner(System.in);
            }
        }
    }

    public static void main(String[] args) {
        eShop a = new eShop();
        a.autentification();
        ArrayList<String> b = new ArrayList<String>();
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
                    c.toShow_c(c, b);
                    break;
                }
                case 3: {
                    for (String s : b) {
                        System.out.println(s);
                    }
                }
            }
        }

    }
}
