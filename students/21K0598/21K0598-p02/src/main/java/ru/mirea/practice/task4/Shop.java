package ru.mirea.practice.task4;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Shop {
    public static void main(String[] main) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Computer> computers = new ArrayList<>();
            System.out.println("Добро пожаловать в магазин.");
            while (true) {
                System.out.print("Выберите комманду:" + '\n'
                        + "1: добавить компьютер" + '\n'
                        + "2: показать список компьютеров" + '\n'
                        + "3: купить компьютер" + '\n'
                        + "4-0: выйти из магазина" + '\n');
                switch (sc.nextInt()) {
                    case 1:
                        System.out.print("ведите имя компьютера: ");
                        final String name = sc.next();
                        System.out.print("Введите имя процессора: ");
                        final String proccesor = sc.next();
                        System.out.print("ведите название видеокарты: ");
                        final String videoCardName = sc.next();
                        System.out.print("Введите объём памяти (целым числом): ");
                        int memory = sc.nextInt();
                        System.out.print("Введите объём оперативной памяти (целым числом): ");
                        int ram = sc.nextInt();
                        computers.add(new Computer(name, videoCardName, proccesor, memory, ram));
                        break;
                    case 2:
                        for (int i = 0; i < computers.size(); i++) {
                            System.out.println("Компьютер №" + (i + 1) + computers.get(i).toString());
                        }
                        break;
                    case 3:
                        System.out.print("Выберете номер компьютера, который вы хотите приобрести: ");
                        int computerIndex = sc.nextInt() - 1;
                        if (computerIndex <= computers.size()) {
                            System.out.print("Успешно куплен компьютер под номером " + (computerIndex + 1) + " с параметрами:" + '\n'
                                             + computers.get(computerIndex).toString());
                            computers.remove(computerIndex);
                        }
                        break;
                    default:
                        System.exit(0);
                        break;
                }
            }
        }
    }
}
