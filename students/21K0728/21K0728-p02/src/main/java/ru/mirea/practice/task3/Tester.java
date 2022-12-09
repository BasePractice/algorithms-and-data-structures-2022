package ru.mirea.practice.task3;

abstract class Tester {
    public static void main(String[] args) {
        Point point = new Point(3, 5);
        circle_1 = new Circle(new Point(1, 23), 45);
        circle_2 = new Circle(6, 6, 6);
        circle_3 = new Circle(new Point(14, 5), 91);
        circle_4 = new Circle(point, 7);
        Circle[] arr = new Circle[]{circle_1, circle_2, circle_3, circle_4};
        for (Circle circ : arr) {
            System.out.println(circ);
            System.out.println("\n");
        }
    }
}
