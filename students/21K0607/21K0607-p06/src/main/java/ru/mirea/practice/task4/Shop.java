package ru.mirea.practice.task4;

import java.util.Scanner;

public class Shop implements Interface {
    private Computer[] computers;

    public Shop(Computer[] computers) {
        this.computers = computers;
    }

    public void printComputers() {
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }

    @Override
    public void add() {
        try (Scanner in = new Scanner(System.in)) {
            for (int i = 0; i < computers.length; i++) {
                System.out.println("Какого бренда компьютер вы хотите? (HP, LENOVO, SAMSUNG, ACER, DELL, ASUS)");
                Computer tempComp = new Computer(Brand.valueOf(in.nextLine()));
                computers[i] = tempComp;
            }
        }

    }

    @Override
    public void delete() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Введите компьютер, который хотите удалить: ");
            int temp = in.nextInt() - 1;
            for (int i = 0; i < computers.length; i++) {
                if (i == temp) {
                    Processor tempProcessor = new Processor(0, 0);
                    Memory tempMemory = new Memory(0, 0, 0);
                    Monitor tempMonitor = new Monitor(0, 0);
                    Computer tempComp = new Computer(tempProcessor, tempMemory, tempMonitor, Brand.valueOf("0"));
                    computers[i] = tempComp;
                }


            }
        }

    }
}
