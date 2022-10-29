package ru.mirea.practice.task4;

import java.util.Scanner;

public class Shop implements Input {

    private Computer[] arr;

    void addComputer(Computer c) {
        Computer[] newArr = new Computer[this.arr.length + 1];

        for (int i = 0;i < this.arr.length;i++) {
            newArr[i] = this.arr[i];
        }

        newArr[newArr.length - 1] = c;

        this.arr = newArr;
    }

    void deleteComputer(int number) {
        for (int i = number - 1;i < this.arr.length;i++) {
            if ((i + 1) < this.arr.length) {
                this.arr[i] = this.arr[i + 1];
            }
        }

        Computer[] newArr = new Computer[this.arr.length - 1];
        for (int i = 0;i < this.arr.length - 1;i++) {
            newArr[i] = this.arr[i];
        }

        this.arr = newArr;
    }

    void searchComputer(String name) {
        int count = 0;

        for (int i = 0;i < arr.length;i++) {
            if (arr[i].getName().equals(name)) {
                count++;
                System.out.println("Компьютер " + name + " присутствует, номер: " + (i + 1) + '\n' + arr[i].toString());
            }
        }

        if (count == 0) {
            System.out.println("Компьютер '" + name + "' не найден.");
        }
    }

    @Override
    public void input(Scanner sc) {
        System.out.println("Задайте количество компьютеров");

        int n = sc.nextInt();

        this.arr = new Computer[n];

        for (int i = 0;i < arr.length;i++) {
            arr[i] = new Computer(" ");
        }

        System.out.println("Проинициализируйте массив компьютеров:");

        for (int i = 0;i < n;i++) {
            System.out.println("№" + (i + 1) + '\n' + "Name:");
            sc = new Scanner(System.in);
            arr[i].setName(sc.nextLine());
            System.out.println("CPU:");
            arr[i].setCpu(sc.nextLine());
            System.out.println("Motherboard:");
            arr[i].setMotherboard(sc.nextLine());
            System.out.println("RAM:");
            arr[i].setRam(sc.nextLine());
            System.out.println("HDD:");
            arr[i].setHdd(sc.nextLine());
            System.out.println("VideoCard:");
            arr[i].setVideoCard(sc.nextLine());
        }
    }

    @Override
    public String toString() {
        String s = "ToString: ";

        for (int i = 0;i < arr.length;i++) {
            s += this.arr[i].toString() + "; ";
        }

        return s;
    }
}
