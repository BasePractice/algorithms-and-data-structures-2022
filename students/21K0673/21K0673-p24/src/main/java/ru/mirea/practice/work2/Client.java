package ru.mirea.practice.work2;

public class Client {
    private Chair chair;

    public void sit() {
        System.out.println("Sits");
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        System.out.println("Sets");
    }
}
