package ru.mirea.practice.work2;

abstract class Main {
    public static void main(String[] args) {
        Phone a = new Phone("89034562341", "IPhone 2", 34.5);
        Phone b = new Phone("89389427563", "IPhone 32", 435.4);
        Phone c = new Phone("89928752374", "IPhone 1", 164.9);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a.receiveCall("Григорий"));
        System.out.println(b.receiveCall("Мария", "89343245678"));
        System.out.println(c.receiveCall("Зенаида"));
        System.out.println(a.getNumber());
        System.out.println(b.getNumber());
        System.out.println(c.getNumber());
        String[] d = {"891238768732", "891238768732"};
        int i = 0;
        while (i < d.length) {
            System.out.println(a.sendMessage(d)[i]);
            i++;
        }
    }
}
