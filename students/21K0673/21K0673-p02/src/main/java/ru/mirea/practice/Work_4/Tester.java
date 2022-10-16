package ru.mirea.practice.Work_4;

import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Shop Sh=new Shop(8);

        System.out.println(Sh);

        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Введите номер компьютера (1-10): ");
        a = sc.nextInt();

        Sh.findComputer(a);
        Sh.addComputer(4);
        Sh.delComputer(5);
        Sh.findComputer(10);
        System.out.println(Sh.getAmount());
        Sh.setAmount(4);
    }
}
