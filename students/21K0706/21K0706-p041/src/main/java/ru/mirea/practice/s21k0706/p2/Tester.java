package ru.mirea.practice.s21k0706.p2;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("1-23-45", "0001", 100);
        Phone phone2 = new Phone("6-78-09", "0002", 98);
        Phone phone3 = new Phone("2-26-93", "0003", 90);
        System.out.println(phone1 + "\n" + phone2 + "\n" + phone3);
        System.out.println(phone1.receiveCall("Anna") + " " + phone1.getNumber());
        System.out.println(phone2.receiveCall("Petr") + " " + phone2.getNumber());
        System.out.println(phone3.receiveCall("Mikhail") + " " + phone3.getNumber());
        Phone phone4 = new Phone();
        System.out.println(phone4.receiveCall("Anna", "5-36-41"));
        phone4.sendMessage("3-77-26", "9-75-30", "4-32-12");


    }
}
