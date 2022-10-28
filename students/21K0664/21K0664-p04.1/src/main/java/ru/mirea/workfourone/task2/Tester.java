package ru.mirea.workfourone.task2;

abstract class Tester {
    public static void main(String[] args) {
        Phone a = new Phone("89034562341", "IPhone 2", 124.5);
        Phone b = new Phone("89389427563", "IPhone 13", 511.4);
        Phone c = new Phone("89928752374", "IPhone 10", 623);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c + "\n");

        System.out.println(a.receiveCall("Максим"));
        System.out.println(b.receiveCall("Антон", "89343245678"));
        System.out.println(c.receiveCall("Иван" + "\n"));

        System.out.println(a.getNumber());
        System.out.println(b.getNumber());
        System.out.println(c.getNumber() + "\n");

        String[] d = {"891238768732", "891238768732"};
        int i = 0;
        while (i < d.length) {
            System.out.println(a.sendMessage(d)[i]);
            i++;
        }
    }
}
