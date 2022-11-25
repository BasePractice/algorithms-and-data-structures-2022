package ru.mirea.worktwo.task3;

public final class Tester {
    private Tester() {
    }

    public static Circle[] arrCircle;
    public static int N;

    public static void main(String[] args) {
        Circle a = new Circle(1.3, 2.5, 6);
        N = 3;
        arrCircle = new Circle[N];
        arrCircle[0] = a;
        Circle b = new Circle(0.0, 0.0, 4.6);
        arrCircle[1] = b;
        Circle c = new Circle(150.5, 12.0, 1.2);
        arrCircle[2] = c;
        System.out.println(arrCircle[0]);
        System.out.println(arrCircle[1]);
        System.out.println(arrCircle[2]);
    }
}
