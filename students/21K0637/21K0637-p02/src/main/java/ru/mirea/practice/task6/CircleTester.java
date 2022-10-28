package ru.mirea.practice.task6;

public class CircleTester {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10, 4, 6);
        Circle circle2 = new Circle(4, 6, 1);
        Circle circle3 = new Circle(6, 5, 2);

        System.out.println(circle1.getRadius());
        System.out.println(circle2.getSquare());
        System.out.println(circle3.getLength());
        System.out.println(circle2.compareTo(circle3));

        System.out.println("Сравнение");
        switch (circle1.compareTo(circle2)) {
            case 1:
                System.out.println("Окружность 1 больше");
                break;
            case -1:
                System.out.println("Окружность 2 больше");
                break;
            default:
                System.out.println("Окружности равны");
        }
    }
}
