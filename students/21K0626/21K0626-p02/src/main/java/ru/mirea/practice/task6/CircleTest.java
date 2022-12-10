package ru.mirea.practice.task6;

public abstract class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.0);
        Circle c2 = new Circle(4.0);
        c1.sravCirclle(c2);
        System.out.println(c1.plCircle());
        System.out.println(c1.dlinCircle());
    }
}
