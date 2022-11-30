package ru.mirea.practice.task2;

import java.util.Arrays;

public abstract class Tester {
    public static void main(String[] args) {
        Phone phone1 = new Phone("89673440532", "Iphone 12", 180.7f);
        Phone phone2 = new Phone("84996542300", "Pixel 7", 190.2f);
        Phone phone3 = new Phone("89006437675", "Xiaomi mi9", 210.6f);

        System.out.println(phone1.receiveCall("Максим"));
        System.out.println(phone2.receiveCall("Антон", "89204434999"));
        System.out.println(phone3.receiveCall("Chechna" + "\n"));

        String[] numbers = {"89184494099", "89334732956", "89359567840"};
        System.out.println(Arrays.toString(phone1.sendMessage(numbers)));
    }
}
