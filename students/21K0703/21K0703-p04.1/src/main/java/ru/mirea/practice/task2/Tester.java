package ru.mirea.practice.task2;

public abstract class Tester {
    public static void main(String[] args) {
        Phone first = new Phone("+79374979840", "IPhone X", 300);
        Phone second = new Phone("+79456782345", "Samsung Galaxy S20");
        Phone third = new Phone();

        System.out.println(first.receiveCall("Владос"));
        System.out.println(second.receiveCall("Саша", "+7293786723"));
        System.out.println(third.receiveCall("Глеб", first.getNumber()));

        first.sendMessage("+79568345678", "+78574561235", "+75473854908");
    }
}
