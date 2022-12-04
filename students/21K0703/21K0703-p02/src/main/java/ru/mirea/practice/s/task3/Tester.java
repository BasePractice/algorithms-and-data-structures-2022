package ru.mirea.practice.s.task3;

public class Tester {
    public static void main(String[] args) {
        Point point = new Point(5, 3);
        Circle circle1 = new Circle(new Point(4, 3), 5);
        Circle circle2 = new Circle(new Point(8, 6), 4);
        Circle circle3 = new Circle(new Point(3, 3), 9);
        Circle circle4 = new Circle(new Point(2, 0), 7);
        Circle circle5 = new Circle(point, 10);

        Tester tester = new Tester(new Circle[]{circle1, circle2, circle3, circle4, circle5});
        System.out.printf("Point cordinates: {%d, %d}", point.getX(), point.getY());

        System.out.println("\nArray size: " + tester.getSize());
        tester.allCircles();

    }

    private final Circle[] array;

    public int getSize() {
        return array.length;
    }

    public Tester(Circle[] array) {
        this.array = array;
    }

    public void allCircles() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + ": " + array[i]);
        }
    }
}
