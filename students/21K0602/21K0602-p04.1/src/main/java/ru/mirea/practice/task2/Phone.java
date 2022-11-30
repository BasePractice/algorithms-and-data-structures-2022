package ru.mirea.practice.task2;

public class Phone {
    private final String number;
    private final String model;
    private double weight;

    public Phone() {

        number = null;
        model = null;
        weight = 100;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        weight = 100;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public String receiveCall(String caller) {
        return "Звонит" + caller;
    }

    public String receiveCall(String caller, String number) {
        return "Звонит" + caller + " : " + number;
    }


    public String[] sendMessage(String... numbers) {
        return numbers;
    }

}
