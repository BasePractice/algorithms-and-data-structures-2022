package ru.mirea.practice.task4.s21k0709;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Shop obj1 = new Shop();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите компьютеры");
        String namecomp = sc.nextLine();
        while (!(namecomp.equals("Exit") | namecomp.equals("Выйти"))) {
            obj1.addComp(obj1, namecomp);
            namecomp = sc.nextLine();
        }
        System.out.println(obj1.searchComp(obj1, "Intel")); // поиск по названию
        obj1.deleteComp(obj1, 4); // удаление по индексу
        obj1.addComp(obj1, "IBM");
        for (String name : obj1.getComputers()) {
            System.out.println(name);
        }

    }
}
