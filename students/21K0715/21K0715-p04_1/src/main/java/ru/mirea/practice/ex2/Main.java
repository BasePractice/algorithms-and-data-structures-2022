package ru.mirea.practice.ex2;

public final class Main {
    private Main() {
    }

    public static void main(final String[] args) {
        Phone p1 = new Phone("123", "Samsung Galaxy S20", 0.553);
        Phone p2 = new Phone("3232", "Samsung Galaxy A10", 0.534);
        Phone p3 = new Phone("87987", "LG G4", 0.444);
        Phone[] phones = {p1, p2, p3};
        for (Phone phone: phones) {
            System.out.println(phone);
        }
        System.out.println();
        for (Phone phone: phones) {
            phone.receiveCall("Jimm");
            System.out.println(phone.getNumber());
            System.out.println();
        }
        p1.receiveCall("Jodi", "3892813");
        System.out.println();
        p2.sendMessage("I like it", "1233","42345","984308");
    }
}
