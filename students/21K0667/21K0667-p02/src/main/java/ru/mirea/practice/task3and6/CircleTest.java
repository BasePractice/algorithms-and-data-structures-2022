package ru.mirea.practice.task3and6;

abstract class CircleTest {
    public static void main(String[] args) {
        Point begin = new Point(0, 0);

        Circle circle1 = new Circle(begin, 10);

        Circle circle2 = new Circle();

        System.out.println(circle1.square() + " " + circle2.square());
        System.out.println(circle1.lenght() + " " + circle2.lenght());

        circle2.setCenter(1, 1);
        circle2.setRadius(2);

        System.out.println(circle2.square());
        System.out.println(circle2.lenght());
    }

}


