package ru.mirea.practice.task2;

public class Phone {
    String number = "none";
    String model = "default";
    float weight = 200.f;

    Phone() {}
    Phone(String number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }
    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    void receiveCall(String name) {
        System.out.println(name + " звонит.");
    }

    String getNumber() {
        return this.number;
    }

    void receiveCall(String name, String number) {
        System.out.println(name + " звонит с номера " + number);
    }

    void sendMessage(String message, String... numbers) {
        System.out.println("Рассылка сообщения \"" + message + "\" на эти номера:");
        for (String i : numbers) {
            System.out.println(i);
        }
    }
}
