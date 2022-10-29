package ru.mirea.practice.work4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Shop sh = new Shop(8);

        System.out.println(sh);

        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Введите номер компьютера (1-10): ");
        a = sc.nextInt();

        sh.findComputer(a);
        sh.addComputer(4);
        sh.delComputer(5);
        sh.findComputer(10);
        System.out.println(sh.getAmount());
        sh.setAmount(4);
    }
}
