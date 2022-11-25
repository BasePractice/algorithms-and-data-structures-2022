package ru.mirea.workthree.mathrandom.task2;

abstract class Test {
    public static void main(String[] args) {
        Point point = new Point(35, 24);
        Circle a = new Circle(point, Math.random());
        Circle b = new Circle(point, Math.random());
        Circle c = new Circle(point, Math.random());

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Tester arr = new Tester(3);
        arr.setCircle(a, 0);
        arr.setCircle(b, 1);
        arr.setCircle(c, 2);

        System.out.println(arr.getbig());
        System.out.println(arr.getsmall());

        arr.sort();

        System.out.println(arr);
    }
}
