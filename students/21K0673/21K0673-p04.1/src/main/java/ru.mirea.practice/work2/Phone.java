package ru.mirea.practice.work2;

public class Phone {
    private String number;
    private String model;
    private double weight;

    Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
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

    @Override
    public String toString() {
        return "Phone:{Number: " + number + ", Model: " + model + ", Weight: " + weight + "}";
    }
}
