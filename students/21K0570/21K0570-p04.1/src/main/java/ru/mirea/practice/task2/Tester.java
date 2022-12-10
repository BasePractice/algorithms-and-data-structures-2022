package ru.mirea.practice.task2;

public abstract class Tester {
    public static void main(String[] args) {
        Phone phone1 = new Phone(8800554, "M-01");
        Phone phone2 = new Phone(8988123, "M-02", 100);
        phone1.receiveCall("Andrew", "8(800)555-35-35");
        phone2.receiveCall("Sister");
        phone1.sendMessage(8800554);

        System.out.println(phone2);
    }
}
