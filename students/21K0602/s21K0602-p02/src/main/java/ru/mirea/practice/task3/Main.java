package ru.mirea.practice.task3;

public class Main {
    public static void main(String[] args) {
        Tester test=new Tester();
        test.addCircle(new Circle(150 ,10,106));
        test.addCircle(new Circle(1230 ,13,101));
        test.addCircle(new Circle(10 ,12,120));
        test.addCircle(new Circle(120 ,11,103));
        test.addCircle(new Circle(160 ,8,10));
        test.printCircles();

    }
}
