package ru.mirea.practice.task4;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Shop {
    public static void main(String[] main) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Computer> Computers = new ArrayList<>();
            System.out.println("Добро пожаловать в магазин.");
            while (true) {
                System.out.print("Выберите комманду:" + '\n'
                        + "1: добавить компьютер" + '\n'
                        + "2: показать список компьютеров" + '\n'
                        + "3: купить компьютер" + '\n'
                        + "4-0: выйти из магазина" + '\n');
                switch (sc.nextInt()){
                    case 1:
                        System.out.print("ведите имя компьютера: ");
                        String name = sc.next();
                        System.out.print("Введите имя процессора: ");
                        String Proccesor = sc.next();
                        System.out.print("ведите название видеокарты: ");
                        String VideoCardName = sc.next();
                        System.out.print("Введите объём памяти (целым числом): ");
                        int Memory = sc.nextInt();
                        System.out.print("Введите объём оперативной памяти (целым числом): ");
                        int RAM = sc.nextInt();
                        Computers.add(new Computer(name, VideoCardName, Proccesor, Memory, RAM));
                        break;
                    case 2:
                        for (int i = 0; i < Computers.size(); i++){
                            System.out.println("Компьютер №" + (i+1) + Computers.get(i).toString());
                        }
                        break;
                    case 3:
                        System.out.print("Выберете номер компьютера, который вы хотите приобрести: ");
                        int ComputerIndex = sc.nextInt() - 1;
                        if (ComputerIndex <= Computers.size()){
                            System.out.print("Успешно куплен компьютер под номером " + (ComputerIndex+1) + " с параметрами:" + '\n' + Computers.get(ComputerIndex).toString());
                            Computers.remove(ComputerIndex);
                        }
                        break;
                    default:
                        System.exit(0);
                }
            }
        }
    }
}
