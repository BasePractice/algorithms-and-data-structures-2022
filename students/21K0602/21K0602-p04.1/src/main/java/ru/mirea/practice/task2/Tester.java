package ru.mirea.practice.task2;

public abstract class Tester {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("89642526168", "Xiaomi mi 6");
        Phone phone3 = new Phone("89562517340", "Iphone 11", 250);
        System.out.println(phone1.receiveCall("Никита"));
        System.out.println(phone2.receiveCall("Влад", phone2.getNumber()));
        System.out.println(phone3.receiveCall("Антон"));
        String[] numbers = phone1.sendMessage("88005553535", "88435674567", "89003452827");
        for (String number : numbers) {
            System.out.println(number);
        }

    }

}
