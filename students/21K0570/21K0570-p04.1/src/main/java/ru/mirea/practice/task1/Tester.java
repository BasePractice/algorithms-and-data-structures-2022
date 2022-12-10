package ru.mirea.practice.task1;

public abstract class Tester {
    public static void main(String[] args) {
        Shape one = new Circle(5, "yellow");
        System.out.println(one.getType() + " area: " + one.getArea() +
        ", perimeter:"  + one.getPerimeter());

        Shape two = new Rectangle(3, 6, 1, "Green");
        System.out.println(two.getType() + " area: " + two.getArea() +
        ", perimeter: " + two.getPerimeter());

        Shape three = new Square(4, "blue");
        System.out.println(three.getType() + " area: " + three.getArea() +
        ", perimeter: " + three.getPerimeter());
    }
}
