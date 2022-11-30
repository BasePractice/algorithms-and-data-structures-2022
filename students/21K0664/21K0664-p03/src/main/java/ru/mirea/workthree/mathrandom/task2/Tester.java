package ru.mirea.workthree.mathrandom.task2;

public class Tester {
    private final int a;
    private final Circle[] arr;

    Tester(int a) {
        this.a = a;
        this.arr = new Circle[a];
    }

    public void setCircle(Circle k, int z) {
        this.arr[z] = k;
    }

    public double getbig() {
        double max = 0;
        for (Circle circle : arr) {
            if (circle.getR() > max) {
                max = circle.getR();
            }
        }
        return max;
    }

    public double getsmall() {
        double min = arr[0].getR();
        for (Circle circle : arr) {
            if (circle.getR() < min) {
                min = circle.getR();
            }
        }
        return min;
    }

    public void sort() {
        for (int i = 0; i < this.a - 1; i++) {
            for (int j = 1; j < this.a; j++) {
                if (this.arr[i].getR() > this.arr[j].getR()) {
                    Circle buff = this.arr[j];
                    this.arr[j] = this.arr[i];
                    this.arr[i] = buff;
                }
            }
        }
    }

    @Override
    public String toString() {
        System.out.println("\n");
        for (int i = 0; i < this.a; i++) {
            System.out.println("{" + this.arr[i].toString() + "}");
        }
        return " ";
    }
}