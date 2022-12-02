package ru.mirea.practice.subchapter.task2;

public class Phone {
    private String model;
    private int number;
    private double weight;

    public String receiveCall(String name, int n) {
        return "Звонит " + name + " (" + n + ")";
    }

    public int getNumber() {
        return number;
    }

    public Phone(String m, int n, double w) {
        this.number = n;
        this.model = m;
        this.weight = w;
        new Phone(m, n);
    }

    public Phone(String m, int n) {
        this.number = n;
        this.model = m;
    }

    public Phone() {
        this.number = 00000000000;
    }

    public void sendMessage(int[] arr) {
        for (int a = 0; a < arr.length; a++) {
            System.out.println(a+1 + ": " + arr[a]);
        }
    }


}
