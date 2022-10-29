package ru.mirea.workfourone.task1;

public class Tester {
    public static void main(String[] args) {
        Circle a = new Circle(14.25);
        Rectangle b = new Rectangle(53.48, 28.239);
        Square c = new Square(15.824);

        System.out.println("Area is " + a.getArea());
        System.out.println("Perimiter is " + a.getPerimeter());
        System.out.println("Type is " + a.getType());
        System.out.println(a + "\n");

        System.out.println("Area is " + b.getArea());
        System.out.println("Type is " + b.getType());
        System.out.println("Perimiter is " + b.getPerimeter());
        System.out.println(b + "\n");

        System.out.println("Area is " + c.getArea());
        System.out.println("Perimiter is " + c.getPerimeter());
        System.out.println("Type is " + c.getType());
        System.out.println(c);
    }
}
