package ru.mirea.practice.s21k0647.zad2;

public class Phone {
    String number;
    String model;
    double weight;

    Phone() {
        number = "";
        model = "";
        weight = 0;
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String receiveCall(String name) {
        return "Звонит " + name;
    }

    public String receiveCall(String name, String number) {
        return "Звонит " + name + " " + number;
    }

    public void sendMessage(String... numbers) {
        for (String x: numbers) {
            System.out.println(x);
        }
    }

    public String getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return "Number: " + this.number + " Model: " + this.model + " Weight: " + this.weight;
    }



}
