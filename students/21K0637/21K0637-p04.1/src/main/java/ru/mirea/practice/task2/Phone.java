package ru.mirea.practice.task2;

public class Phone {
    private final String number;
    private final String model;
    private float weight;

    public Phone(String number, String model, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public float getWeight() {
        return weight;
    }

    public String receiveCall(String callerName) {
        return "Звонит " + callerName;
    }

    public String receiveCall(String callerName, String callerNumber) {
        return "Звонит " + callerName + ": " + callerNumber;
    }

    public String[] sendMessage(String... number) {
        return number;
    }
}
