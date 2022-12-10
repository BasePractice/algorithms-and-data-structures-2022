package ru.mirea.practice.task2and3;

public class Phone {
    private final String number;
    private final String model;
    private double weight;

    public Phone() {
        number = null;
        model = null;
        weight = 75;
    }

    public Phone(String number, String model) {
        weight = 75;
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this.weight = weight;
        this.number = number;
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String receiveCall(String caller) {
        return "Звонит " + caller;
    }

    public String receiveCall(String caller, String number) {
        return "Звонит " + caller + " " + number;
    }

    public String[] sendMessage(String... strings) {
        return strings;
    }

}
