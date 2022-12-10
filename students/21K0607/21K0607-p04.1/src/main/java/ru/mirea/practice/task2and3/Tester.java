package ru.mirea.practice.task2and3;

public abstract class Tester {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("84957546621", "iPhone 12544");
        Phone phone3 = new Phone("86378846721", "Samsa 13", 1500);
        System.out.println(phone1.receiveCall("Кирилл"));
        System.out.println(phone2.receiveCall("Олег", "88005553535"));
        System.out.println(phone3.receiveCall("Настя", phone2.getNumber()));
        String[] phoneBook = phone1.sendMessage("84957546621", "86378846721", "88005553535");
        for (String string : phoneBook) {
            System.out.println(string);
        }
    }
}
