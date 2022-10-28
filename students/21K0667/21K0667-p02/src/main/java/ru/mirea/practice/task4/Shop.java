package ru.mirea.practice.task4;


import java.util.Scanner;

abstract class Shop {

    public static void addComputer(Computer[] arr) {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < arr.length; i++) {
                Computer comp = new Computer();
                System.out.println("CPU: ");
                comp.setCpu(sc.nextLine());
                System.out.println("RAM: ");
                comp.setRam(sc.nextLine());
                System.out.println("GPU: ");
                comp.setGraphicCard(sc.nextLine());
                System.out.println("Number: ");
                comp.setNumber(sc.nextLine());
                arr[i] = comp;
            }
        }
    }

    public static void deleteComputer(Computer[] arr) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Number: ");
            String deleteNumber = sc.nextLine();
            for (Computer computer : arr) {
                if (computer.getNumber().equals(deleteNumber)) {
                    computer.setNumber(" ");
                    computer.setCpu(" ");
                    computer.setRam(" ");
                    computer.setGraphicCard(" ");

                }
            }
        }
    }




    public static void searching(Computer[] list) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter number: ");
            String number = sc.next();

            for (Computer searching : list) {
                if (searching.getNumber().equals(number)) {
                    searching.print();
                }
            }
        }
    }


    public static void show(Computer[] list) {
        for (Computer computer : list) {
            System.out.println(computer.getNumber());
            System.out.println(computer.getCpu());
            System.out.println(computer.getGraphicCard());
            System.out.println(computer.getRam());
            System.out.println();
        }
    }
}

