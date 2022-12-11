package ru.mirea.practice.task1;

abstract class Tester {
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        Shape circ = new Circle();
        Shape squa = new Square();

        System.out.println(rect);
        System.out.println(circ);
        System.out.println(squa);

        System.out.println(circ.getArea() + " <-- Circle");
    }
}
