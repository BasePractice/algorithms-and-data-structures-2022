package ru.mirea.workfourone.task10;

public abstract class Test {
    public static void main(String[] args) {
        Car a = new Car();
        System.out.println("Цена для одного пассажира: " + a.price(100));
        System.out.println("Время в часах: " + a.time(100));
        Airplane b = new Airplane();
        System.out.println("Цена для одного пассажира: " + b.price(100));
        System.out.println("Время в часах: " + b.time(100));
        Ship c = new Ship();
        System.out.println("Цена для одного пассажира: " + c.price(100));
        System.out.println("Время в часах: " + c.time(100));
        Train d = new Train();
        System.out.println("Цена для одного пассажира: " + d.price(100));
        System.out.println("Время в часах: " + d.time(100));
    }
}
