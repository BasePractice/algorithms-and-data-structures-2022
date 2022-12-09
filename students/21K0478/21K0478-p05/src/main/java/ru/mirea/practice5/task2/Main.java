package ru.mirea.practice5.task2;

import java.util.Scanner;

abstract  class Main {

    static int getNum() {

        try (Scanner num = new Scanner(System.in)) {
            num.close();

            return num.nextInt();

        }
    }

    static String getStr() {

        try (Scanner str = new Scanner(System.in)) {
            str.close();

            return str.nextLine();

        }
    }

    public static void main(String[] args) {


        System.out.print("Введите номер 1-го телефона: ");
        Phone ph1 = new Phone();

        ph1.number = getNum();

        System.out.print("Введите его модель: ");

        ph1.model = getStr();

        System.out.print("Вес: ");

        ph1.weight = getNum();

        System.out.print("Введите номер 2-го телефона: ");
        Phone ph2 = new Phone();

        ph2.number = getNum();

        System.out.print("Введите его модель: ");

        ph2.model = getStr();

        System.out.print("Вес: ");

        ph2.weight = getNum();

        System.out.print("Введите номер 3-го телефона: ");
        Phone ph3 = new Phone();

        ph3.number = getNum();

        System.out.print("Введите его модель: ");

        ph3.model = getStr();

        System.out.print("Вес: ");

        ph3.weight = getNum();

        System.out.println(ph1.number + " " + ph1.model + " " + ph1.weight);

        System.out.println(ph2.number + " " + ph2.model + " " + ph2.weight);

        System.out.println(ph3.number + " " + ph3.model + " " + ph3.weight);

        System.out.println();

        ph1.receiveCall();

        ph1.getNumber();

        System.out.println();

        ph2.receiveCall();

        ph2.getNumber();

        System.out.println();

        ph3.receiveCall();

        ph3.getNumber();

        ph2 = new Phone(ph2.number, ph2.model);
        Phone ph = new Phone();


        ph.receiveCall(ph1.name, ph2.number);

        ph.sendMessage(ph1.number, ph2.number);

    }

}
