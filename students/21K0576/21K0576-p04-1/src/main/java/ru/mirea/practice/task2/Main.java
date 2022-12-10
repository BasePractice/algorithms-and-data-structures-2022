package ru.mirea.practice.task2;

abstract class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Phone p3 = new Phone();
        System.out.println("num=" + p1.number + " model=" + p1.model + " weight=" + p1.weight);
        System.out.println("num=" + p2.number + " model=" + p2.model + " weight=" + p2.weight);
        System.out.println("num=" + p3.number + " model=" + p3.model + " weight=" + p3.weight);

        p1.receiveCall("call1");
        p2.receiveCall("call2");
        p3.receiveCall("call3");
        p1.getNumber();
        p2.getNumber();
        p3.getNumber();

        p1.receiveCall("another_him", "+7(777)666-19-84");
        p2.sendMessage("Сообщение-рассылка", "89284", "122", "919", "абонент");
    }
}
