package ru.mirea.workfourone.task2;

public class Phone {
    private String number;
    private String model;
    private double weight;

    Phone() {
    }

    Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        Phone a = new Phone(number, model);
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public String receiveCall(String name) {
        return "Звонит " + name;
    }

    public String receiveCall(String name, String number) {
        return "Звонит " + name + " с номера телефона: " + number;
    }

    public String getNumber() {
        return number;
    }

    public String[] sendMessage(String... number) {
        return number;
    }

    public String toString() {
        return "Phone:{Number: " + number + ", Model: " + model + ", Weight: " + weight + "}";
    }

}