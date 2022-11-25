package ru.mirea.practice.solutiontask6;

public final class CircleTest {
    private CircleTest() {}

    public static void main(String[] args) {
        Circle third = new Circle(6, 3, 2);

        System.out.println(third.getArea());
        System.out.println(third.getLength());
        System.out.println(third.getR());

        third.setR(5);
        Circle first = new Circle(5, 2, 3);
        Circle second = new Circle(10, 4, 6);
        if (third.equal(first)) {
            System.out.println("Радиусы равны");
        }

        if (first.biggest(second)) {
            System.out.println("Радиус окружности second меньше first");
        }

        System.out.println(first);
    }
}
