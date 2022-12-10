package ru.mirea.practice.task3;

abstract class Tester {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1, 23, 45);
        Circle circle2 = new Circle(6, 6, 6);
        Circle circle3 = new Circle(14, 5, 91);
        Circle circle4 = new Circle(3, 5, 7);
        Circle[] arr = new Circle[]{circle1, circle2, circle3, circle4};
        for (Circle circ : arr) {
            System.out.println(circ);
            System.out.println("\n");
        }
    }
}
