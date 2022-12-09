package ru.mirea.practice.task2;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        System.out.println("This is phone");
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public String getNumber(String number) {
        return number;
    }

    public double getWeight() {
        return weight;
    }

    public String receiveCall(String name) {
        return "Звонит {" + name + "}";
    }

    public String receiveCall(String name, String number) {
        return "Звонит {" + name + "}" + "\n" + number;
    }

    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.println("Оправить сообщение по номеру " + number);
        }
    }

    @Override
    public String toString() {
        return "Phone: " + getModel() + "\t" + getNumber() + "\t" + getWeight();
    }

}
