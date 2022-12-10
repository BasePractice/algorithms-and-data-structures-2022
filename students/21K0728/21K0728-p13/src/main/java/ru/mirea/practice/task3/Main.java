package ru.mirea.practice.task3;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Address newAddress = new Address();
        newAddress.setSplit("Country, Region, Town, Street, Building, Entrance, Flat");
        System.out.println(newAddress);
        newAddress.setToken("Russia; Yaroslawskaya Oblast; Yaroslawl; Lenina st.; 156; 8; 456");
        System.out.println(newAddress);
    }
}
