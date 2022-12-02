package ru.mirea.practice.subchapter.task2;

import java.util.Scanner;

public class TestPhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone p = new Phone("guyPhone", 800555353, 100);
        System.out.println("Введите кол-во адресов, а затем сами адреса");
        int n = sc.nextInt();
        int[] Arr = new int[n];
        for (int a = 0; a < Arr.length; a++) {
            Arr[a] = sc.nextInt();
        }
        for (int a : Arr) {
            System.out.println(a);
        }

        p.sendMessage(Arr);
    }
}
