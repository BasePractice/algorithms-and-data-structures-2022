package ru.mirea.practice.task4;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    List pc = new ArrayList();

    public void addPc() {
        System.out.println("Кол-во пк:");
        try(Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            for (int i = 0; i <= x; i++) {
                String f = sc.nextLine();
                this.pc.add(f);
            }
        }
    }

    public void deletePc() {
        System.out.println("Название для удаления: ");
        try(Scanner sc = new Scanner(System.in)) {
            String x = sc.nextLine();
            this.pc.remove(x);
        }
    }

    public boolean findPc() {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Найти: ");
            String pcf = sc.nextLine();
            return this.pc.contains(pcf);
        }
    }


}
