package ru.mirea.practice.task2;

import java.util.Scanner;


public class Phone {

    public int number;

    public String model;

    public int weight;

    String name = "Mace"; // Имя звонящего

    public void receiveCall() {

        System.out.println("Звонит " + name);

    }

    public void receiveCall(String name, int num) {

        System.out.println("Звонит " + name + "\n" + num);

    }

    public void getNumber() {

        System.out.println(number);

    }

    public void sendMessage(int num1, int num2) {

        System.out.println(num1 + "\n" + num2);

    }

    public Phone(int a, String b, int c) {

        number = a;

        model = b;

        weight = c;

    }

    public Phone(int a, String b) {

        number = a;

        model = b;

    }


    static int getNum() {

        try (Scanner num = new Scanner(System.in)) {

            return num.nextInt();

        }
    }

    static String getStr() {

        try (Scanner str = new Scanner(System.in)) {

            return str.nextLine();

        }
    }

    public static void main(String [ ] args) {

        Phone ph1 = new Phone(123,"xyaw");

        System.out.print("Введите номер 1-го телефона: ");

        ph1.number = getNum();

        System.out.print("Введите его модель: ");

        ph1.model = getStr();

        System.out.print("Вес: ");

        ph1.weight = getNum();

        System.out.print("Введите номер 2-го телефона: ");
        Phone ph2 = new Phone(19,"iphone");
        ph2.number = getNum();

        System.out.print("Введите его модель: ");

        ph2.model = getStr();

        System.out.print("Вес: ");

        ph2.weight = getNum();

        System.out.print("Введите номер 3-го телефона: ");
        Phone ph3 = new Phone(8800,"samsung");
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

        ph1 = new Phone(ph1.number, ph1.model, ph1.weight);

        ph2 = new Phone(ph2.number, ph2.model);
        Phone ph = new Phone(0,"domofon");
        ph.receiveCall(ph1.name, ph2.number);

        ph.sendMessage(ph1.number, ph2.number);

    }

}