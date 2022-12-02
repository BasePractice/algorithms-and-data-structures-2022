package ru.mirea.practice.subchapter.task2;

import java.util.Scanner;

public final class TestPhone {
    private TestPhone() {
    }

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите кол-во адресов, а затем сами адреса");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int a = 0; a < arr.length; a++) {
            arr[a] = sc.nextInt();
        }
        for (int a : arr) {
            System.out.println(a);
        }
        Phone p = new Phone("guyPhone", 800555353, 100);
        p.sendMessage(arr);
    }
}
