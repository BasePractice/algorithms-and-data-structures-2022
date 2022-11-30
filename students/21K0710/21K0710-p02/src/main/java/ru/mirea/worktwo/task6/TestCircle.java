package ru.mirea.worktwo.task6;

public final class TestCircle {
    private TestCircle() {
    }

    public static void main(String[] args) {
        Circle a = new Circle(5.6);
        Circle b = new Circle(2.1);
        Circle c = new Circle(5.6);
        a.compare(b);
        a.compare(c);
        b.compare(c);
    }
}
