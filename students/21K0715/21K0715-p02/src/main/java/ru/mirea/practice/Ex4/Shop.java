package ru.mirea.practice.Ex4;

import java.util.Arrays;
import java.util.Scanner;

public class Shop {
    Computer[] computers;

    public Shop() {
        System.out.println("Input a quantity of computers:");
        Scanner scanner = new Scanner(System.in);
        int computersQuantity = scanner.nextInt();
        this.computers = new Computer[computersQuantity];
        System.out.println("Enter computer names separated by a space:");
        for (int i=0;i<computersQuantity;i++) {
            this.computers[i] = new Computer(scanner.next());
        }
    }

    public void add(Computer computer) {
        Computer[] newComputers = new Computer[computers.length+1];
        System.arraycopy(computers, 0, newComputers, 0, computers.length);
        newComputers[computers.length] = computer;
        computers = newComputers;
    }

    public void remove(int i) {
        Computer[] newComputers = new Computer[computers.length-1];
        System.arraycopy(computers, 0, newComputers, 0, i);
        System.arraycopy(computers, i+1, newComputers, i, computers.length-1-i);
        computers = newComputers;
    }

    public int find(String name) {
        for (int i=0;i<computers.length;i++) {
            if (name.equals(computers[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "computers=" + Arrays.toString(computers) +
                '}';
    }
}
