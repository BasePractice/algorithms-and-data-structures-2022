package ru.mirea.practice.ex2;

public class Phone {
    private final String number;
    private final String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0.5;
    }

    public Phone() {
        this.number = "0";
        this.model = "Some model";
        this.weight = 0.5;
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

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling");
    }

    public void receiveCall(String name, String number) {
        System.out.println(number);
        System.out.println(name + " is calling");
    }

    public void sendMessage(String message, String... numbers) {
        for (String number: numbers) {
            System.out.println(number);
        }
    }

}
