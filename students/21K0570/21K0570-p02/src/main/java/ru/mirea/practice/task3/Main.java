package ru.mirea.practice.task3;

public abstract class Main {
    public static void main(String[] args) {
        Tester tester = new Tester();
        Circle circle1 = new Circle();
        circle1.setCenter(new Point(4.1, 5.0));
        circle1.setRad(20);
        tester.addCircle(circle1);
        Circle circle2 = new Circle();
        circle2.setCenter(new Point(-5.3, 1.2));
        circle2.setRad(5);
        tester.addCircle(circle2);
        tester.print();
    }
}
