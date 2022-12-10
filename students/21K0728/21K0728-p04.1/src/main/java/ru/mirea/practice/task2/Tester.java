package ru.mirea.practice.task2;

public abstract class Tester {
    public static void main(String[] args) {
        Phone first = new Phone("+79993571488", "IPhone ZV", 357);
        Phone second = new Phone("+79243456789", "Samsung SS22");
        Phone third = new Phone();

        System.out.println(first.receiveCall("Хохол"));
        System.out.println(second.receiveCall("DEMON", "+79832354433"));
        System.out.println(third.receiveCall("Сеня Меф", first.getNumb()));

        first.sendMessage("+79564456789", "+78323512354", "+38328471014");
    }
}
