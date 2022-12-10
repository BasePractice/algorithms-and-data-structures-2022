package ru.mirea.practice.task2;

public class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone (int number, String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone (int number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {
        this.model = "";
        this.number = 0;
        this.weight = 0;
    }

    public int getNumber() {
        return number;
    }

    public void receiveCall (String name) {
        System.out.println(name + " is calling.");
    }

    public void receiveCall(String name, String number) {
        System.out.println(number + "\t — " + name + " is calling.");
    }

    public void sendMessage(int number){
        System.out.println("The message was sent to " + number);
    }

    public void sendMessage(int[] number) {
        System.out.println("The message was sent to ");
        for (int i : number) {
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return "Number: " + number + ", model: " + model + ", weight: " + weight;
    }
}
