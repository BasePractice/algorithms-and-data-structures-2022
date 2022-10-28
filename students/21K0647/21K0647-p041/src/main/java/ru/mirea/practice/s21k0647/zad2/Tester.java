package ru.mirea.practice.s21k0647.zad2;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("3-93-21", "001", 100);
        Phone phone2 = new Phone("3-18-22", "002", 98);
        Phone phone3 = new Phone("3-21-15", "003", 90);
        System.out.println(phone1 + "\n" + phone2 + "\n" + phone3);
        System.out.println(phone1.receiveCall("Bob") + " " + phone1.getNumber());
        System.out.println(phone2.receiveCall("Mia") + " " + phone2.getNumber());
        System.out.println(phone3.receiveCall("Peter") + " " + phone3.getNumber());
        Phone phone4 = new Phone();
        System.out.println(phone4.receiveCall("Bob", "3-22-71"));
        phone4.sendMessage("3-19-21", "3-15-21", "3-55-99");


    }
}
