package ru.mirea.worktwo.task3;

abstract class Tester {
    private final int a;
    private final Circle[] arr;

    Tester(int a, Circle[] arr) {
        this.a = a;
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "a:" + a + "arr:" + arr[0];
    }

    public static void main(String[] args) {
        Point b = new Point(35, 24);
        Circle a = new Circle(b, 56);

        System.out.println(a);
    }
}
