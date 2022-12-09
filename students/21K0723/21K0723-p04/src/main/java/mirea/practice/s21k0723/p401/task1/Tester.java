package mirea.practice.s21k0723.p401.task1;

public abstract class Tester {
    public static void main(String[] args) {
        Shape shapeCircle = new Circle(3, "желтый");
        System.out.println("Площадь круга: " + shapeCircle.getArea());
        System.out.println("Периметр круга: " + shapeCircle.getPerimeter());
        System.out.println("Тип круга: " + shapeCircle.getType());

        Shape shapeRectangle = new Rectangle(7, 8);
        System.out.println("Площадь прямоуг: " + shapeRectangle.getArea());
        System.out.println("Периметр прямоуг: " + shapeRectangle.getPerimeter());
        System.out.println("Тип прямоуг: " + shapeRectangle.getType());

        Shape shapeSquare = new Square(15);
        System.out.println("Площадь квадрата: " + shapeSquare.getArea());
        System.out.println("Периметр квадрата: " + shapeSquare.getPerimeter());
        System.out.println("Тип квадрата: " + shapeSquare.getType());
    }
}