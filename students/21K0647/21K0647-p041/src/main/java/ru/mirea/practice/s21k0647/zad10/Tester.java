package ru.mirea.practice.s21k0647.zad10;

public final class Tester {
    private Tester() {

    }

    public static void main(String[] args) {
        Transport[] transports = new Transport[4];
        transports[0] = new Auto(20, 80, "Груз");
        transports[1] = new Plane(1.3, 700, "Пассажир");
        transports[2] = new Train(4, 90, "Пассажир");
        transports[3] = new Ship(37, 45, "Пассажир");
        System.out.println(transports[0] + "\nСтоимость: " + transports[0].cost(450) + "\nВремя: " + transports[0].time(450));
        System.out.println(transports[1] + "\nСтоимость: " + transports[1].cost(3200) + "\nВремя: " + transports[1].time(3200));
        System.out.println(transports[2] + "\nСтоимость: " + transports[2].cost(450) + "\nВремя: " + transports[2].time(450));
        System.out.println(transports[3] + "\nСтоимость: " + transports[3].cost(160) + "\nВремя: " + transports[3].time(160));

    }
}
