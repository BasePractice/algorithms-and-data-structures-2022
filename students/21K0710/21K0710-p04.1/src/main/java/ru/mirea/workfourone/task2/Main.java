package ru.mirea.workfourone.task2;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        Phone a = new Phone("89123145385", "A", 128.3);
        Phone b = new Phone("89265263589", "B", 150.7);
        Phone c = new Phone("89237678265", "C", 115.9);
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        a.getNumber();
        b.getNumber();
        c.getNumber();
        String name = "John";
        a.receiveCall(name);
        a.receiveCall(name, b.getNumber());
        a.sendMessage(b.getNumber() + " " + c.getNumber() + " " + a.getNumber());
    }
}
