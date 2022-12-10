package ru.mirea.practice.task6;

public final class Circle2Test {
    private Circle2Test() {
    }

    public static void main(String[] args) {
        Circle2 circle21 = new Circle2(32.5, 12.3, 7.8);
        Circle2 circle22 = new Circle2(13.4, 15.6, 9);
        System.out.println(circle21.getLength());
        System.out.println(circle22.getSquare());
        System.out.println(circle21.isEquals(circle22));
    }
}
