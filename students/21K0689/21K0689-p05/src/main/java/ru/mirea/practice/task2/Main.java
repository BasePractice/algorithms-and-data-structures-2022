package ru.mirea.practice.task2;

public abstract class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone("991238900123", "sss", 3);
        Phone p2 = new Phone("99192939", "skkskd", 2.5);
        Phone p3 = new Phone("6240", "government", 100);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println("-----------------------");
        System.out.println(p1.receiveCall("Jorik"));
        System.out.println(p1.getNumber("165123145"));
        System.out.println("-----------------------");
        System.out.println(p2.receiveCall("James"));
        System.out.println(p1.getNumber("888818823"));
        System.out.println("-----------------------");
        System.out.println(p1.receiveCall("Adam"));
        System.out.println(p1.getNumber("9129393188"));
        System.out.println("-----------------------");
        System.out.println(p1.receiveCall("Bulls", "12332415"));
        System.out.println("-----------------------");
        p2.sendMessage("123123123", "123818283", "18283812838", "7127371738", "1231234", "123771273");

    }
}
