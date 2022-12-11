package ru.mirea.practice.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Address address1 = new Address();
        address1.subAddressSplit("Россия, 77, Москва, Лобачевского, 88, 703");
        System.out.println(address1);
        Address address2 = new Address();
        address2.subAddressToken("Узбекистан; 58; Башкарстан; Авылахай; 15; 42");
        System.out.println(address2);
        Address address3 = new Address();
        address3.subAddressToken("Россия. 61. Ростов-на-Дону. Набережная. 6. 38");
        System.out.println(address3);
        Address address4 = new Address();
        address4.subAddressToken("Россия, 62, Краснодар, Пальцева, 12, 4");
        System.out.println(address4);
    }
}
