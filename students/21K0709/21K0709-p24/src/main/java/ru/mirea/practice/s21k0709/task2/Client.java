package ru.mirea.practice.s21k0709.task2;

public class Client {
    private Chair chair;

    public void sit() {
        if (chair.isSiting()) {
            System.out.println("Сижу");
        } else {
            System.out.println("Не сижу");
        }
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

}
