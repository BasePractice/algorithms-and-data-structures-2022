package ru.mirea.practice.subchapter.task2;

public class Phone {
    private String model;
    private int number;
    private double weight;

    public String receiveCall(String name, int numberC) {
        return name + " calls";
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

    public void sendMessage(int[] arr) {
        int n = 1;
        for (int a : arr) {
            System.out.println(n + ": " + a);
            n++;
        }
    }

    public Phone(String m, int n) {
        this.number = n;
        this.model = m;
    }

}
