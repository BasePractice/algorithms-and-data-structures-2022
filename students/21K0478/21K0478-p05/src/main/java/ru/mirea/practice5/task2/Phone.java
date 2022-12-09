package ru.mirea.practice5.task2;

public class Phone {
    public int number;

    public String model;

    public int weight;

    String name = "Mace"; // Имя звонящего

    public Phone(int a, String b) {

        number = a;

        model = b;

    }

    public Phone() {
        number = 2;
        model = "Iphone";
    }

    public void receiveCall() {

        System.out.println("Звонит " + name);

    }

    public void receiveCall(String name, int num) {

        System.out.println("Звонит " + name + "\n" + num);

    }

    public void getNumber() {

        System.out.println(number);

    }

    public void sendMessage(int num1, int num2) {

        System.out.println(num1 + "\n" + num2);

    }
}
